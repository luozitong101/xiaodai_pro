package lzt.xiaodai.cn.common.filter;

import lzt.xiaodai.cn.common.Constant;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author luoyong
 * @Date: 2019/3/29 15:01
 * @Description:
 */
//@Component
public class RestApiFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String token = request.getParameter("token");
        if (token == null){
            response.getWriter().write("no permission");
            return;
        }else {
            if ( token.equals(Constant.API_KEY)){
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                response.getWriter().write("no permission");
                return;
            }

        }
    }

    @Override
    public void destroy() {

    }
}
