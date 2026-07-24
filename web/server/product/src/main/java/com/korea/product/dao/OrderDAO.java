package com.korea.product.dao;

import org.apache.ibatis.annotations.Mapper;

import com.korea.product.vo.OrderVO;

@Mapper
public interface OrderDAO {

	int createOrder(OrderVO vo);

}
