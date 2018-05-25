package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {

	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student(1,"201332031","전현우","hyunwoo5906@naver.com");
		model.addAttribute("student",student);
		return "third/test1";
	}
}
