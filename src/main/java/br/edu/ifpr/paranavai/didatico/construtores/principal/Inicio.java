package br.edu.ifpr.paranavai.construtores.principal;

import java.util.Scanner;

import br.edu.ifpr.paranavai.construtores.diagrama.Curso;
import br.edu.ifpr.paranavai.construtores.diagrama.Estudante;

public class Inicio {

	public static void main(String[] args) {		
		//instanciação
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante("João");
		System.out.println("Você digitou: " + estudante.getNomeCompleto());
		System.out.println("Você digitou: " + estudante2.getNomeCompleto());
		Curso curso = new Curso();
		
	}

}
