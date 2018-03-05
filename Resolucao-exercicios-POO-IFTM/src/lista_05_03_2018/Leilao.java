package lista_05_03_2018;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private String bem;
    private double valorInicial;
    private boolean aberto;
    private Lance vencedor;
    private List<Lance> historico = new ArrayList<>();

    public Leilao(String bem, double valorInicial) {
        this.bem = bem;
        this.valorInicial = valorInicial;
        this.aberto = true;
        this.vencedor = new Lance("Inicial", valorInicial);
    }

    public void registrarLance(String nome, double valor){
        Lance lanceAtual = new Lance(nome, valor);
        if (valor > valorInicial && valor>vencedor.getValorDoLance() && aberto == true) {
            vencedor = lanceAtual;
            historico.add(lanceAtual);
        } else if(!aberto == true){
            System.out.println("Erro: Leilao encerrado");
        } else{
            System.out.printf("favor inserir um lance maior que: %.2f\n", vencedor.getValorDoLance());
        }
    }

    public void finalizar(){
        aberto = false;
        System.out.println("Vencedor do leilao: ");
        for (Lance l: historico
             ) {
            System.out.printf("Nome: %s - Lance:%.2f\n",l.getNome(),l.getValorDoLance());
        }
    }
}
