package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.entity.TRegister;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.service.TRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * app 用户注册表 前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/tRegister")
public class TRegisterController {

    @Autowired
    TRegisterService tRegisterService;

    @Autowired
    TProjectService tProjectService;

    @GetMapping("/login")
    @ResponseBody
    public ResultInfo login(String mobile,String password){
        QueryWrapper<TRegister> condition = new QueryWrapper<>();
        condition.eq("phone",mobile);
        condition.eq("password",password);
        TRegister one = tRegisterService.getOne(condition);
        ResultInfo resultInfo = new ResultInfo();
        if (one != null){
            QueryWrapper<TProject> cnd = new QueryWrapper<>();
            cnd.eq("mobile",mobile);
            List<TProject> list = tProjectService.list(cnd);
            List<TProjectVo> tProjectVos = tProjectService.gettProjectVos(list);
            resultInfo.setCode(200);
            resultInfo.setMessage("success");
            resultInfo.setRet(tProjectVos);
        }else {
            resultInfo.setCode(405);
            resultInfo.setMessage("用户名或者密码不正确");
        }

        return resultInfo;
    }
    @PostMapping("/register")
    @ResponseBody
    public ResultInfo register(@RequestBody TRegister tRegister){
        ResultInfo resultInfo = new ResultInfo();
        QueryWrapper<TRegister> condition = new QueryWrapper<>();
        condition.eq("phone",tRegister.getPhone());
        TRegister one = tRegisterService.getOne(condition);
        if (one == null){
            //register
            boolean save = tRegisterService.save(tRegister);
            if (save){
                resultInfo.setCode(200);
                resultInfo.setMessage("success");
            }else {
                resultInfo.setCode(500);
                resultInfo.setMessage("服务异常,稍后重试");
            }
        }else {
            resultInfo.setCode(300);
            resultInfo.setMessage("该用户已经注册");
        }
        return resultInfo;
    }
}
