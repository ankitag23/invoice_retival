package org.cust.controller;

import java.util.List;

import org.cust.model.Ban_archive;
import org.cust.service.BanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user_type")
public class CustController {
	
	@Autowired
	BanServices ban_ser;
	@RequestMapping(value = "/login", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showLoginPage(Model model)
	{
		List<Ban_archive> ban_arch_list = ban_ser.get_All_Bans();
		for( Ban_archive bans : ban_arch_list )
		{
			System.out.println("Bans : " + bans.getBan_number());
		}
		model.addAttribute("ban_details",ban_arch_list);
		return "ban_retrive";
	}
	@RequestMapping(value = "/ban_retrive", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showBanDetails(Model model)
	{
	return "login";
	}
	@RequestMapping(value = "/ban_details", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showBan_Details()
	{
		
		return "login";
	}
	}

