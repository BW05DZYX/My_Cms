package com.zhaoyuxi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.zhaoyuxi.cms.entity.Channel;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:34:56
*类功能说明
*/
@Mapper
public interface ChannelMapper {

	/**
	 * 查询所有频道
	 * @return
	 */
	@Select("select * from cms_channel order by id")
	@ResultType(Channel.class)
	List<Channel> getChannels();
	
}
