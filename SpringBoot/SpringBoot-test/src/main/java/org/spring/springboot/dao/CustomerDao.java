package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.spring.springboot.domain.Tbl_customer;
//@Mapper
public interface CustomerDao {
	//@Select("select * from tbl_customer where uuid = #{uuid}")
	Tbl_customer findByUuid(@Param("uuid") int uuid);
}
