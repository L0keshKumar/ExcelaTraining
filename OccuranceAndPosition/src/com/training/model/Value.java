package com.training.model;

import java.util.List;

public class Value {
	private int value;
	private int occuranceList;
	private List<Integer> positionList;
	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Value(int value, int occuranceList, List<Integer> positionList) {
		super();
		this.value = value;
		this.occuranceList = occuranceList;
		this.positionList = positionList;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getOccuranceList() {
		return occuranceList;
	}
	public void setOccuranceList(int occuranceList) {
		this.occuranceList = occuranceList;
	}
	public List<Integer> getPositionList() {
		return positionList;
	}
	public void setPositionList(List<Integer> positionList) {
		this.positionList = positionList;
	}
	@Override
	public String toString() {
		return "Value [value=" + value + ", occuranceList=" + occuranceList + ", positionList=" + positionList + "]";
	}
	
	
}
