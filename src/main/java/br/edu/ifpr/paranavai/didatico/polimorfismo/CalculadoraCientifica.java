package br.edu.ifpr.paranavai.didatico.polimorfismo;

public class CalculadoraCientifica extends Calculadora {

    public String soma(int x, int y, int z) {
        String resposta = super.soma(x, y, z);

        return "**" + resposta + "**";
    }
    public String log(int x, int y, int z) {
        String resposta = super.soma(x, y, z);

        return "**" + resposta + "**";
    }
}
