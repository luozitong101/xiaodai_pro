package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.PageResult;
import lzt.xiaodai.cn.common.jwt.JwtPlayHoler;
import lzt.xiaodai.cn.common.jwt.annotation.UserLoginToken;
import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.mapper.TAdminMapper;
import lzt.xiaodai.cn.service.TAdminService;
import lzt.xiaodai.cn.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;


/**
 * <p>
 * 管理员列表 前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/tAdmin")
public class TAdminController {
    @Autowired
    TAdminService adminService;
    @Autowired
    TokenService tokenService;
    @Autowired
    TAdminMapper adminMapper;
    private static final Logger logger = LoggerFactory.getLogger(TAdminController.class);


    @UserLoginToken
    @RequestMapping(value="/qp/{current}/{pagesize}",method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    @ResponseBody
    public IPage<TAdmin> queryPage2(@PathVariable Integer current,@PathVariable Integer pagesize){
        logger.info(current+"/"+pagesize);
        current = current == null ? 1 : current;
        pagesize = pagesize == null ? 5 : pagesize;
        Page<TAdmin> page = new Page<>(current,pagesize);
        IPage<TAdmin> tAdminIPage = adminMapper.selectPage(page, null);
        return tAdminIPage;
    }
    @RequestMapping(path = "/users/login",method = RequestMethod.POST)
    @ResponseBody
    public PageResult<TAdmin> login(@RequestBody TAdmin admin){

        TAdmin one = adminService.getOne(new QueryWrapper<>(admin));
        if (one != null){
            JwtPlayHoler holer = new JwtPlayHoler();
            holer.setId(one.getId());
            holer.setPassword(one.getPassword());
            String token = tokenService.getToken(holer);
            PageResult ret = PageResult.build();
            ret.setToken(token);
            ret.setRet(one);
            return ret;
        }else {
            return PageResult.build().failed();
        }
    }
    @UserLoginToken
    @RequestMapping(value = ("users/admins"),method = RequestMethod.GET)
    @ResponseBody
    public EasyUiDataGird<TAdmin> requestAdmins(){
        List<TAdmin> list = adminService.list();
        return new EasyUiDataGird<>(list,list.size());
    }

}
