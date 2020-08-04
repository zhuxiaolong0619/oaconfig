package com.zxl.mapper;

import com.zxl.entity.Aoamailnumber;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoamailnumberMapper {
    long countByExample(AoamailnumberExample example);

    int deleteByExample(AoamailnumberExample example);

    int deleteByPrimaryKey(Long mailNumberId);

    int insert(Aoamailnumber record);

    int insertSelective(Aoamailnumber record);

    List<Aoamailnumber> selectByExample(AoamailnumberExample example);

    Aoamailnumber selectByPrimaryKey(Long mailNumberId);

    int updateByExampleSelective(@Param("record") Aoamailnumber record, @Param("example") AoamailnumberExample example);

    int updateByExample(@Param("record") Aoamailnumber record, @Param("example") AoamailnumberExample example);

    int updateByPrimaryKeySelective(Aoamailnumber record);

    int updateByPrimaryKey(Aoamailnumber record);
}