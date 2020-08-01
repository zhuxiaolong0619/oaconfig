package com.zxl.mapper;

import com.zxl.entity.Aoainmaillist;
import com.zxl.entity.AoainmaillistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoainmaillistMapper {
    long countByExample(AoainmaillistExample example);

    int deleteByExample(AoainmaillistExample example);

    int deleteByPrimaryKey(Long mailId);

    int insert(Aoainmaillist record);

    int insertSelective(Aoainmaillist record);

    List<Aoainmaillist> selectByExample(AoainmaillistExample example);

    Aoainmaillist selectByPrimaryKey(Long mailId);

    int updateByExampleSelective(@Param("record") Aoainmaillist record, @Param("example") AoainmaillistExample example);

    int updateByExample(@Param("record") Aoainmaillist record, @Param("example") AoainmaillistExample example);

    int updateByPrimaryKeySelective(Aoainmaillist record);

    int updateByPrimaryKey(Aoainmaillist record);
}