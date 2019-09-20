package com.zhaoyuxi.cms.service;

import java.util.List;

import com.zhaoyuxi.cms.entity.Article4Vote;
import com.zhaoyuxi.cms.entity.VoteStatic;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月20日 下午1:38:09
*类功能说明
*/
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}

