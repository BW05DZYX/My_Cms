package com.zhaoyuxi.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhaoyuxi.cms.entity.Channel;
import com.zhaoyuxi.cms.service.ChannelService;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:34:24
*类功能说明
*/
@Controller
public class IndexController {
	
	private Logger log = Logger.getLogger(IndexController.class);
	
	@Autowired
	ChannelService cService;
	
	@RequestMapping(value= {"/index","/",""},method=RequestMethod.GET)
	public String index(HttpServletRequest request) {
		
		log.info("this is log test");
		
		List<Channel> channels = cService.getChannels();
		request.setAttribute("channels", channels);
	
		return "index/index";
	}
	
}
