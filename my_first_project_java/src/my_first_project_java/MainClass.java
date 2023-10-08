package my_first_project_java;

import User.User;

public class MainClass {
  
	public static void main(String[] args) {
		
		User user = new User("Valdir", "Silva");
		
		String name = user.getName();
		String lastName = user.getLastName();
		Integer age = user.calculateAge("2023", "1990");
		
		System.out.println("Nome: " + name);
		System.out.println("Sobrenome: " + lastName);
		System.out.println("Idade: " + age);
	}
	
}
