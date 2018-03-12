/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod.carro;

import java.math.BigDecimal;

/**
 *
 * @author Alunos
 */
public abstract class Carro {
    private String versão;
    private BigDecimal valor;  

    public String getVersão() {
        return versão;
    }

    public void setVersão(String versão) {
        this.versão = versão;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Carro(String versão, BigDecimal valor) {
        this.versão = versão;
        this.valor = valor;
    }
    public abstract void mostrarDados();
}
