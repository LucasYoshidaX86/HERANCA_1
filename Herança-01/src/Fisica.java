//Subclasse de pessoas física, usando "extends" para herdar atributos da superclasse Pessoas.
public class Fisica extends Pessoas {
	private String cpf;
	
//Constructor para iniciar atributo criado nesta subclasse e puxar atributos da superclasse. 
	public Fisica(String nome, String endereco, String email, String cpf) {
		super(nome, endereco, email);
		this.cpf = cpf;
	}
	
//Método getters para acessar atributos.
	public String getCpf() {
		return cpf;
	}
	
//Formatação das informações para serem puxadas ao main.
	String exibicao() {
		return
				super.exibicao() +
				"CPF: " + this.cpf + "\n";

		}
}

	
