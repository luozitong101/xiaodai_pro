package lzt.xiaodai.cn.controller.step;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import lzt.xiaodai.cn.common.ResultInfo;
import lzt.xiaodai.cn.entity.TProject;
import lzt.xiaodai.cn.service.TProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 用户签约更新状态
 * @author luoyong
 * @Date: 2019/3/28 19:50
 * @Description:
 */

@RestController
public class StepFiveController {
    @Autowired
    TProjectService tProjectService;
    @PostMapping("/put/sign")
    public ResultInfo updateSign(@RequestParam Integer itemid,@RequestParam String mobile){
        Wrapper<TProject> updateWrapepr = new UpdateWrapper<>();
        ((UpdateWrapper<TProject>) updateWrapepr).eq("itemid",itemid);
        ((UpdateWrapper<TProject>) updateWrapepr).eq("mobile",mobile);
        tProjectService.update(updateWrapepr);
        return ResultInfo.ok();
    }

}
