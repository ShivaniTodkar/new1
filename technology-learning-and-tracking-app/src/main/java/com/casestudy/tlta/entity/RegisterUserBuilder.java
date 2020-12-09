package com.casestudy.tlta.entity;

public class RegisterUserBuilder {

	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private Role role;


		public RegisterUserBuilder id(Integer id) {
			this.id = id;
			return this;
		}

		public RegisterUserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public RegisterUserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public RegisterUserBuilder emailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public RegisterUserBuilder password(String password) {
			this.password = password;
			return this;
		}

		public RegisterUserBuilder role(Role role) {
			this.role = role;
			return this;
		}

		public RegisterUser build() {
			
			RegisterUser registerUser= new RegisterUser();

			registerUser.setFirstName(firstName);
			registerUser.setLastName(lastName);
			registerUser.setEmailId(emailId);
			registerUser.setPassword(password);
			registerUser.setRole(role);
			
			return registerUser;
		}
	

	private RegisterUserBuilder(RegisterUserBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.emailId = builder.emailId;
		this.password = builder.password;
		this.role = builder.role;
	}

	public RegisterUserBuilder() {
		
	}
}
