package lzt.xiaodai.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author luoyong
 */
@SpringBootApplication
@MapperScan(value = "lzt.xiaodai.cn.mapper")
@EnableTransactionManagement
public class AppProApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProApplication.class, args);
    }

  //  @Bean


}
