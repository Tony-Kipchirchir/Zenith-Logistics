package com.tonykipchirchir.Zenith.Logistics.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tonykipchirchir.Zenith.Logistics.Models.Client;
import com.tonykipchirchir.Zenith.Logistics.Services.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService ;
	
	private static final Logger log = LoggerFactory.getLogger(ClientController.class);
	
	@GetMapping("clients")
	public String goToClientPage() {
		List<Client> list_of_clients =  clientService.findAll();
		
		log.info(list_of_clients.toString());
		return "Client";
		
	}

}
