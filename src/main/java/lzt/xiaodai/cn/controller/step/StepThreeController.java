package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TInfo;
import lzt.xiaodai.cn.entity.TPhase;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TInfoService;
import lzt.xiaodai.cn.service.TPhaseService;
import lzt.xiaodai.cn.service.TProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/26 19:51
 * @Description:
 */
@RestController
public class StepThreeController {
    @Autowired
    TInfoService tInfoService;
    @Autowired
    TProjectService tProjectService;
    @Autowired
    TPhaseService tPhaseService;
    @PostMapping("/put/step3")
    public ResultInfo handlerStep3(@RequestParam String mobile, @RequestBody TInfo tInfo){
        tInfoService.save(tInfo);
        TInfo one = tInfoService.getOne(new QueryWrapper<>(tInfo));
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        condition.eq("mobile",mobile);
        List<TProject> list = tProjectService.list(condition);
        for (TProject project : list){
            project.setInfoid(one.getId());
            project.setPhaseid(3);
            tProjectService.updateById(project);
        }
//        TPhase tPhase = new TPhase();
//        tPhase.setMobile(mobile);
//        tPhase.setPhasedesc("个人家庭信息保存完成");
//        tPhase.setPhase(3);
//        tPhaseService.save(tPhase);
        return ResultInfo.ok();
    }

}
