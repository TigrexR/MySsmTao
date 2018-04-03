package com.taotao.mapper;

import com.taotao.pojo.TbItem_cat;
import com.taotao.pojo.TbItem_catExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItem_catMapper {
    int countByExample(TbItem_catExample example);

    int deleteByExample(TbItem_catExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem_cat record);

    int insertSelective(TbItem_cat record);

    List<TbItem_cat> selectByExample(TbItem_catExample example);

    TbItem_cat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem_cat record, @Param("example") TbItem_catExample example);

    int updateByExample(@Param("record") TbItem_cat record, @Param("example") TbItem_catExample example);

    int updateByPrimaryKeySelective(TbItem_cat record);

    int updateByPrimaryKey(TbItem_cat record);
}