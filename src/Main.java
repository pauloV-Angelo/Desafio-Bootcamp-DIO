import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
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
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);

	}

}
