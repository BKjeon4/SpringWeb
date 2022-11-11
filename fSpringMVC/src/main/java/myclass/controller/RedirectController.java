package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("insert.do")
	public String test () {
		//************************* return 을 select 로 해도, 데이터 값을 여기서 입력 시키지 않아서 데이터는 같이 넘어가지 않음
		//return "select";
		//리다이렉팅
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void test2 (Model m) {
		m.addAttribute("info","디비에서 넘어온 값");
		
	}

}
