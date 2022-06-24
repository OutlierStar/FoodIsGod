package com.atguigu.crud.dao;

import com.atguigu.crud.bean.OrderInformation;
import com.atguigu.crud.bean.OrderInformationExample;
import com.atguigu.crud.bean.OrderInformationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInformationMapper {
    long countByExample(OrderInformationExample example);

    int deleteByExample(OrderInformationExample example);

    int deleteByPrimaryKey(OrderInformationKey key);

    int insert(OrderInformation record);

    int insertSelective(OrderInformation record);

    List<OrderInformation> selectByExample(OrderInformationExample example);

    OrderInformation selectByPrimaryKey(OrderInformationKey key);

    int updateByExampleSelective(@Param("record") OrderInformation record, @Param("example") OrderInformationExample example);

    int updateByExample(@Param("record") OrderInformation record, @Param("example") OrderInformationExample example);

    int updateByPrimaryKeySelective(OrderInformation record);

    int updateByPrimaryKey(OrderInformation record);
}