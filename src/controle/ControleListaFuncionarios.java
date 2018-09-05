/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.Funcionario;
import visao.ListaFuncionariosUI;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nathan
 */
public class ControleListaFuncionarios {
    
    DefaultListModel model;
    ListaFuncionariosUI visao;
    JList lista;
    
public void iniciarListaFuncionarios() {
        iniciarLista();
        for (Funcionario s : ControleCadastroFuncionario.c1){
            model.addElement(s.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                visao.getTxtNome().setText(ControleCadastroFuncionario.c1.get(i).getNome());
                visao.getTxtSobrenome().setText(ControleCadastroFuncionario.c1.get(i).getSobrenome());
                visao.getTxtCPF().setText(ControleCadastroFuncionario.c1.get(i).getCPF());
                visao.getTxtCargo().setText(ControleCadastroFuncionario.c1.get(i).getCargo());
                visao.getTxtSalario().setText(ControleCadastroFuncionario.c1.get(i).getSalario());
            }
        });

        visao.setVisible(true);

    }
     
    public void iniciarLista() {
       visao = new ListaFuncionariosUI();
       lista = visao.getLista();
       model = new DefaultListModel();
       lista.setModel(model);
       model.clear();
    }
    
    
    
}
