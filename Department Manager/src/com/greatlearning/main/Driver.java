package com.greatlearning.main;

import com.greatlearning.departments.*;

public class Driver {
	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(adminDepartment.toString());

		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(hrDepartment.toString());

		TechDepartment techDepartment = new TechDepartment();
		System.out.println(techDepartment.toString());
	}
}
