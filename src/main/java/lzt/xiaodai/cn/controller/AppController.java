package lzt.xiaodai.cn.controller;

import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.jwt.annotation.PassToken;
import lzt.xiaodai.cn.entity.TApp;
import lzt.xiaodai.cn.mapper.TAppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyong
 * @Date: 2019/4/10 11:54
 * @Description: 获取app版本号
 */
@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    TAppMapper tAppMapper;

    @PassToken
    @GetMapping("/app/version")
    public ResultInfo getAppVersion(){
        TApp tApp = tAppMapper.selectOne(null);
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setRet(tApp);
        return resultInfo;
    }
}
