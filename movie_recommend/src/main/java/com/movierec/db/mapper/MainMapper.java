package com.movierec.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.movierec.model.MovieEntity;

@Mapper
public interface MainMapper {
	
	List<MovieEntity> selectMovieList(String param1);
}
