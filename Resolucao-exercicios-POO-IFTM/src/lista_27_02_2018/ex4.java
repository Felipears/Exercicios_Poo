package lista_27_02_2018;

public class ex4 {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.setTitular("Titular Conta 1");
		
		Conta c2 = new Conta("Titular Conta 2");
		
		System.out.println(c1.getTitular());
		System.out.println(c2.getTitular());
		
		//Quando se cria um construtor com argumento de receber o titular e possivel ja definir o titular
		//Sem necessidade de utilizar o setter como Exemplificado na conta c1

	}

}
