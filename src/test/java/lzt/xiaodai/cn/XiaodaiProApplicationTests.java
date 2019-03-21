package lzt.xiaodai.cn;

import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.mapper.TAdminMapper;
import lzt.xiaodai.cn.service.TAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XiaodaiProApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(XiaodaiProApplicationTests.class);
    @Resource
    TAdminMapper adminMapper;

    @Autowired
    TAdminService adminService;
    @Test
    public void contextLoads() {
        System.out.println(new Date());
        /**
         * 日志的级别 由低到高 trace(跟踪) < debug(调试) < info(信息) < warn(警告) < error(错误)
         * 可以在配置文件中调整输出的日志级别,日志就只会在这个级别及以后的高级别生效
         * Spring Boot 默认使用info级别
         */
//        logger.trace("这是 trace 日志...");
//        logger.debug("这是 debug 日志...");
//        logger.info("这是 info 日志...");
//        logger.warn("这是 warn 日志...");
//        logger.error("这是 error 日志...");




        List<Map<String, Object>> maps = adminService.listMaps();
        logger.info(maps.toString());


    }

}
