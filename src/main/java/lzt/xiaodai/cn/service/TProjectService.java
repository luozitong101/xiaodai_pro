package lzt.xiaodai.cn.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import lzt.xiaodai.cn.common.TProjectVo;
import lzt.xiaodai.cn.entity.TProject;

import java.util.List;

/**
 * <p>
 * 对应用户的所有借款信息  服务类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
public interface TProjectService extends IService<TProject> {
    /**
     *
     * @return
     */
     List<TProjectVo> queryProject(long page, long rows, BaseMapper<TProject> mapper, Wrapper<TProject> wrapper);


     List<TProjectVo> gettProjectVos(List<TProject> list);
}
