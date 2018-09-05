/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import visao.AdminControleUI;

/**
 *
 * @author 18200647
 */
public class ControleAdminControle {
    ControleCadastroFuncionario controlecadastrofuncionario;
    AdminControleUI admincontroleui;
    
    public void mostraTela() {
        admincontroleui = new AdminControleUI(this);
        admincontroleui.setVisible(true);
    }
    
}
 
