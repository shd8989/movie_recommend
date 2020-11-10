package com.movierec.application.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movierec.db.mapper.MainMapper;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;
	
	public List<String> selectMainList(String param1) {
		return new ArrayList<>(Arrays.asList(new String[]{ "1", "2", "3" }));
//		return mainMapper.selectMainList(param1);
	}
}
