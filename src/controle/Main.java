/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author 18200647
 */
public class Main {
    public static void main(String args[]) {
      //  ControleCadastroFuncionario controle = new ControleCadastroFuncionario();
        ControleLogin controleLogin = new ControleLogin();
       // controleLogin.setControleCadastroFuncionario(controle);
        controleLogin.mostrarLogin();
    }
}
