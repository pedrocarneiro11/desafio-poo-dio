package src;

import src.br.com.dio.desafio.dominio.Conteudo;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); //instanciamento do objeto curso
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //instanciamento do objeto curso
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descricao curso Angular");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria(); //instanciamento do objeto mentoria
        mentoria.setTitulo("Mentoria JavaScript");
        mentoria.setDescricao("Descricao Mentoria JavaScript");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
