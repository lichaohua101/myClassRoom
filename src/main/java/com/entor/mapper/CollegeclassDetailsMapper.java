package com.entor.mapper;

import com.entor.entity.CollegeclassDetails;
import com.entor.entity.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-10-25
 */
@Mapper
public interface CollegeclassDetailsMapper extends BaseMapper<CollegeclassDetails> {
	
	@Select("SELECT u.* FROM collegeclass_details ccd,user u where ccd.userId=u.id and ccd.collegeCId = #{id}")
	public List<User> queryAllByCollegeId(int id);
}