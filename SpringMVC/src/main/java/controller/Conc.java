package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Conc {
	
	@RequestMapping("submit")
	public String islemYap(@RequestParam("number1") int s1,@RequestParam("number2")int s2, Model m) {
		
		m.addAttribute("toplam",s1+s2);
		m.addAttribute("carpim",s1*s2);
		
		return "sonuc";
	}

}
