
package br.edu.ifpr.paranavai.didatico.polimorfismo;
public class TesteSobrecarga {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Caramelo caramelo = new Caramelo();
        Gato gato = new Gato();
        gato.fala();
        dog.fala();
        caramelo.fala();
        Girafa girafa = new Girafa();
        girafa.fala();
        
       
    }
}
