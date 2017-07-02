package com.uroc88.eclair;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EclairController {
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
}
