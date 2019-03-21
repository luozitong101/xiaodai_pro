package lzt.xiaodai.cn.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import lzt.xiaodai.cn.entity.TAdmin;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 管理员列表 服务类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
public interface TAdminService extends IService<TAdmin> {

    IPage<TAdmin> selectPageVo(Page page, @Param("condition") QueryWrapper<TAdmin> condition);

}
