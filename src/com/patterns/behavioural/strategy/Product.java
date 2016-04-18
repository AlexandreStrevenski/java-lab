package com.patterns.behavioural.strategy;

public class Product {
	private DepartmentPromotion _departmentPromotion;
	
	public void setDepartmentPromotion(DepartmentPromotion departmentPromotion) { 
		this._departmentPromotion = departmentPromotion; 
	}
	
	public int Discount(){
		return this._departmentPromotion.Discount();
	}	
}
