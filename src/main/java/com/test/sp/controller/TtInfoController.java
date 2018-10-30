package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Controller
public class TtInfoController {

	@Autowired
	private TtInfoService tis;
	
	@GetMapping(value="/ttinfos")
	public @ResponseBody List<TtInfo> getTtInfoList() {
		return tis.getTtInfoList();
	}
}
