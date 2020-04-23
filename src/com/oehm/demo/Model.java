package com.oehm.demo;

public class Model {

	private Long modelId;
	private Double cost;
	private String modelName;
	private String type;
	private String features;
	
	public Long getModelId() {
		return modelId;
	}
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Model(String modelName, String type, String features) {
		super();
		this.modelName = modelName;
		this.type = type;
		this.features = features;
	}
	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", cost=" + cost + ", modelName=" + modelName + ", type=" + type
				+ ", features=" + features + "]";
	}
	
}
