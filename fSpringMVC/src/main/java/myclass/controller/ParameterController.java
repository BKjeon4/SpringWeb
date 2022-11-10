package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import myclass.model.MemberVO;

@Controller
public class ParameterController {
	
	@RequestMapping(value= {"param.do","paramForm.do"})
	public void test (MemberVO vo) {
		System.out.println("param.do 요청완료");
		

	}
	
	

}
