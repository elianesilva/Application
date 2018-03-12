/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod.cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ClienteComum extends Cliente {

    public ClienteComum(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, "Cliente COMUM instanciado!\n Nome: " 
                + super.getNome() + "\n Idade: " + super.getIdade());
    }
    
}
