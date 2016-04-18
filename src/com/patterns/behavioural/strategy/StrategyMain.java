package com.patterns.behavioural.strategy;

public class StrategyMain {
	public static void main(String[] args) {
		Product musicPlayer = new Product();
		musicPlayer.setDepartmentPromotion(new EletronicPromotion());

		int discountValue = musicPlayer.Discount();
		String message = String.format("O valor de desconto para esse departamento é de %d%%", discountValue);
		
		System.out.println("----------");
		System.out.println(message);
		System.out.println("----------");
	}
}
