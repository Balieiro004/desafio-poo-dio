package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "Descrição java", 5);		
		
		Curso curso2 = new Curso("C#", "Descrição C#", 5);
		
		Mentoria mentoria1 = new Mentoria("Mentoria java", "Descrição mentoria java", LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria("Mentoria C#", "Descrição mentoria C#", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev dev1 = new Dev("Anderson");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteudos Concluidos " + dev1.getConteudosCOncluidos());
		System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos());
		System.out.println("XP: " + dev1.calcularXp());
		
		System.out.println("---------------------");
		Dev dev2 = new Dev("Mariá");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudos concluidos " + dev2.getConteudosCOncluidos());
		System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
		System.out.println("XP: " + dev2.calcularXp());
	}

}
