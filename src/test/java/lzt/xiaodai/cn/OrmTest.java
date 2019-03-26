package lzt.xiaodai.cn;

import lzt.xiaodai.cn.entity.TIdentity;
import lzt.xiaodai.cn.entity.TRegister;
import lzt.xiaodai.cn.service.TIdentityService;
import lzt.xiaodai.cn.service.TRegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author luoyong
 * @Date: 2019/3/26 23:39
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrmTest {
    @Autowired
    TIdentityService tIdentityService;

    @Autowired
    TRegisterService tRegisterService;

    @Test
    public void test(){
//        TIdentity identity = new TIdentity();
//        identity.setIdcard("3425011991111");
//        identity.setRealname("罗勇");
//        tIdentityService.save(identity);
        TRegister register = new TRegister();
        register.setPassword("12345");
        register.setPhone("15618759969");
        tRegisterService.save(register);

    }
}
