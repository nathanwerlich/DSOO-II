/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cliente;

/**
 *
 * @author nathan
 */
public class ControleCadastroCliente {    
    public static ArrayList<Cliente> c1 = new ArrayList<>();
    
    public void cadastroCliente(String nome, String sobrenome, String cpf, String rg, String telefone, String dataNasc, String endereco) {
        boolean aux = false;
        
        if (    nome.isEmpty() || sobrenome.isEmpty() ||     cpf.isEmpty() ||      rg.isEmpty() || telefone.isEmpty() || dataNasc.isEmpty() ||
            endereco.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Existem campos vazios!!!");
        
        } else {
            for (Cliente s : c1) {
                if (s.getCPF().equals(cpf)) {
                    JOptionPane.showMessageDialog(null, "Cliente ja cadastrado!!!");
                    aux = true;
                    break;
                }
            }
            
            if (!aux) {
                Cliente cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setSobrenome(sobrenome);
                cliente.setCPF(cpf);
                cliente.setRG(Integer.parseInt(rg));
                cliente.setTelefone(Integer.parseInt(telefone));
                cliente.setDataNasc(dataNasc);
                cliente.setEndereco(endereco);

                c1.add(cliente);
                JOptionPane.showMessageDialog (null, "Cliente Cadastrado com Sucesso");
            }
        }
        
        for (Cliente s : c1) 
            System.out.println(s.getNome());
    }
}
