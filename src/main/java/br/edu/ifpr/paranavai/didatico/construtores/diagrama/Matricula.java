package br.edu.ifpr.paranavai.construtores.diagrama;


public class Matricula {
	// atributos
	int ra;
	String data;
	Curso curso;
	Estudante estudante;

	public Matricula() {
		super();
	}

	public Matricula(int ra, String data, Curso curso, Estudante estudante) {
		super();
		this.ra = ra;
		this.data = data;
		this.curso = curso;
		this.estudante = estudante;
	}

}
