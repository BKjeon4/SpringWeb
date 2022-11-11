package com.java.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

	

@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("sample.do")
	public String sample (Model m) {
		System.out.println("컨트롤러");
		m.addAttribute("serverTime",sampleService.select());
		return	"home";
	}

}
