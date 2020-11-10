package com.movierec.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	
	List<String> selectMainList(String param1);
}
