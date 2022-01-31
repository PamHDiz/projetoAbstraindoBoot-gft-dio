package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev novoDev = new Dev();
		novoDev.setNome("Jo�o das Neves");
		novoDev.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Jo�o: " + novoDev.getConteudosInscritos());
		
		Dev novoDev2 = new Dev();
		novoDev2.setNome("Rosa Rosalinda");
		novoDev.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Rosa: " + novoDev2.getConteudosInscritos());
 	}

}
