/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Funcionario;

/**
 *
 * @author nathan
 */
public class ControleCadastroFuncionario {
    public static ArrayList<Funcionario> c1 = new ArrayList<>();
    
    public void cadastroFuncionario(String nome, String sobrenome, String cpf, String rg, String telefone, String dataNasc,
                                    String endereco, String cargo, String salario, String usuario, String senha) {
                boolean aux = false;
        
        if (    nome.isEmpty() || sobrenome.isEmpty() ||     cpf.isEmpty() ||      rg.isEmpty() || telefone.isEmpty() || dataNasc.isEmpty() ||
            endereco.isEmpty() ||     cargo.isEmpty() || salario.isEmpty() || usuario.isEmpty() ||    senha.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Existem campos vazios!!!");
            
        } else {
            for (Funcionario s : c1) {
                if (s.getCPF().equals(cpf) || s.getUsuario().equals(usuario)) {
                   JOptionPane.showMessageDialog(null, "Funcionario ja cadastrado!!!");
                   aux = true;
                   break;
               }
            }    
            if (!aux) {
                Funcionario funcionario = new Funcionario();
            
                funcionario.setNome(nome);
                funcionario.setSobrenome(sobrenome);
                funcionario.setCPF(cpf);
                funcionario.setRG(rg);
                funcionario.setTelefone(telefone);
                funcionario.setDataNasc(dataNasc);
                funcionario.setEndereco(endereco);
                funcionario.setCargo(cargo);
                funcionario.setSalario(salario);
                funcionario.setUsuario(usuario);
                funcionario.setSenha(senha);
                
                c1.add(funcionario);   
                JOptionPane.showMessageDialog (null, "Funcionario Cadastrado com Sucesso");
            }
        }
    for (Funcionario s : c1) 
            System.out.println(s.getUsuario());
    }
}
