/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod.carro;

import java.math.BigDecimal;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Onix extends Carro{
    
    public Onix(String versão, BigDecimal valor) {
        super(versão, valor);
    }

    @Override
    public void mostrarDados() {
       NumberFormat nf = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Carro: CHEVROLET ONIX \nVersão: "
                + super.getVersão() + "\nPreço: "+ nf.format(super.getValor()));
    }
    
}
