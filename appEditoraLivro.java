import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class appEditoraLivro {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Editora editora1 = new Editora(001, "AldoEditora", "aldoeditora@gmail.com", "Recife", "PE");
        Editora editora2 = new Editora (002, "JavaBooks", "javabooks@gmail.com", "São Paulo", "SP");

        Genero genero1 = new Genero(001, "Biografia");
        Genero genero2 = new Genero(002, "Poesia");
        Genero genero3 = new Genero(003, "Conto");

        Date dataLancamento1 = formato.parse("05/06/2022");
        Date dataLancamento2 = formato.parse("11/05/2023");
        Date dataLancamento3 = formato.parse("30/11/2020");
        Date dataLancamento4 = formato.parse("03/10/2021");
        Date dataLancamento5 = formato.parse("27/12/2019");

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro(001, "O Mago do Java", "978-0-7334-2609-4", 123, dataLancamento1, genero1, editora1));
        livros.add(new Livro(002, "Diário de um banana", "988-1-7332-2605-5", 70, dataLancamento2, genero2, editora1));
        livros.add(new Livro(003, "Turma da mônica", "923-3-5632-2506-1", 95, dataLancamento3,  genero3, editora2));
        livros.add(new Livro(004, "O extraordinário", "747-7-2883-9182-7", 357, dataLancamento4, genero1, editora2));
        livros.add(new Livro(005, "A arte da Guerra", "551-3-3379-9923-3", 232, dataLancamento5, genero1, editora2));

        for (Livro livro : livros) {
            System.out.println("LIVRO " + livro.getIdLivro());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Gênero: " + livro.getGenero().getNomeGenero());
            System.out.println("Editora: " + livro.getEditora().getRazaoSocial());
            System.out.println("Cidade: " + livro.getEditora().getCidade());
            System.out.println("-------------------------");
        }
    }
}