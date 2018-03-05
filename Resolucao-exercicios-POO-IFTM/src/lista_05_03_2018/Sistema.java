package lista_05_03_2018;

public class Sistema {

    public static void main(String [] args){

        Filme f1 = new Filme("Batman");
        Filme f2 = new Filme("X-MEN");
        Filme f3 = new Filme("Hulk");
        Filme f4 = new Filme("IRON MAN");

        Cliente c1 = new Cliente("Joao", " ");
        Cliente c2 = new Cliente("Joao", " ");

        c1.emprestar(f1);
        c1.emprestar(f3);

        imprimeFilmesEmprestados(c1);

        c1.devolver(f1);
        c1.devolver(f3);

        imprimeFilmesEmprestados(c1);


    }

    private static void imprimeFilmesEmprestados(Cliente c1) {

        for (Filme f: c1.getEmprestados()
             ) {
            System.out.println(f.getTitulo());
        }

    }

}
