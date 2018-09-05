/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.Cliente;
import visao.ListaClientesUI;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nathan
 */
public class ControleListaClientes {
    
    DefaultListModel model;
    ListaClientesUI visao;
    JList lista;
    
public void iniciarListaClientes() {
        iniciarLista();
        for (Cliente s : ControleCadastroCliente.c1){
            model.addElement(s.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                visao.getTxtNome().setText(ControleCadastroCliente.c1.get(i).getNome());
                visao.getTxtSobrenome().setText(ControleCadastroCliente.c1.get(i).getSobrenome());
                visao.getTxtCPF().setText(ControleCadastroCliente.c1.get(i).getCPF());
                visao.getTxtTelefone().setText(ControleCadastroCliente.c1.get(i).getTelefone());
                visao.getTxtEndereco().setText(ControleCadastroCliente.c1.get(i).getEndereco());
            }
        });

        visao.setVisible(true);

    }
     
    public void iniciarLista() {
       visao = new ListaClientesUI();
       lista = visao.getLista();
       model = new DefaultListModel();
       lista.setModel(model);
       model.clear();
    }
    
    
}
