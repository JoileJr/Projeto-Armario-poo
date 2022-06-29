package br.edu.ifpr.paranavai.construtores.diagrama;


public class Disciplina {
	//atributos
	private String nome;
	private int cargaHoraria;
	private int ano;
	private Professor professor;
	private Curso curso;
	public Disciplina() {
	}
	public Disciplina(String nome, int cargaHoraria, int ano, Professor professor, Curso curso) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.ano = ano;
		this.professor = professor;
		this.curso = curso;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	int getCargaHoraria() {
		return cargaHoraria;
	}
	void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	int getAno() {
		return ano;
	}
	void setAno(int ano) {
		this.ano = ano;
	}
	Professor getProfessor() {
		return professor;
	}
	void setProfessor(Professor professor) {
		this.professor = professor;
	}
	Curso getCurso() {
		return curso;
	}
	void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
