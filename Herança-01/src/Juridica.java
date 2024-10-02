//Subclasse Juridica, usando "extends" para herdar atributos da superclasse Pessoas. 
public class Juridica extends Pessoas{
	private String cnpj;
	
//Constructor para iniciar atributo da subclasse Juridico e comando "super" para puxar atributos da superclasse.	
	public Juridica(String nome, String endereco, String email, String cnpj) {
		super(nome, endereco, email);
		this.cnpj = cnpj; 
	}
	
//Métodos getters para acessar atributos privados. 	
	public String getCnpj() {
		return cnpj;
	}
	
//Formatação das informações para serem puxadas ao main. 
	String exibicao() {
		return
				super.exibicao()  +
				"CNPJ: " + this.cnpj + "\n";

		}
}
