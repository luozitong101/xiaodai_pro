package lzt.xiaodai.cn.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.mapper.TAdminMapper;
import lzt.xiaodai.cn.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * <p>
 * 管理员列表 服务实现类
 * </p>
 *
 * @author 来自底层程序员的仰望
 * @since 2019-03-21
 */
@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper,TAdmin> implements TAdminService {

    @Autowired
    TAdminMapper adminMapper;
    @Override
    public IPage<TAdmin> selectPageVo(Page page, QueryWrapper<TAdmin> condition) {
        return adminMapper.selectPageVo(page,condition);
    }
}
