package com.nexo.ai.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface Cloudant {
	public Object save(Object object);
	public Object delete(String indexName, String docID);
	public List<Object> list();

}
