package com.zhaoyuxi.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhaoyuxi.cms.entity.User;
import com.zhaoyuxi.cms.entity.UserVo;

/**
*@author 作者:赵玉玺
*@version 创建时间：2019年9月18日 下午7:38:49
*类功能说明
*/
public interface UserService {
	
	/**
	 * 
	 * @return
	 */
	User login(User user);
	/**
	 * 
	 * @return
	 */
	User register(User user);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	User findByName(String name);
	
	/**
	 * 
	 * @param uservo
	 * @return
	 */
	User query(UserVo  uservo);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	int update(User user);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	User findById(Integer id);
	
	/**
	 * 根据用户名模糊查询
	 * @param pageNumber
	 * @param pageSize
	 * @param name
	 * @return
	 */
	PageInfo<User> search(int pageNumber, int pageSize, String name);
	
	
	
}
