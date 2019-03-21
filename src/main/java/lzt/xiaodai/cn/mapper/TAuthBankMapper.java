package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TAuthBank;
import lzt.xiaodai.cn.entity.TAuthBankExample;
import org.apache.ibatis.annotations.Param;

public interface TAuthBankMapper {
    long countByExample(TAuthBankExample example);

    int deleteByExample(TAuthBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAuthBank record);

    int insertSelective(TAuthBank record);

    List<TAuthBank> selectByExample(TAuthBankExample example);

    TAuthBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAuthBank record, @Param("example") TAuthBankExample example);

    int updateByExample(@Param("record") TAuthBank record, @Param("example") TAuthBankExample example);

    int updateByPrimaryKeySelective(TAuthBank record);

    int updateByPrimaryKey(TAuthBank record);
}