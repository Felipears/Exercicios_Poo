package lista_05_03_2018;

public class RegistroDeLeilao {

    public static void main(String [] args){

        Leilao leilao = new Leilao("carro", 2000.00);

        leilao.registrarLance("Joao", 5000.00);
        leilao.registrarLance("Maria", 1500.00);
        leilao.registrarLance("Jose", 3000.00);

        leilao.finalizar();

        leilao.registrarLance("Rubinho Barrichelo", 2000.00);

    }



}
