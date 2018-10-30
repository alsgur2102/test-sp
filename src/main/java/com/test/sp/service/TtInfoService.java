package com.test.sp.service;

import java.util.List;

import com.test.sp.vo.TtInfo;

public interface TtInfoService {

	public List<TtInfo> getTtInfoList();
	public TtInfo getTtInfo(Integer tnum);
}
