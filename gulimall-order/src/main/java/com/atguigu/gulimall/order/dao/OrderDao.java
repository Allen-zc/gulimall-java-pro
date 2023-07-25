package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author allen
 * @email 103831730@qq.com
 * @date 2023-07-25 04:43:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
