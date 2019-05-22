package com.bonify4.main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bonify4.main.service.UrlService;

@RestController
public class MainController {

	@Autowired
	UrlService urlService;

	@PostMapping("/findpathvariable")
	public String findvaribale(@RequestBody ArrayList<String> url) {
		return urlService.identifyDynamicParts(url);
	}

}
