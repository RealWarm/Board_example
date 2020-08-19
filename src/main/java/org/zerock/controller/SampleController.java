package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;



@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {
	
	@RequestMapping("doA")
	public void doA() {
		log.info("@@@ doA called!!!!!!!!!!!!!!!!!");		
	}
	
	@RequestMapping("doB")
	public void doB(){
		log.info("doB called!!!!!!!!!!!");		
	}
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		log.info("doE called but redirect to /doF >>>> ");
		rttr.addFlashAttribute("msg", "This is the Message");		
		return "redirect:/doF";		
	}//doE
	
	@RequestMapping("doF")
	public void doF(@ModelAttribute String msg) {
		log.info("doF called ++++++ "+ msg);
	}//doF
	

}//SampleController
