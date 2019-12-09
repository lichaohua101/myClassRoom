package com.entor.service;

import com.entor.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-10-25
 */
public interface IUserService extends IService<User> {
	
	/**
	 * 帐号查用户
	 * @param username
	 * @return
	 */
	public User queryUserByUsername(String username);
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
}
