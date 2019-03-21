package lzt.xiaodai.cn.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lzt.xiaodai.cn.entity.TAdmin;
import org.apache.ibatis.annotations.Param;


public interface TAdminMapper extends BaseMapper<TAdmin> {

    IPage<TAdmin> selectPageVo(Page page, @Param("condition") QueryWrapper<TAdmin> condition);
}