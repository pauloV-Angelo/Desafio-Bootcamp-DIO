package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
	private LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo = " + super.getTitulo() + ", descricao = " + super.getDescricao() + ", data = "
				+ data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "]";
	}

}
