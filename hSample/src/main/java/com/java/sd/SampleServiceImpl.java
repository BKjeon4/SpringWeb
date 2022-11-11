package com.java.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDAO sampleDAO;
	
	public String select() {
		System.out.println("서비스");
		return sampleDAO.select();
	}
}
