package com.nexo.ai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudant.client.api.Database;

@Service
@Transactional
public class CloudantService implements Cloudant {

	@Autowired
	Database db;

	@Override
	public Object save(Object object) {
		try { // TODO Auto-generated method stub
		return	db.save(object);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Object delete(String indexName, String docID) {
		try { // TODO Auto-generated method stub
			 db.deleteIndex(indexName, docID);
			 return null;
		} catch (Exception e) {
			return null;
		}		
	}

	@Override
	public List<Object> list() {
		try { // TODO Auto-generated method stub
			return db.getAllDocsRequestBuilder().includeDocs(true)
					.build().getResponse().getDocsAs(Object.class);
			} catch (Exception e) {
				return null;
		}
		
	}

}
