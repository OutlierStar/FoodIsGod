package dao;

import bean.Restaurant;
import bean.RestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestaurantMapper {
    long countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExample(RestaurantExample example);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);
}