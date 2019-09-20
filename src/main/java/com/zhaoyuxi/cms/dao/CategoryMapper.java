package com.zhaoyuxi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zhaoyuxi.cms.entity.Category;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:34:49
*类功能说明
*/
@Mapper
public interface CategoryMapper {

	@Select("select id,name,channel_id channelId from cms_category where channel_id = #{value} ")
	List<Category> getCategoryByChId(Integer cid);

}
