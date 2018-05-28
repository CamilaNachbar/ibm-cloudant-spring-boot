package com.nexo.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.ai.service.Cloudant;

@CrossOrigin
@RestController
public class CloudantController {

	@Autowired
	Cloudant cloudant;
	
	@PostMapping(value = "api/cloudant/create")
	public Object save(@RequestBody Object object) {
		return cloudant.save(object);
	}
	
	@DeleteMapping(value = "api/cloudant/delete")
	public Object delete(@RequestBody String indexName, String docId) {
		return cloudant.delete(indexName, docId);
	}
	
	@GetMapping(value = "api/cloudant")
	public Object list(){
		return cloudant.list();
	}
}
