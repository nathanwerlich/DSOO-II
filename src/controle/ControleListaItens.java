/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.Produtos;
import controle.ControleCadastroProduto;
import visao.ListaProdutosUI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author nathan
 */
public class ControleListaItens {
    
    DefaultListModel modelo;
    ListaProdutosUI visao;
    JList lista;
    
     public void iniciarListaFuncionarios() {
        iniciarLista();
        for (Produtos s : ControleCadastroProduto.c1){
            modelo.addElement(s.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                visao.getTxtNome().setText(ControleCadastroProduto.c1.get(i).getNome());
                visao.getTxtQuantidade().setText(ControleCadastroProduto.c1.get(i).getQuantidade());
            }
        });

        visao.setVisible(true);

    }
     
    public void iniciarLista() {
       visao = new ListaProdutosUI();
       lista = visao.getLista();
       modelo = new DefaultListModel();
       lista.setModel(modelo);
       modelo.clear();
    }
    
}
