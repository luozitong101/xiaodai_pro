package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TRegister;
import lzt.xiaodai.cn.entity.TRegisterExample;
import org.apache.ibatis.annotations.Param;

public interface TRegisterMapper {
    long countByExample(TRegisterExample example);

    int deleteByExample(TRegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRegister record);

    int insertSelective(TRegister record);

    List<TRegister> selectByExample(TRegisterExample example);

    TRegister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TRegister record, @Param("example") TRegisterExample example);

    int updateByExample(@Param("record") TRegister record, @Param("example") TRegisterExample example);

    int updateByPrimaryKeySelective(TRegister record);

    int updateByPrimaryKey(TRegister record);
}