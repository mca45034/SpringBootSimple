package com.rays.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.EmployeDTO;
import com.rays.common.ORSResponse;
import com.rays.common.SpringResponse;
import com.rays.common.UserDTO;

@RestController
@RequestMapping(value= "usersctl")
public class UserCtl {
	
	@GetMapping
	public SpringResponse display() {
		SpringResponse res=new SpringResponse();
		res.setData("data inserted..!!!");
		res.setMessage("successfulyy...!!!!");
		
		Map error=new HashMap();
		error.put("fname", "firstname is required");
		error.put("sname", "lname is required");
		error.put("login","login is required");
		error.put("pass","password is required");
		
		Map map=new HashMap();
		map.put("inputerror",error);
		res.setResult(map);
		return res;
	}
	@GetMapping("testORSResponse")
	public ORSResponse testORSResponse() {

		ORSResponse res = new ORSResponse();

		Map errors = new HashMap();
		errors.put("firstName", "first name is required");
		errors.put("lastName", "last name is required");
		errors.put("loginId", "login is required");
		errors.put("password", "password is required");

		res.addInputError(errors);

		res.addMessage("data inserted");

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("rahul");
		dto.setLastName("kirar");
		dto.setLogin("rahul@gmail.com");
		dto.setPassword("rahul@123");

		res.addData(dto);
		res.addResult("preload", "user list");

		return res;
		
	}
	

}
