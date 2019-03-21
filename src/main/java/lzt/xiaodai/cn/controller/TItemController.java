package lzt.xiaodai.cn.controller;


import lzt.xiaodai.cn.common.PageResult;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TItem;
import lzt.xiaodai.cn.service.TItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Controller
@RequestMapping("/tItem")
public class TItemController {

    @Autowired
    TItemService itemService;

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

}
