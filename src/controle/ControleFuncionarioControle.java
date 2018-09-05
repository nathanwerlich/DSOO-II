/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import visao.FuncionarioControleUI;

/**
 *
 * @author nathan
 */
public class ControleFuncionarioControle {
    
    ControleCadastroFuncionario controlecadastrofuncionario;
    FuncionarioControleUI funcionariocontroleui;
    
    public void mostraTela() {
        funcionariocontroleui = new FuncionarioControleUI(this);
        funcionariocontroleui.setVisible(true);
    }
    
}
