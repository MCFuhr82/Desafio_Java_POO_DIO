import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devMarcelo = new Dev("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Dev Marcelo: ");
        System.out.println("Conteudos Inscritos: " + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos Inscritos: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXP());

        System.out.println();
        System.out.println("_________________________________________________");
        Dev devRodrigo = new Dev("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Dev Rodrigo: ");
        System.out.println("Conteudos Inscritos: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos Inscritos: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXP());

    }
}
