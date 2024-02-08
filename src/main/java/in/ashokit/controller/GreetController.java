package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class GreetController {

	@GetMapping("/greetings")
	public ModelAndView greetings() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hello World!!");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Welcome to home page");
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/accounts")
	public ModelAndView accounting() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Accounting portal");
		mv.setViewName("acc");
		return mv;
	}
	
	@GetMapping("/inventory")
	public ModelAndView inventory() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Inventory Portal");
		mv.setViewName("invt");
		return mv;
			
	}
	
	@GetMapping("/hello")
	public ModelAndView greeting() {
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("msg", "Hello World");
		mnv.setViewName("hello");
		return mnv;
		
	}
	
}
