package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TIdentity;
import lzt.xiaodai.cn.entity.TIdentityExample;
import org.apache.ibatis.annotations.Param;

public interface TIdentityMapper {
    long countByExample(TIdentityExample example);

    int deleteByExample(TIdentityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TIdentity record);

    int insertSelective(TIdentity record);

    List<TIdentity> selectByExample(TIdentityExample example);

    TIdentity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TIdentity record, @Param("example") TIdentityExample example);

    int updateByExample(@Param("record") TIdentity record, @Param("example") TIdentityExample example);

    int updateByPrimaryKeySelective(TIdentity record);

    int updateByPrimaryKey(TIdentity record);
}