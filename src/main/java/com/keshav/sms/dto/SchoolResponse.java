package com.keshav.sms.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolResponse {

	private String status;
	private String message;
	private String body;
}