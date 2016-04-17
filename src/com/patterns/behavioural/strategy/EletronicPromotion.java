package com.patterns.behavioural.strategy;

public class EletronicPromotion implements DepartmentPromotion {

	@Override
	public int Discount() {
		return 30;
	}
}
