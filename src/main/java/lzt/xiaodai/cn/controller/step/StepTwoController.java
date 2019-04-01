package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TIdentity;
import lzt.xiaodai.cn.entity.TPhase;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TIdentityService;
import lzt.xiaodai.cn.service.TPhaseService;
import lzt.xiaodai.cn.service.TProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/26 11:58
 * @Description:
 */
@RestController
public class StepTwoController {

    @Autowired
    TIdentityService identityService;
    @Autowired
    TProjectService tProjectService;
    @Autowired
    TPhaseService tPhaseService;
    @PostMapping("/put/step2")
    public ResultInfo step2(@RequestBody TIdentity identity, @RequestParam String mobile){
        QueryWrapper<TIdentity> condition = new QueryWrapper<>(identity);
        TIdentity one = identityService.getOne(condition);
        List<TProjectVo> vos = null;
        if (one == null){
            identityService.save(identity);
            QueryWrapper<TProject> wrapper = new QueryWrapper<>();
            wrapper.eq("mobile",mobile);
            List<TProject> list = tProjectService.list(wrapper);
            for (TProject t : list){
                t.setIdentityid(identity.getId());
                t.setPhaseid(2);
                tProjectService.updateById(t);

            }
             vos = tProjectService.gettProjectVos(list);
        }
        return ResultInfo.ok(vos);
    }
}
