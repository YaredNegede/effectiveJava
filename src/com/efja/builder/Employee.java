package com.efja.builder;

public class Employee {
	
	private String name;
	
	private String fatherName;
	
	private String email;
	
	private String phone;
	
	
	private Employee(EmployeeBuilder b) {
		this.email = b.email;
		this.phone = b.phone;
		this.name = b.name;
		this.fatherName = b.fatherName;
	}


	public static class EmployeeBuilder{
		
		private String email;
		
		private String phone;
		
		private String name ;
		
		private String  fatherName;
		
		private static EmployeeBuilder builderInstance;
		
		
		public static EmployeeBuilder getEmployeeBuilder() {
			if(builderInstance==null)
				builderInstance=new EmployeeBuilder();
			
			return builderInstance;
		}
		
		public EmployeeBuilder dets(String name,String fatherName) {
			this.name = name;
			this.fatherName =fatherName;
			return this;

		}
		
		public EmployeeBuilder email(String employeeEmail) {
			this.email=employeeEmail;
			return this;

		}
		
		public EmployeeBuilder phone(String employeephone) {
			this.phone=employeephone;
			return this;

		}
		
		public Employee build() {
			
			
			return new Employee(this);
			
		}
		
	}

}
