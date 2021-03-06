/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.Produtos;
import visao.ListaProdutosUI;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author nathan
 */
public class ControleListaItens {
    
    DefaultListModel model;
    ListaProdutosUI visao;
    JList lista;
    
     public void iniciarListaProdutos() {
        iniciarLista();
        for (Produtos s : ControleCadastroProduto.c1){
            model.addElement(s.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                visao.getTxtNome().setText(ControleCadastroProduto.c1.get(i).getNome());
                visao.getTxtQuantidade().setText(ControleCadastroProduto.c1.get(i).getQuantidade());
                visao.getTxtPrecoCusto().setText(ControleCadastroProduto.c1.get(i).getPrecoCusto());
                visao.getTxtPrecoVenda().setText(ControleCadastroProduto.c1.get(i).getPrecoVenda());
            }
        });

        visao.setVisible(true);

    }
     
    public void iniciarLista() {
       visao = new ListaProdutosUI();
       lista = visao.getLista();
       model = new DefaultListModel();
       lista.setModel(model);
       model.clear();
    }
    
}
