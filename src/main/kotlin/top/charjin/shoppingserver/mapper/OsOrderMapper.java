package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import top.charjin.shoppingserver.entity.OsOrder;
import top.charjin.shoppingserver.model.OsOrderModel;

import java.util.List;

public interface OsOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OsOrder record);

    int insertSelective(OsOrder record);

    OsOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OsOrder record);

    int updateByPrimaryKey(OsOrder record);

    List<OsOrderModel> selectAllOrders(@Param("user_id") int user_id);


    @Update("update os_order set order_status = #{orderStatus} where order_no = #{orderNo }")
    int updateOrderStatusByOrderNo(@Param("orderNo") String orderNo, @Param("orderStatus") int orderStatus);
}