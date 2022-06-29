package br.edu.ifpr.paranavai.construtores.diagrama;


public class Turma {
	// atributos
	String nome;
	Curso curso;

	public Turma() {

	}

	public Turma(String nome) {
		this.nome = nome;
	}

	public Turma(String nome, Curso curso) {
		this.nome = nome;
		this.curso = curso;
	}
}
