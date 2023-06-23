package com.example.ramsample.testProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ramsample.testProject.Domain.Goods;
import com.example.ramsample.testProject.Mapper.GoodsMapper;



@Service
public class GoodsService {
	private final GoodsMapper goodMapper;

    public GoodsService(GoodsMapper goodMapper) {
        this.goodMapper = goodMapper;
    }
    
	public Goods selectGoodsByGoodsId() {
		
		Goods goods = new Goods();
		
						
		goods =  goodMapper.selectGoodsByGoodsId();
		System.out.println("goodddddddddd ===== " + goods.getGoodsName());
		return goods;
	}
	
	public List<Goods> selectAllGoods(){
		return goodMapper.selectAllGoods();
	}
	
	
	public void insertGoods(Goods goods2) {

    	
		goodMapper.insertGoods(goods2);
	}
}
