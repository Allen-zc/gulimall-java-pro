package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author allen
 * @email 103831730@qq.com
 * @date 2023-07-25 04:15:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
