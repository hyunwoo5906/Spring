package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student1")
public class Student1Controller {

	static final Student[] list =new Student[] {
			new Student(1,"201332031","전현우","hyuwoo5906@naver.com"),
			new Student(2,"201532045","홍길동","hong@naver.com"),
			new Student(3,"201632031","임꺼정","lkh@naver.com")
	};

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("list", list);
		return "student1/list";
	}

}
