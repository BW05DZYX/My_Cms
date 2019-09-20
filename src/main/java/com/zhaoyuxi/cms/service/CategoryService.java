package com.zhaoyuxi.cms.service;

import java.util.List;

import com.zhaoyuxi.cms.entity.Category;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:38:35
*类功能说明
*/
public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
