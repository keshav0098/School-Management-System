package com.keshav.sms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.sms.dto.SchoolResponse;

@RestController
public class SchoolController {

	@GetMapping("/welcome-school")
	public ResponseEntity<SchoolResponse> welcome()
	{
		SchoolResponse schoolResponse = SchoolResponse.builder().status(HttpStatus.OK.toString()).message("Success").body("Welocme To School Management System").build();
		return ResponseEntity.status(HttpStatus.OK).body(schoolResponse);
	}
}