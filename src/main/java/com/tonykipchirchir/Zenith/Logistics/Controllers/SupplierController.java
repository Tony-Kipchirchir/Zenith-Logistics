package com.tonykipchirchir.Zenith.Logistics.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController {
	
	@GetMapping("suppliers")
	public String goToSuppliersPage() {
		
		return "Supplier";
		
	}

}
