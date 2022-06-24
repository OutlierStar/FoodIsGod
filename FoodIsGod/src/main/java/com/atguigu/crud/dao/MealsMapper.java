package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Meals;
import com.atguigu.crud.bean.MealsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MealsMapper {
    long countByExample(MealsExample example);

    int deleteByExample(MealsExample example);

    int deleteByPrimaryKey(Integer mealsId);

    int insert(Meals record);

    int insertSelective(Meals record);

    List<Meals> selectByExample(MealsExample example);

    Meals selectByPrimaryKey(Integer mealsId);

    int updateByExampleSelective(@Param("record") Meals record, @Param("example") MealsExample example);

    int updateByExample(@Param("record") Meals record, @Param("example") MealsExample example);

    int updateByPrimaryKeySelective(Meals record);

    int updateByPrimaryKey(Meals record);
}