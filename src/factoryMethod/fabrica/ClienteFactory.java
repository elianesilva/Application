/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod.fabrica;

import factoryMethod.cliente.Cliente;
import factoryMethod.cliente.ClienteComum;
import factoryMethod.cliente.ClientePreferencial;

/**
 *
 * @author Alunos
 */
public class ClienteFactory {
    public Cliente CriarCliente(String nome, int idade){
         Cliente c;
    if (idade>= 65){
    c = new ClientePreferencial(nome, idade);
}else{
    c = new ClienteComum(nome, idade);
}
        return c;
    }
}
