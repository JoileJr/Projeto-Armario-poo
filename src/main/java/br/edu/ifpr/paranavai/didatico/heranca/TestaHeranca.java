package br.edu.ifpr.paranavai.heranca;

import javax.swing.JFrame;

public class TestaHeranca extends JFrame{
	
	

	public static void main(String[] args) {
		MinhaJanela janela = new MinhaJanela();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setAnoFabricacao(2022);
		
		VeiculoTerrestre veiculoTerrestre = new VeiculoTerrestre();
		veiculoTerrestre.setAnoFabricacao(2021);
		
		Moto moto = new Moto();
		

	}

}
