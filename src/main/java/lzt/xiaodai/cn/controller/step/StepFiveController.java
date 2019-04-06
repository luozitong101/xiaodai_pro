package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TItem;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TItemService;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.tool.DateUtilFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * 用户签约更新状态
 * @author luoyong
 * @Date: 2019/3/28 19:50
 * @Description:
 */

@RestController
@RequestMapping("/api")
public class StepFiveController {
    @Autowired
    TProjectService tProjectService;
    @Autowired
    TItemService itemService;
    @PostMapping("/put/sign")
    public ResultInfo updateSign(@RequestParam Integer itemid,@RequestParam String mobile){
        Wrapper<TProject> updateWrapepr = new UpdateWrapper<>();
        ((UpdateWrapper<TProject>) updateWrapepr).eq("itemid",itemid);
        ((UpdateWrapper<TProject>) updateWrapepr).eq("mobile",mobile);
        TProject tProject = new TProject();
        tProject.setPhaseid(6);
        tProjectService.update(tProject,updateWrapepr);

        QueryWrapper<TProject> qq = new QueryWrapper<>();
        qq.eq("itemid",itemid);
        qq.eq( "mobile",mobile);
        List<TProject> list = tProjectService.list(qq);
        return ResultInfo.ok(tProjectService.gettProjectVos(list));
    }

    @GetMapping("/get/step")
    public String getcurrentStep(Integer itemid,String mobile){
        QueryWrapper<TProject> q = new QueryWrapper<>();
        q.eq("itemid",itemid);
        q.eq("mobile",mobile);
        TProject one = tProjectService.getOne(q);
        Integer phaseid = one.getPhaseid();
        return phaseid+"";
    }

    /**
     * 确认放款 更新借款日期和还款日期
     *
     * 确认收款 更新收款时间
     * @param mobile
     * @param itemid
     * @param type 0 确认放款 1 确认收款
     * @return
     */
   @RequestMapping("/update/step/{type}")
    public ResultInfo updateStep(@PathVariable Integer type, String mobile, Integer itemid){
       List<TProjectVo> tProjectVos = null;
       UpdateWrapper<TProject> u = new UpdateWrapper<>();
       QueryWrapper<TProject> q = new QueryWrapper<>();
       q.eq("itemid",itemid);
       q.eq("mobile",mobile);

       u.eq("itemid",itemid);
       u.eq("mobile",mobile);
       TProject one = tProjectService.getOne(q);
       TProject tProject = new TProject();
       if(type  == 0){
           tProject.setPhaseid(7);
           //更新放款时间
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
           String date = sdf.format(new Date());
           tProject.setExtends1(date);
           tProjectService.update(tProject,u);
           //更新借款和还款日期
           List<TProject> list = new ArrayList<>();
           list.add(one);
           tProjectVos = tProjectService.gettProjectVos(list);
           if (tProjectVos != null && tProjectVos.size() > 0){
               TProjectVo vo = tProjectVos.get(0);
               TItem item = vo.getItem();
               item.setRefund(LocalDate.now());
               Date hkdate = DateUtilFull.addDate(new Date(), 0, 0, item.getDay(), 0, 0, 0, 0);
               item.setExtends1(DateUtilFull.parseDateToStr(hkdate,DateUtilFull.DATE_FORMAT_YYYY_MM_DD));
               UpdateWrapper<TItem> up = new UpdateWrapper<>();
               up.eq("id",item.getId());
               itemService.update(item,up);
           }
       }else if(type == 1){
           tProject.setPhaseid(8);
           tProject.setHkDate(new Date());
           tProjectService.update(tProject,u);

       }

        return ResultInfo.ok(tProjectVos);
    }

}
