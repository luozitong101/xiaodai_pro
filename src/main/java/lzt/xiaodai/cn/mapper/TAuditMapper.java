package lzt.xiaodai.cn.mapper;

import java.util.List;
import lzt.xiaodai.cn.entity.TAudit;
import lzt.xiaodai.cn.entity.TAuditExample;
import org.apache.ibatis.annotations.Param;

public interface TAuditMapper {
    long countByExample(TAuditExample example);

    int deleteByExample(TAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAudit record);

    int insertSelective(TAudit record);

    List<TAudit> selectByExample(TAuditExample example);

    TAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAudit record, @Param("example") TAuditExample example);

    int updateByExample(@Param("record") TAudit record, @Param("example") TAuditExample example);

    int updateByPrimaryKeySelective(TAudit record);

    int updateByPrimaryKey(TAudit record);
}