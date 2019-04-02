package lzt.xiaodai.cn.common;

import lzt.xiaodai.cn.common.jwt.inteceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author luoyong
 * @Date: 2019/4/1 23:26
 * @Description: 添加jwt拦截器配置让spring容器去管理
 */
//@Configuration
//public class InterceptorConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**");
//    }
//
//    @Bean
//    public AuthenticationInterceptor authenticationInterceptor(){
//        return new AuthenticationInterceptor();
//    }

    public class InterceptorConfig {

    }
