package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TInfo;
import lzt.xiaodai.cn.entity.TInfoExample;
import org.apache.ibatis.annotations.Param;

public interface TInfoMapper {
    long countByExample(TInfoExample example);

    int deleteByExample(TInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TInfo record);

    int insertSelective(TInfo record);

    List<TInfo> selectByExample(TInfoExample example);

    TInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TInfo record, @Param("example") TInfoExample example);

    int updateByExample(@Param("record") TInfo record, @Param("example") TInfoExample example);

    int updateByPrimaryKeySelective(TInfo record);

    int updateByPrimaryKey(TInfo record);
}