package com.efja;

import com.efja.builder.Employee;
import com.efja.builder.Employee.EmployeeBuilder;
import com.efja.builder.NutritionFacts;
import com.efja.builder.NutritionFacts.Builder;
import com.efja.factory.StaticFactory;

public class Main {

	public static void main(String[] args) {
		
		 StaticFactory ins = StaticFactory.getInstance();
		
		 int servingSize=1;
		
		 int servings=2;
		
		  NutritionFacts nutritionFacts = new Builder(servingSize, servings)
						 					.fat(12)
											.sodium(11)
											.calories(11)
											.build();
		
		  
		  EmployeeBuilder employeeBuilder = new EmployeeBuilder();
		  
		  Employee e =  EmployeeBuilder.getEmployeeBuilder()
		  				 .dets("firatname", "fathername")
						 .email("employeeEmail")
						 .phone("employeephone")
						 .build();
		  
		  
		  
	}

}
