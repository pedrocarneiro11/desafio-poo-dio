package src;

import src.br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instanciamento do objeto curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        //instanciamento do objeto curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descricao curso Angular");
        curso2.setCargaHoraria(6);

        //instanciamento do objeto mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JavaScript");
        mentoria.setDescricao("Descricao Mentoria JavaScript");
        mentoria.setData(LocalDate.now());

        //instanciamento do Bootcamp

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //instanciamento dos Devs

        System.out.println(" ------------------------------- ");

        Dev Pedro = new Dev();
        Pedro.setNome("Pedro");
        Pedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro: " + Pedro.getConteudoInscritos());
        System.out.println(" ");
        Pedro.progredir();
        Pedro.progredir();
        Pedro.progredir();
        System.out.println("Conteudos Inscritos Pedro: " + Pedro.getConteudoInscritos());
        System.out.println(" ");
        System.out.println("Conteudos Concluidos Pedro: " + Pedro.getConteudoConcluidos());
        System.out.println(" ");
        System.out.println("XP Pedro: " + Pedro.calcularTotalXp());

        System.out.println(" ------------------------------- ");

        Dev Lucas = new Dev();
        Lucas.setNome("Lucas");
        Lucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas: " + Lucas.getConteudoInscritos());
        System.out.println(" ");
        Lucas.progredir();
        System.out.println("Conteudos Inscritos Lucas: " + Lucas.getConteudoInscritos());
        System.out.println(" ");
        System.out.println("Conteudos Concluidos Lucas: " + Lucas.getConteudoConcluidos());
        System.out.println(" ");
        System.out.println("XP Lucas: " + Lucas.calcularTotalXp());

        System.out.println(" ------------------------------- ");
    }
}

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */