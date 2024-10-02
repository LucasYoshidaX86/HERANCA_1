//Superclasse criada com os atributos pedidos na atividade, usando private para encapsulamento e proteção dos dados.
public class Pessoas {
	private String nome;
	private String endereco;
	private String email;
	
//Constructor para inicialização dos atributos criados acima 	
	public Pessoas(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
//Métodos getters para acessar atributos privados.	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getEmail() {
		return email;
	}

//Formatação das informações para serem puxadas ao main.
	String exibicao() {
		return
			"Nome: " + this.nome + "\n" + 
			"Endereço: " + this.endereco + "\n" +
			"Email: " + this.email + "\n";
	}
}
