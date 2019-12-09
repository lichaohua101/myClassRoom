package com.entor.service;

import com.entor.entity.CollegeclassDetails;
import com.entor.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-10-25
 */
public interface ICollegeclassDetailsService extends IService<CollegeclassDetails> {
	
	/**
	 * 一个班级的 全部人
	 * @param id
	 * @return
	 */
	public List<User> queryAllByCollegeId(int id);
}
