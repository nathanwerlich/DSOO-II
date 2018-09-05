/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.ControleCadastroFuncionario;
import javax.swing.JOptionPane;
import modelos.Funcionario;
import visao.LoginUI;

/**
 *
 * @author nathan
 */
public class ControleLogin {
  //  ControleCadastroFuncionario controlecadastrofuncionario;
    
    LoginUI loginUI;
    
    public void mostrarLogin (){
        loginUI = new LoginUI(this);
        loginUI.setVisible(true);
    }
    
    public void setControleCadastroFuncionario(ControleCadastroFuncionario _controlecadastrofuncionario){
   //     controlecadastrofuncionario = _controlecadastrofuncionario;
    }
    
    
    public void validaLogin(String login, String senha) {
            ControleCadastroFuncionario.c1.add(new Funcionario("admin", "admin"));
            for (Funcionario s : ControleCadastroFuncionario.c1) {
                if (s.getUsuario().equals(login)) {
                     if (s.getSenha().equals("admin") && s.getUsuario().equals("admin")){
                            //loginUI.dispose();
                            new ControleAdminControle().mostraTela();
                            break;
                        }
                    if(s.getSenha().equals(senha)) {
                        JOptionPane.showMessageDialog(null, "Logou");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta");
                    }
                }
            }
    }
}
