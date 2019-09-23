package com.zhaoyuxi.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhaoyuxi.cms.entity.Article;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:38:28
*类功能说明
*/
public interface ArticleService {
	
	int post(Article article);
	
	/**
	 * 分页查询后某类的文章 
	 * @param pageNum
	 * @param cid
	 * @return
	 */
	PageInfo<Article> list(Integer pageNum, Integer channelId,Integer cid);
	
//	PageInfo<Article> listByChannel(Integer pageNum,Integer cid);
	
	Article findById(Integer ArticleId);
	
	int update(Article article);
	
	/**
	 * 删除 逻辑删除
	 * @param article
	 * @return
	 */
	int logicDelete(Integer id);
	
	/**
	 * 批量的逻辑删除
	 * @param ids
	 * @return
	 */
	int logicDeleteBatch(Integer[] ids);

	int add(Article article);

	PageInfo<Article> getByUserId(Integer id, int pageNum, int pageSize);

	PageInfo<Article> checkList(Integer status, int pageNumber, int pageSize);

	/**
	 * 审核文章   
	 * @param id  文章id
	 * @param status  期望文章修改后的状态
	 * @return  修改数据的条数
	 */
	int check(Integer id, Integer status);

	/**
	 *  获取热门文章
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<Article> listhots(Integer pageNum, Integer pageSize);

	// 获取最新
	List<Article> last();

	/**
	 * 设置热门
	 * @param id
	 * @param status
	 * @return
	 */
	int setHot(Integer id, Integer status);
	
	
	
}
