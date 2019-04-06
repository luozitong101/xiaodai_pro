package lzt.xiaodai.cn;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author luoyong
 */
@SpringBootApplication
@MapperScan(value = "lzt.xiaodai.cn.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppProApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProApplication.class, args);
    }

    /**
     * 分页查件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }


//    @Bean
//    public FilterRegistrationBean apiFilter(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        RestApiFilter apiFilter = new RestApiFilter();
//        filterRegistrationBean.setFilter(apiFilter);
//        List<String> urls =  new ArrayList<>();
//        urls.add("/*");
//        filterRegistrationBean.setUrlPatterns(urls);
//        return filterRegistrationBean;
//
//    }

}
