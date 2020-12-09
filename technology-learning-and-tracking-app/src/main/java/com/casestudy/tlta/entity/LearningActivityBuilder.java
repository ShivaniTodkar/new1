package com.casestudy.tlta.entity;

import java.time.LocalDate;
import java.util.Set;

public class LearningActivityBuilder {
	private Integer id;
	private String activity_name;
	private String activity_link;
	private String activity_level;
	private Double activity_time;
	private LocalDate activity_realsedate;
	private Set<UserActivity> userActivity;
	private Assessment assesment;

	

		public LearningActivityBuilder id(Integer id) {
			this.id = id;
			return this;
		}

		public LearningActivityBuilder activity_name(String activity_name) {
			this.activity_name = activity_name;
			return this;
		}

		public LearningActivityBuilder activity_link(String activity_link) {
			this.activity_link = activity_link;
			return this;
		}

		public LearningActivityBuilder activity_level(String activity_level) {
			this.activity_level = activity_level;
			return this;
		}

		public LearningActivityBuilder activity_time(Double activity_time) {
			this.activity_time = activity_time;
			return this;
		}

		public LearningActivityBuilder activity_realsedate(LocalDate activity_realsedate) {
			this.activity_realsedate = activity_realsedate;
			return this;
		}

		public LearningActivityBuilder userActivity(Set<UserActivity> userActivity) {
			this.userActivity = userActivity;
			return this;
		}

		public LearningActivityBuilder assesment(Assessment assesment) {
			this.assesment = assesment;
			return this;
		}

		public LearningActivityBuilder build() {
			return new LearningActivityBuilder();
		}
	

	private LearningActivityBuilder(LearningActivityBuilder builder) {
		this.id = builder.id;
		this.activity_name = builder.activity_name;
		this.activity_link = builder.activity_link;
		this.activity_level = builder.activity_level;
		this.activity_time = builder.activity_time;
		this.activity_realsedate = builder.activity_realsedate;
		this.userActivity = builder.userActivity;
		this.assesment = builder.assesment;
	}

	public LearningActivityBuilder() {
	}
}
