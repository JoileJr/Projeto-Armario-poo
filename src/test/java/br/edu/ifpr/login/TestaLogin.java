package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.armarios.controle.LoginControlador;
import org.junit.Assert;
import org.junit.Test;

public class TestaLogin {
    
    private String emailInvalido = "blabla@bla.com";
    private String emailValido = "admin@admin.com";
    private String senhaValida = "12345";
    private String senhaInvalida = "";
    
    @Test
    public void autenticacaoOk(){    
        String resposta = LoginControlador.verifica(emailValido,senhaValida);
        Assert.assertEquals("Sucesso no login!", resposta);
    }
    
    @Test
    public void emailInvalido(){
        String resposta = LoginControlador.verifica(emailInvalido,senhaValida);
        Assert.assertEquals("Email invalido!", resposta);
    }
    
    @Test
    public void senhaInvalida(){
        String resposta = LoginControlador.verifica(emailValido,senhaInvalida);
        Assert.assertEquals("Senha invalida!", resposta);
    }
    // BATATA, RACHID GOSTOSO, TESUDO
}
