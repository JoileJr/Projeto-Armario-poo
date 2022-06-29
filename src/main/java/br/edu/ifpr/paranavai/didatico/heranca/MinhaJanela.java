package br.edu.ifpr.paranavai.heranca;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	public MinhaJanela() {
		// super.setTitle("A Sample JFrame Window");
		this.setTitle("A Sample JFrame Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
	}
	
	public void setTitle(String titulo) {
		super.setTitle("Biblioteca: " + titulo);
	}
}
