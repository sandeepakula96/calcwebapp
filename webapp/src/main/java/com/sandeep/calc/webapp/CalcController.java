package com.sandeep.calc.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

	@GetMapping("/calc")
	public String calcHomePage() {
		return "Greetings from Sandeep! Here is the Calc Home Page";
	}
    @GetMapping("/calc/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}

