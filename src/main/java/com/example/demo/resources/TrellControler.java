package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;


@RestController
public class TrellControler {
	@Autowired
	private TrellService trellservice;

	@RequestMapping(method=RequestMethod.POST,value="/trell/")
	public void addMapping(@RequestBody userappmodel user ) {
		trellservice.createMapping(user);
		
	}
}
