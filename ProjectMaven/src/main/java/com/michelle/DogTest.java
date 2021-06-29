package com.michelle;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Cookie",2,10.2);
		Dog dog2 = new Dog("Chocopie", 3, 20.1);
		
		System.out.printf("%s %d %f\n",dog1.getName(),dog1.getAge(),dog1.getWeight());
		dog1.showExcitement();
		dog1.showExcitement(2);
		dog1.eating();
		dog1.eating("dogfood");
		System.out.printf("%s %d %f\n",dog2.getName(),dog2.getAge(),dog2.getWeight());
		dog2.showExcitement();
		dog2.showExcitement(4);
		dog2.eating();
		dog2.eating("water");
	}

}
