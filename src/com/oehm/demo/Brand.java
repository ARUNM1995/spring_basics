package com.oehm.demo;

public class Brand {

	private String brandName;
	private Model model;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + ", model=" + model + "]";
	}
	
}
