package org.cust.service;

import java.util.List;

import org.cust.dao.Ban_Archive_Dao;
import org.cust.model.Ban_archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("BanServices")
public class BanServices {
	
	@Autowired
	Ban_Archive_Dao ba_dao;
	
	@Transactional
	public List<Ban_archive> get_All_Bans() {
		return ba_dao.getAllBans();
	}
}
