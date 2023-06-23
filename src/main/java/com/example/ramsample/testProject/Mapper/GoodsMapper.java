package com.example.ramsample.testProject.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ramsample.testProject.Domain.Goods;


@Mapper
public interface GoodsMapper {

	public Goods selectGoodsByGoodsId();
	
	public List<Goods> selectAllGoods();
	
	public void insertGoods(Goods goods2);
}
