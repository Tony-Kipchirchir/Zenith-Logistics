package com.tonykipchirchir.Zenith.Logistics.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {
	
	@GetMapping("vehiclehires")
	public String goToVehicleHirePage() {
		
		return "VehicleHire";
		
	}

}
