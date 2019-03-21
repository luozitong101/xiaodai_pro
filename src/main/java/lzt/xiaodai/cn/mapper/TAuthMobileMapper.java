package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TAuthMobile;
import lzt.xiaodai.cn.entity.TAuthMobileExample;
import org.apache.ibatis.annotations.Param;

public interface TAuthMobileMapper {
    long countByExample(TAuthMobileExample example);

    int deleteByExample(TAuthMobileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAuthMobile record);

    int insertSelective(TAuthMobile record);

    List<TAuthMobile> selectByExample(TAuthMobileExample example);

    TAuthMobile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAuthMobile record, @Param("example") TAuthMobileExample example);

    int updateByExample(@Param("record") TAuthMobile record, @Param("example") TAuthMobileExample example);

    int updateByPrimaryKeySelective(TAuthMobile record);

    int updateByPrimaryKey(TAuthMobile record);
}