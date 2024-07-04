import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();

		curso2.setTitulo("curso JavaScript");
		curso2.setDescricao("descrição do curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("mentoria de Java");
		mentoria1.setDescricao("descrição da mentoria de Java");
		mentoria1.setData(LocalDate.parse("30-07-2024",DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		
		Bootcamp bootcamp1 = new Bootcamp();
		
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descrição Bootcamp Java Dev");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		
		Dev devCamila = new Dev();
		Dev devPaulo = new Dev();
		
		devCamila.setNome("Camila");
		devPaulo.setNome("Paulo");
		devCamila.inscreverBootcamp(bootcamp1);
		devPaulo.inscreverBootcamp(bootcamp1);
		
		System.out.println("Conteudos inscritos de camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos inscritos de Paulo: " + devPaulo.getConteudosInscritos());
		
		
		System.out.println("Alunos inscritos no bootcamp: " + bootcamp1.getDevsInscritos());
		
		
		devPaulo.progredir();
		
		System.out.println("Conteúdos concluídos de Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("Conteúdos concluídos de Paulo: " + devPaulo.getConteudosConcluidos());

		System.out.println("XP total de Camila: " + devCamila.calcularTotalXp());
		System.out.println("XP total de Paulo: " + devPaulo.calcularTotalXp());
	}

}
