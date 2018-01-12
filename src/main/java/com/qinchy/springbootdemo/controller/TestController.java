/**
 * 
 */
package com.qinchy.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping(path="/test")
public class TestController {
	
	@GetMapping(path= {"/test"})
	public String test(String test) {
		return test;
	}

}
