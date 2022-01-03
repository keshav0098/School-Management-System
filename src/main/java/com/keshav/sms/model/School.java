package com.keshav.sms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// keshav dev2
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {

	private String schoolID;
	private String schoolName;
	private String schoolFees;
	private String board;
}