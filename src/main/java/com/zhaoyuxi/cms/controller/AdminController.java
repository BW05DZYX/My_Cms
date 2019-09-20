package com.zhaoyuxi.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:44:33
*类功能说明
*/
@Controller
@RequestMapping("admin")
public class AdminController {
	
	@GetMapping("index")
	public String index() {
		return "admin/index";
	}

}
