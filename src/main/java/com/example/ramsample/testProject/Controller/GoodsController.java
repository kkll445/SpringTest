package com.example.ramsample.testProject.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ramsample.testProject.Domain.Goods;
import com.example.ramsample.testProject.Service.GoodsService;



@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
    @GetMapping("/sample1")
    public @ResponseBody String sample1() {
       System.out.println("test");
       return "test";
    }
    
    
	/**
	 * '/' 또는 '/index' 요청이 get 방식으로 들어왔을 때 index로 연결한다.
	 */
    @GetMapping("/")
    public String Mainindex() {
       
       return "index";
    }

        
    @GetMapping("/selectGoodsByGoodsId")
    public String selectGoodsByGoodsId() {
    	
    	 Goods goods = goodsService.selectGoodsByGoodsId();
    	
    	return "index";
    }
    
    @GetMapping("/selectAllGoods")
    public String selectAllGoods(Model model) {
    	
    	 List<Goods> allGoods = goodsService.selectAllGoods();
    	 
    	 model.addAttribute("goods", allGoods);
    	
    	return "showGoods";
    }

    
    @GetMapping("/join")
    public String shwGoodsForm() {
    	
    	return "joinForm";
    } 
    @PostMapping("/newgoods")
    public String insertGoodsForm( HttpServletRequest httpServletRequest , Goods goods) {
    

    	Goods goods2 = new Goods();
    	
    	goods2.setGoodsName(httpServletRequest.getParameter("goodsName"));
    	goods2.setGoodsPrice(httpServletRequest.getParameter("goodsPrice"));
    	goods2.setRmk(httpServletRequest.getParameter("rmk"));
    	goods2.setInpt_id("TEST");
    	goods2.setUpdt_id("TEST");
    	
    	System.out.println("goodsPrice ============   " + goods2.getGoodsName());
    	
    	goodsService.insertGoods(goods2);
    	return "redirect:/";
    }      

}
