//Subclasse Funcionarios, usando "extends" para identificar como subclasse e herdar atributos da classe principal. 
public class Funcionarios extends Pessoas {
	private String cpf;
	private double salario;

//Constructor para inciciar atributos criados acima. 
	public Funcionarios(String nome, String endereco, String email, String cpf, double salario) {
		super(nome, endereco, email);
		this.cpf = cpf;
		this.salario = salario;
	}
	
//Método getters para acessar atributos privados criados acima . 
	public String getCpf() {
		return cpf;
	}
		
	public double getSalario() {
		return salario; 
	}
	
//Formatação das informações para serem puxadas ao main.
	String exibicao() {
		return
				super.exibicao()  +
				"CPF: " + this.cpf + "\n" +
				"Salário: R$" + this.salario + "\n";

		}
}
