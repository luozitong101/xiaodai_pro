package lzt.xiaodai.cn.controller.test;


import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyong
 */
@RestController
public class TestController {
    @Autowired
    TAdminMapper tAdminMapper;

    @RequestMapping(value = "/test/",method = RequestMethod.GET)
    public TAdmin getAdmin(){

        return tAdminMapper.selectByPrimaryKey(1);
    }
}
