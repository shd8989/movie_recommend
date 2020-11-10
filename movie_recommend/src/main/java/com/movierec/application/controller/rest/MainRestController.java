package com.movierec.application.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movierec.application.service.MainService;

@RestController
@RequestMapping("/api/v1")
public class MainRestController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping("/main")
	public List<String> selectMainList(@RequestParam(value="param1", required=false) String param1) {
		return mainService.selectMainList(param1);
	}
}
