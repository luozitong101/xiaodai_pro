package lzt.xiaodai.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.EasyUiDataGird;
import lzt.xiaodai.cn.common.PageResult;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TContact;
import lzt.xiaodai.cn.entity.TItem;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TContactService;
import lzt.xiaodai.cn.service.TItemService;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.tool.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/api/tContact")
public class TContactController {

    @Autowired
    TContactService tContactService;

    @RequestMapping(path = "/q/{infoid}",method = RequestMethod.GET)
    @ResponseBody
    public EasyUiDataGird queryAll(@PathVariable Integer infoid){
        QueryWrapper<TContact> q = new QueryWrapper<>();
        q.eq("infoid",infoid);
        List<TContact> list = tContactService.list(q);
        EasyUiDataGird es = new EasyUiDataGird();
        es.setTotal(list.size());
        es.setRows(list);
        return es;
    }

}
