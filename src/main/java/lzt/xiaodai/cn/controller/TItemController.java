package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.PageResult;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.common.jwt.annotation.PassToken;
import lzt.xiaodai.cn.entity.TItem;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TItemService;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.tool.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/api/tItem")
public class TItemController {

    @Autowired
    TItemService itemService;
    @Autowired
    TProjectService tProjectService;

    @RequestMapping(path = "/qa",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryAll(){
        List<TItem> list = itemService.list();

        return ResultInfo.ok(list);
    }


    @RequestMapping(path = "/qa1",method = RequestMethod.GET)
    @ResponseBody
    public PageResult query1(){
        List<TItem> list = itemService.list();

        return PageResult.build().ok(list);
    }

    @PostMapping("/put/notfirst")
    @ResponseBody
    public ResultInfo againBorrow(@RequestParam String mobile, @RequestParam Integer itemid,@RequestBody Map<String,String> item){
        TItem tem =new TItem();
        tem.setDay(Integer.parseInt(item.get("dayType")));
        tem.setMoney(Integer.parseInt(item.get("moneyType")));
        tem.setCharge(Double.parseDouble(item.get("totalMoney")));
        TItem tItem = CommonUtil.parseItem(tem);
        tItem.setRefund(LocalDate.now());
        tItem.setExtends1(CommonUtil.getRetAccount(new Date(),tItem.getDay()));
        itemService.save(tItem);

        QueryWrapper<TProject> q = new QueryWrapper<>();
        q.eq("mobile",mobile);
        q.eq("itemid",itemid);
        TProject one = tProjectService.getOne(q);

        one.setId(null);
        one.setItemid(tItem.getId());
        one.setPhaseid(5);
        tProjectService.save(one);
        List<TProject> list = new ArrayList<>();
        list.add(one);
        List<TProjectVo> tProjectVos = tProjectService.gettProjectVos(list);
        return ResultInfo.ok(tProjectVos);
    }

}
