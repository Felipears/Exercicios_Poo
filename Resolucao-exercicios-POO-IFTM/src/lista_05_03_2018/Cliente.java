package lista_05_03_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private String nome;
    private String CPF;
    private List<Filme> emprestados;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        emprestados = new ArrayList<Filme>();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void devolver(Filme filme){
        emprestados.remove(filme);
        filme.setEmprestado(null);
    }

    public void emprestar(Filme filme){
        if(!filme.getEmprestado()){
            emprestados.add(filme);
            filme.setEmprestado(this);
        }
    }

    public List<Filme> getEmprestados(){

        return Collections.unmodifiableList(emprestados);
    }
}
