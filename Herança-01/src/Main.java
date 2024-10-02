
public class Main {

	public static void main(String[] args) {
		
//Exibição dos dados pessoa física, puxando informações de uma subclasse. 
		Fisica p1 = new Fisica("Lucas Yoshida,", "Rua Abacate, 321", "Lucas@gmail.com", "123.456.789-00");
			System.out.println("Dados pessoa física: " + "\n");
			System.out.println(p1.exibicao()); 
			
//Exibição dos dados pessoa jurídica, puxando informações de uma subclasse.
		Juridica p2 = new Juridica("Supermercado Sol", "Rua Aaa, 123", "sol@gmail.com", "16.145.648/0001-00" );
			System.out.println("Dados pessoa jurídica: " + "\n");
			System.out.println(p2.exibicao());
			
//Exibição dos dados funcionário, puxando informações de uma subclasse.
		Funcionarios p3 = new Funcionarios("Irineu da Silva", "Avenida Brigadeiro, 345", "Irineu@gmail.com", "345.234.456-01", 1300.00);
			System.out.println("Dados Funcionários: " + "\n");
			System.out.println(p3.exibicao());

	}

}
