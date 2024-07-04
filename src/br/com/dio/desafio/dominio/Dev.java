package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
private String nome;
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


public void inscreverBootcamp(Bootcamp bootcamp) {
	conteudosInscritos.addAll(bootcamp.getConteudos());
	bootcamp.getDevsInscritos().add(this);
}

public void progredir() {
	Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
	if(conteudo.isPresent()) {
		conteudosConcluidos.add(conteudo.get());
		conteudosInscritos.remove(conteudo.get());
	} else {
		System.err.println("Você não está matriculado em nenhum conteúdo");
	}
}

public double calcularTotalXp() {
	return conteudosConcluidos.stream().mapToDouble(c -> c.calcularXp()).sum();
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public Set<Conteudo> getConteudosInscritos() {
	return conteudosInscritos;
}

public Set<Conteudo> getConteudosConcluidos() {
	return conteudosConcluidos;
}


@Override
public int hashCode() {
	return Objects.hash(nome);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dev other = (Dev) obj;
	return Objects.equals(nome, other.nome);
}

@Override
public String toString() {
	return nome;
}

}
