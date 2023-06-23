package com.example.ramsample.testProject.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Goods {

	private int goodsNo;      
	private String goodsName;    
	private String goodsPrice;   
	private String rmk;          
	private String inpt_id ;    
	private String updt_id ;     
	private String inpt_dt ;
	private String updt_dt ;
}
