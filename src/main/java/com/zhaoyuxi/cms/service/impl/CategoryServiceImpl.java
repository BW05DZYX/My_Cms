package com.zhaoyuxi.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoyuxi.cms.dao.CategoryMapper;
import com.zhaoyuxi.cms.entity.Category;
import com.zhaoyuxi.cms.service.CategoryService;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:39:34
*类功能说明
*/
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryMapper; 
	
	@Override
	public List<Category> getCategoryByChId(Integer cid) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryByChId(cid) ;
	}

}

