package lista_05_03_2018;

public class Filme {

    private String titulo;
    private Cliente emprestado;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public boolean getEmprestado(){
        return emprestado != null ? true : false;
    }

    public void setEmprestado(Cliente emprestado){
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
