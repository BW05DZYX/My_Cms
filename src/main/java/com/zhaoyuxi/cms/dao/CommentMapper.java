package com.zhaoyuxi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhaoyuxi.cms.entity.Comment;

/**
 * @author 作者:赵玉玺
 * @version 创建时间：2019年9月23日 下午7:52:44 类功能说明
 */
public interface CommentMapper {

	@Insert("INSERT INTO cms_comment (articleId,userId,content,created)"
			+ " values(#{articleId},#{userId},#{content},now()) ")
	int add(Comment commnet);

	@Delete("delete from cms_comment where id=#{cid} and userId=#{userId}")
	int delete(@Param("userId") Integer userId, @Param("cid") Integer cid);

	@Select("SELECT c.* , u.username as userName " + " from cms_comment c " + " LEFT JOIN cms_user u ON u.id=c.userId "
			+ " where c.articleId=#{value}" + " ORDER BY c.created desc ")
	List<Comment> listByArticle(Integer articleId);

	@Select("SELECT c.* , a.title as articleTitle from cms_comment c "
			+ " LEFT JOIN cms_article a ON  c.articleId = a.id " + " where c.userId=#{value} ")
	List<Comment> listByUser(Integer userId);

}
