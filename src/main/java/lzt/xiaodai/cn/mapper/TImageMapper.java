package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TImage;
import lzt.xiaodai.cn.entity.TImageExample;
import org.apache.ibatis.annotations.Param;

public interface TImageMapper {
    long countByExample(TImageExample example);

    int deleteByExample(TImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TImage record);

    int insertSelective(TImage record);

    List<TImage> selectByExample(TImageExample example);

    TImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TImage record, @Param("example") TImageExample example);

    int updateByExample(@Param("record") TImage record, @Param("example") TImageExample example);

    int updateByPrimaryKeySelective(TImage record);

    int updateByPrimaryKey(TImage record);
}