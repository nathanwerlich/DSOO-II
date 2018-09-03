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
ArrayList<Funcionario> c1 = new ArrayList<>();
    
    public void cadastroFuncionario(String nome, String sobrenome, String cpf, String rg, String telefone, String dataNasc,
                                    String endereco, String cargo, String salario, String usuario, String senha) {
        
        if (    nome.isEmpty() || sobrenome.isEmpty() ||     cpf.isEmpty() ||      rg.isEmpty() || telefone.isEmpty() || dataNasc.isEmpty() ||
            endereco.isEmpty() ||     cargo.isEmpty() || salario.isEmpty() || usuario.isEmpty() ||    senha.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Existem campos vazios!!!");
            
        } else if (c1.isEmpty()) {
                Funcionario f2 = new Funcionario();
                f2.setNome("admin");
                f2.setSobrenome("admin");
                f2.setCPF(Integer.parseInt("123"));
                f2.setRG(Integer.parseInt("123"));
                f2.setTelefone(Integer.parseInt("123"));
                f2.setDataNasc("123");
                f2.setEndereco("123");
                f2.setCargo("Administrador");
                f2.setSalario(Double.parseDouble("123"));
                f2.setUsuario("admin");
                f2.setSenha("admin");
                c1.add(f2);
                
                Funcionario funcionario = new Funcionario();
            
                funcionario.setNome(nome);
                funcionario.setSobrenome(sobrenome);
                funcionario.setCPF(Integer.parseInt(cpf));
                funcionario.setRG(Integer.parseInt(rg));
                funcionario.setTelefone(Integer.parseInt(telefone));
                funcionario.setDataNasc(dataNasc);
                funcionario.setEndereco(endereco);
                funcionario.setCargo(cargo);
                funcionario.setSalario(Double.parseDouble(salario));
                funcionario.setUsuario(usuario);
                funcionario.setSenha(senha);
                c1.add(funcionario);
            JOptionPane.showMessageDialog (null, "sucedo");
        } else if (!c1.isEmpty()) {
        
            /*JOptionPane.showMessageDialog (null, "Teste0");
            //for (int i = 0; i < c1.size(); i++) {
            //for (Funcionario s : c1) {
            
            JOptionPane.showMessageDialog (null, "Teste1");
            
            if (s.getUsuario() == usuario) {
            JOptionPane.showMessageDialog (null, "Usuario ja cadastrado");
            
            } else { */
            
            Funcionario funcionario = new Funcionario();
            
            funcionario.setNome(nome);
            funcionario.setSobrenome(sobrenome);
            funcionario.setCPF(Integer.parseInt(cpf));
            funcionario.setRG(Integer.parseInt(rg));
            funcionario.setTelefone(Integer.parseInt(telefone));
            funcionario.setDataNasc(dataNasc);
            funcionario.setEndereco(endereco);
            funcionario.setCargo(cargo);
            funcionario.setSalario(Double.parseDouble(salario));
            funcionario.setUsuario(usuario);
            funcionario.setSenha(senha);
            c1.add(funcionario);
            JOptionPane.showMessageDialog (null, "sucedo");
        }
                //}              
            //}  
        for (Funcionario s : c1)
            System.out.println(s.getNome());
    }
}