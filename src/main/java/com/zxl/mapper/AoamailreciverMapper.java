package com.zxl.mapper;

import com.zxl.entity.Aoamailreciver;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoamailreciverMapper {
    long countByExample(AoamailreciverExample example);

    int deleteByExample(AoamailreciverExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Aoamailreciver record);

    int insertSelective(Aoamailreciver record);

    List<Aoamailreciver> selectByExample(AoamailreciverExample example);

    Aoamailreciver selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Aoamailreciver record, @Param("example") AoamailreciverExample example);

    int updateByExample(@Param("record") Aoamailreciver record, @Param("example") AoamailreciverExample example);

    int updateByPrimaryKeySelective(Aoamailreciver record);

    int updateByPrimaryKey(Aoamailreciver record);
}