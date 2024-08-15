package com.example.first.dto.request;

public class CreateCategoryRequest {
	private String name;
	private String description;

	public CreateCategoryRequest(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public CreateCategoryRequest() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
