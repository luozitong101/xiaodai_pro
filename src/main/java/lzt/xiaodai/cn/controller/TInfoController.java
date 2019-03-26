package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.entity.TImage;
import lzt.xiaodai.cn.entity.TInfo;
import lzt.xiaodai.cn.mapper.TInfoMapper;
import lzt.xiaodai.cn.service.TInfoService;
import lzt.xiaodai.cn.tool.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 个人信息包括职业信息社会关系 前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/tInfo")
public class TInfoController {
    @Autowired
    TInfoService infoService;
    @Autowired
    TInfoMapper infoMapper;
    @RequestMapping(value = "/users/infos" ,method = RequestMethod.GET)
    @ResponseBody
    public EasyUiDataGird<TInfo> requestInfos(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "") String mobile){
        QueryWrapper<TInfo> condition = new QueryWrapper<>();

        if ("".equals(mobile)){
            condition = null;
        }else {
            condition.eq("mobile",mobile);
        }
        EasyUiDataGird<TInfo> pageResult = PageHelper.getPageResult(Long.parseLong(page), Long.parseLong(rows), infoMapper, condition);
        return pageResult;
    }


}
