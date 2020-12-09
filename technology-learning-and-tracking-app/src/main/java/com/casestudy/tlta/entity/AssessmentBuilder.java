package com.casestudy.tlta.entity;

import java.util.Date;

public class AssessmentBuilder {

	private Integer id;
	private String assesment_name;
	private String assesment_type;
	private Date assesment_release_date;
	private Double assesment_time_duration;

	

		public AssessmentBuilder id(Integer id) {
			this.id = id;
			return this;
		}

		public AssessmentBuilder assesment_name(String assesment_name) {
			this.assesment_name = assesment_name;
			return this;
		}

		public AssessmentBuilder assesment_type(String assesment_type) {
			this.assesment_type = assesment_type;
			return this;
		}

		public AssessmentBuilder assesment_release_date(Date assesment_release_date) {
			this.assesment_release_date = assesment_release_date;
			return this;
		}

		public AssessmentBuilder assesment_time_duration(Double assesment_time_duration) {
			this.assesment_time_duration = assesment_time_duration;
			return this;
		}

		public AssessmentBuilder build() {
			return new AssessmentBuilder();
		}
	

	private AssessmentBuilder(AssessmentBuilder builder) {
		this.id = builder.id;
		this.assesment_name = builder.assesment_name;
		this.assesment_type = builder.assesment_type;
		this.assesment_release_date = builder.assesment_release_date;
		this.assesment_time_duration = builder.assesment_time_duration;
	}

	public AssessmentBuilder() {
		// TODO Auto-generated constructor stub
	}
}
