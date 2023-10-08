package User;

public class User {
	private String name;
	private String lastName;
	private Integer age;
	
	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String  getName() {
		return this.name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public Integer calculateAge(String anoAtual, String anoNascimento) {
		try {
			
			if (anoAtual == "" || anoNascimento == "") {
				System.out.println("O ano de nascimento e ano atual devem ser informados!");
			}
			
			this.age = Integer.parseInt(anoAtual) - Integer.parseInt(anoNascimento);
			
		} catch(NumberFormatException ex) {
			 ex.printStackTrace();
		}
		
		return this.age;
	}
}
