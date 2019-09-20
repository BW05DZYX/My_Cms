package com.zhaoyuxi.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoyuxi.cms.dao.ChannelMapper;
import com.zhaoyuxi.cms.entity.Channel;
import com.zhaoyuxi.cms.service.ChannelService;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:39:49
*类功能说明
*/
@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelMapper.getChannels();
	}
	

}
