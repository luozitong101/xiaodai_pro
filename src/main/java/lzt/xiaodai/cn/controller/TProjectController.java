package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.entity.vo.Pending;
import lzt.xiaodai.cn.mapper.TProjectMapper;
import lzt.xiaodai.cn.service.TProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 对应用户的所有借款信息  前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/api/tProject")
public class TProjectController {

    @Autowired
    TProjectService tProjectService;
    @Autowired
    TProjectMapper projectMapper;
    @RequestMapping(value = "/xd/pros")
    @ResponseBody
    public EasyUiDataGird<TProjectVo> requestTProject(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "")String mobile){
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        if ("".equals(mobile)){
            condition = null;
        }else{
            condition.eq("mobile",mobile);
        }
        List<TProjectVo> tProjectVos = tProjectService.queryProject(Long.parseLong(page),Long.parseLong(rows),projectMapper,condition
        );
        return new EasyUiDataGird<>(tProjectVos,tProjectVos.size());
    }

    /**
     * 待审核
     * @param rows
     * @param page
     * @param mobile
     * @return
     */
    @RequestMapping(value = "/xd/pending")
    @ResponseBody
    public EasyUiDataGird<Pending> requestPending(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "")String mobile){
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        if ("".equals(mobile)){
            condition = null;
        }else{
            condition.eq("mobile",mobile);
        }
        return new EasyUiDataGird<>(tProjectService.queryPending(Long.parseLong(page),Long.parseLong(rows),projectMapper,condition));
    }

    /**
     * 已放款
     */
    @RequestMapping(value = "/xd/lending")
    @ResponseBody

    public EasyUiDataGird<Pending> requestlending(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "")String mobile) {
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        if ("".equals(mobile)) {
            condition = null;
        } else {
            condition.eq("mobile", mobile);
            condition.eq("phaseid", "7");
        }
        return new EasyUiDataGird<>(tProjectService.queryPending(Long.parseLong(page), Long.parseLong(rows), projectMapper, condition));

    }

    /**
     * 已还款
     */
    @RequestMapping(value = "/xd/beenpayment")
    @ResponseBody
    public EasyUiDataGird<Pending> requestBeenPay(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "")String mobile) {
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        if ("".equals(mobile)) {
            condition = null;
        } else {
            condition.eq("mobile", mobile);
            condition.eq("phaseid", "8");
        }
        return new EasyUiDataGird<>(tProjectService.queryPending(Long.parseLong(page), Long.parseLong(rows), projectMapper, condition));

    }

    /**
     * 已拒
     */
    @RequestMapping(value = "/xd/refuse")
    @ResponseBody

    public EasyUiDataGird<Pending> requestRefuse(@RequestParam(defaultValue = "5") String rows , @RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "")String mobile) {
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        if ("".equals(mobile)) {
            condition = null;
        } else {
            condition.eq("mobile", mobile);
            condition.eq("phaseid", "9");
        }
        return new EasyUiDataGird<>(tProjectService.queryPending(Long.parseLong(page), Long.parseLong(rows), projectMapper, condition));

    }
}
