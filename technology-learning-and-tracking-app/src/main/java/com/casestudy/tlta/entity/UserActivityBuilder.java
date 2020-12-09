package com.casestudy.tlta.entity;


public class UserActivityBuilder {

	private Integer userActivityId;
	private RegisterUser login;
	private LearningActivity learningActivity;
	private String status;
	private String certificate;

	

		public UserActivityBuilder userActivityId(Integer userActivityId) {
			this.userActivityId = userActivityId;
			return this;
		}

		public UserActivityBuilder login(RegisterUser login) {
			this.login = login;
			return this;
		}

		public UserActivityBuilder learningActivity(LearningActivity learningActivity) {
			this.learningActivity = learningActivity;
			return this;
		}

		public UserActivityBuilder status(String status) {
			this.status = status;
			return this;
		}

		public UserActivityBuilder certificate(String certificate) {
			this.certificate = certificate;
			return this;
		}

		public UserActivityBuilder build() {
			
			return new UserActivityBuilder();
		}
	

	private UserActivityBuilder(UserActivityBuilder builder) {
		this.userActivityId = builder.userActivityId;
		this.login = builder.login;
		this.learningActivity = builder.learningActivity;
		this.status = builder.status;
		this.certificate = builder.certificate;
	}

	public UserActivityBuilder() {
	}
}
