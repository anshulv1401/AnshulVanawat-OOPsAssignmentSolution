package com.greatlearning.departments;

import java.lang.reflect.Method;

public class SuperDepartment {

	public String departmentName() {
		return " Super Department ";
	}

	public String getTodaysWork() {
		return " No Work as of now";
	}

	public String getWorkDeadline() {
		return " Nil ";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder();

		Class<? extends SuperDepartment> cls  = this.getClass();

		stringBuilder.append(" Welcome to" + departmentName());
		stringBuilder.append("\n");

		if(cls.getName() == HrDepartment.class.getName()) {
			Method method;
			try {
				method = cls.getMethod("doActivity");
				stringBuilder.append(method.invoke(this));
				stringBuilder.append("\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		stringBuilder.append(getTodaysWork());
		stringBuilder.append("\n");
		stringBuilder.append(getWorkDeadline());
		stringBuilder.append("\n");

		if(cls.getName() == TechDepartment.class.getName()) {
			Method method;
			try {
				method = cls.getMethod("getTechStackInformation");
				stringBuilder.append(method.invoke(this));
				stringBuilder.append("\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		stringBuilder.append(isTodayAHoliday());
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}
}
