package com.example3.jdbc.springbootjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String department;

}
