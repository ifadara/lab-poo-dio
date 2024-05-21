import br.com.dio.desafio.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setTitulo("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setTitulo("Descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIcaro = new Dev();
        devIcaro.setNome("Icaro");
        devIcaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Icaro: " + devIcaro.getConteudosInscritos());
        devIcaro.progredir();
        devIcaro.progredir();
        System.out.println(" - ");
        System.out.println("Conteudos Inscritos Icaro: " + devIcaro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Icaro: " + devIcaro.getConteudosConcluidos());
        System.out.println("XP: " + devIcaro.calcularXpTotal());

        System.out.println("--------------------------------------");

        Dev devIsabella = new Dev();
        devIsabella.inscreverBootcamp(bootcamp);
        devIsabella.setNome("Isabella");
        System.out.println("Conteudos Inscritos Isabella: " + devIsabella.getConteudosInscritos());
        devIsabella.progredir();
        devIsabella.progredir();
        devIsabella.progredir();
        System.out.println(" - ");
        System.out.println("Conteudos Inscritos Isabella: " + devIsabella.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Isabella: " + devIsabella.getConteudosConcluidos());
        System.out.println("XP: " + devIsabella.calcularXpTotal());



    }
}