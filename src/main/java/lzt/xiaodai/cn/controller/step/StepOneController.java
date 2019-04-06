package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TAuthMobile;
import lzt.xiaodai.cn.entity.TItem;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.entity.receive.ItemAndAuthMobile;
import lzt.xiaodai.cn.service.TAuthMobileService;
import lzt.xiaodai.cn.service.TItemService;
import lzt.xiaodai.cn.service.TPhaseService;
import lzt.xiaodai.cn.service.TProjectService;
import lzt.xiaodai.cn.tool.CommonUtil;
import lzt.xiaodai.cn.tool.DateUtilFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/25 16:08
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class StepOneController {
    @Autowired
    TItemService itemService;
    @Autowired
    TAuthMobileService authMobileService;
    @Autowired
    TProjectService tProjectService;
    @Autowired
    TPhaseService tPhaseService;

    @PostMapping("/put/step1")
    public ResultInfo handlerStep1(@RequestBody ItemAndAuthMobile sendData){
        //保存借款数据
        //保存手机认证信息
        //关联tproject 字段
        // moneytype 0 500 1 1000 2 2000 3 3000
        //daytype 0 7 1 14
        List<TProjectVo> tProjectVos = null;
        try {
            TItem item = sendData.getItem();
            Date refund = new Date();
            item.setRefund(LocalDate.now());
            item = CommonUtil.parseItem(item);
            Date hkdate = DateUtilFull.addDate(refund, 0, 0, item.getDay(), 0, 0, 0, 0);
            //设置还款日期
            item.setExtends1(DateUtilFull.parseDateToStr(hkdate,DateUtilFull.DATE_FORMAT_YYYY_MM_DD));
            boolean save = itemService.save(item);
            boolean flag = authMobileService.save(sendData.getAuthMobile());

            if (save && flag){
                TItem one = itemService.getOne(new QueryWrapper<>(sendData.getItem()));
                TAuthMobile one1 = authMobileService.getOne(new QueryWrapper<>(sendData.getAuthMobile()));
                TProject tproject = new TProject();
                tproject.setItemid(one.getId());
                tproject.setAuthmobileid(one1.getId());
                tproject.setMobile(one1.getPhone());
                tproject.setPhaseid(1);
                tProjectService.save(tproject);
                List<TProject> tps = new ArrayList<>();
                tps.add(tproject);
                tProjectVos = tProjectService.gettProjectVos(tps);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultInfo.failure();
        }
        return  ResultInfo.ok(tProjectVos);
    }




}
