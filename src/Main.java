import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /* Como exemplo, irei instanciar os objetos Curso e Mentoria de formas diferente
        Um será com a chamada Set e outro usando construtor
         */

        Curso curso1 = new Curso("Curso de Java", "Curso completo em Java", 55);
        Curso curso2 = new Curso("Curso de JavaScript", "Curso rápido de JavaScript", 5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescricao("Mentoria total em Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria em JavaScript");
        mentoria2.setDescricao("Mentoria específica para JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
