package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TAuthBank;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TAuthBankService;
import lzt.xiaodai.cn.service.TProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/27 14:45
 * @Description:
 */
@RestController
public class StepFourController {
    @Autowired
    TAuthBankService authBankService;
    @Autowired
    TProjectService tProjectService;
    @PostMapping("/put/step4")
    public ResultInfo handlerBankData(@RequestBody TAuthBank tAuthBank, @RequestParam String mobile){
        authBankService.save(tAuthBank);
        Integer bankid = tAuthBank.getId();
        QueryWrapper<TProject> queryWrapper = new QueryWrapper();
        queryWrapper.eq("mobile",mobile);
        List<TProject> list = tProjectService.list(queryWrapper);
        for (TProject tProject : list) {
            tProject.setAuthbankid(bankid);
            tProject.setPhaseid(4);
            tProjectService.updateById(tProject);
        }
        return ResultInfo.ok();
    }
}
