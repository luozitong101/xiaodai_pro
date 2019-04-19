package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TContact;
import lzt.xiaodai.cn.entity.TIdentity;
import lzt.xiaodai.cn.entity.TInfo;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/26 19:51
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class StepThreeController {
    @Autowired
    TInfoService tInfoService;
    @Autowired
    TProjectService tProjectService;
    @Autowired
    TPhaseService tPhaseService;
    @Autowired
    TContactService tContactService;
    @Autowired
    TIdentityService tIdentityService;
    @PostMapping("/put/step3")
    public ResultInfo handlerStep3(@RequestParam String mobile, @RequestBody TInfo tInfo){
        tInfoService.save(tInfo);
        List<TContact> contacts = tInfo.getContacts();
        if (contacts != null){
            for (TContact contact : contacts) {
                contact.setInfoid(tInfo.getId());
            }
            tContactService.saveBatch(contacts);
        }

        Integer identityId = null;
        TInfo one = tInfoService.getOne(new QueryWrapper<>(tInfo));
        QueryWrapper<TProject> condition = new QueryWrapper<>();
        condition.eq("mobile",mobile);
        List<TProject> list = tProjectService.list(condition);
        for (TProject project : list){
            project.setInfoid(one.getId());
            project.setPhaseid(3);
            if (identityId == null){
                identityId = project.getIdentityid();
            }
            tProjectService.updateById(project);
        }
        //关联真实姓名到tinfo表字段extends1
        if (identityId != null){
            TIdentity ide = tIdentityService.getById(identityId);
            if (ide != null){
                tInfo.setExtends1(ide.getRealname());
            }
            tInfoService.updateById(tInfo);
        }
        return ResultInfo.ok(tProjectService.gettProjectVos(list));
    }

}
