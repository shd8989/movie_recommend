package com.movierec.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movierec.db.mapper.MainMapper;
import com.movierec.model.MovieEntity;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;
	
	public List<MovieEntity> selectMovieList(String param1) {
//		return new ArrayList<>(Arrays.asList(new String[]{ "1", "2", "3" }));
		return mainMapper.selectMovieList(param1);
	}
}
