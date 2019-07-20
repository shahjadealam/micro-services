package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestClientController {

	@Autowired
	RestTemplate restTemplate;
	CustomerPersonalInfoDTO personalinfo = null;
	CustomerAccountInfoDTO accountinfo = null;

	@RequestMapping(value = "/getfullcustomerdetails/{email}", method = RequestMethod.GET)
	public ResponseEntity<String> getFullCustomerDetails(@PathVariable String email) {

		return new ResponseEntity<>("Personal info:::::::" +getPersonalDetails(email) + "\n\n" + "Account info::::" + getAccountDetails(personalinfo.getMobile()),
				HttpStatus.OK);

	}
	
	
	private  CustomerPersonalInfoDTO getPersonalDetails(String email)
	{
		try {
			personalinfo = restTemplate.getForObject("http://Customer-Personal-Info-Service/getpersonalinfo/" + email,
					CustomerPersonalInfoDTO.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return personalinfo;
	}
	
	
	
	private CustomerAccountInfoDTO getAccountDetails(String mobileNumber)
	{
		
		try {
			accountinfo = restTemplate.getForObject("http://Customer-Account-Info-Service/getaccountinfo/" + personalinfo.getMobile(),
					CustomerAccountInfoDTO.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return accountinfo;
		
	}
	
}