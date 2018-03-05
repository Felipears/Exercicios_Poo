package lista_27_02_2018;

public class  ex2_ex3 {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		c.setNumero(123);
		c.setSaldo(500.00);
		c.setTitular("Felipe");
		
		System.out.println(c.getTitular() + " " + c.getNumero() + " " + c.getSaldo());
		
		/* getters e setter s� devem ser criados se for necess�rio interagir com os atributos da classe
		sem utilizar m�todos p�blicos da classe. */

	}

}
