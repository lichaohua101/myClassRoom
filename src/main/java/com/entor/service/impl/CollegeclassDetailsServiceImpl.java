package com.entor.service.impl;

import com.entor.entity.CollegeclassDetails;
import com.entor.entity.User;
import com.entor.mapper.CollegeclassDetailsMapper;
import com.entor.service.ICollegeclassDetailsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-10-25
 */
@Service
public class CollegeclassDetailsServiceImpl extends ServiceImpl<CollegeclassDetailsMapper, CollegeclassDetails> implements ICollegeclassDetailsService {
	
	@Autowired
	private CollegeclassDetailsMapper CCDM;
	
	/**
	 * 一个班级的 全部人
	 * @param id
	 * @return
	 */
	@Override
	public List<User> queryAllByCollegeId(int id) {
		return CCDM.queryAllByCollegeId(id);
	}
	
}
