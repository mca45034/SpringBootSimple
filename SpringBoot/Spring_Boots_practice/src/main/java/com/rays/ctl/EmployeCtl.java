package com.rays.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.EmployeDTO;
import com.rays.common.ORSResponse;

@RestController
@RequestMapping(value= "EmployeCtl")
public class EmployeCtl {
	@GetMapping("testORSResponseEmploye")
	public ORSResponse testORSResponseEmploye() {
		ORSResponse ress=new ORSResponse();
		Map er=new HashMap();
		er.put("id", "id is required");
		er.put("name", "name is required");
		er.put("department", "department is required");
		er.put("address", "address is required");
		er.put("contect", "contect is required");
        ress.addInputError(er);
        ress.addMessage("data inserted...!!!!!!!");
        
        EmployeDTO dto=new EmployeDTO();
        dto.setId(101);
        dto.setName("rahul kirar");
        dto.setDepartment("hr");
        dto.setAddress("indore");
        dto.setMobNo(987654345);
        ress.addData(dto);
        ress.addResult("input message", "Employe List");
		return ress;
		
	}

}
