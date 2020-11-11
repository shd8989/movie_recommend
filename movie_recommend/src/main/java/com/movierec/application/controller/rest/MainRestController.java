package com.movierec.application.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movierec.application.service.MainService;
import com.movierec.model.MovieEntity;

@RestController
@RequestMapping("/api/v1")
public class MainRestController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping("/movie")
	public List<MovieEntity> selectMovieList(@RequestParam(value="param1", required=false) String param1) {
		return mainService.selectMovieList(param1);
	}
}
