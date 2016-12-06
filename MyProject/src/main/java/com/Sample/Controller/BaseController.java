package com.Sample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Rest/")
public class BaseController {
	@RequestMapping(method = RequestMethod.GET)
	public String getIndexPage() {
		return "index1";
	}
}
