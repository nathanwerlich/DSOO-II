/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.Produtos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nathan
 */
public class ControleCadastroProduto {
public static ArrayList<Produtos> c1 = new ArrayList<>();
    public void cadastroProduto(String nome, String precoVenda, String precoCusto, String quantidade) {
        boolean aux = false;
        if (nome.isEmpty() || precoVenda.isEmpty() || precoCusto.isEmpty() || quantidade.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Existem campos vazios!!!");

        } else {
            for (Produtos s : c1) {
                if (s.getNome().equals(nome)) {
                    int nova_quantidade = Integer.parseInt(s.getQuantidade()) + Integer.parseInt(quantidade);
                    s.setQuantidade(Integer.toString(nova_quantidade));
                    aux = true;
                    JOptionPane.showMessageDialog(null, "O produto ja estava cadastrado, agora voce tem: "+s.getQuantidade()+" "+ s.getNome()+"(s)");
                    break;
                }
            }
        if (!aux){
            Produtos produto = new Produtos();

            produto.setNome(nome);
            produto.setPrecoVenda(Double.parseDouble(precoVenda));
            produto.setPrecoCusto(Double.parseDouble(precoCusto));
            produto.setQuantidade(quantidade);

            c1.add(produto);
        }
        
        for (Produtos s : c1) 
            System.out.println(s.getQuantidade());
        
        //for (int i = 0; i < c1.size(); i++)
        //    System.out.println(c1.get(i).getNome());
        }
    }
}
