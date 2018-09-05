/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 18200647
 */
public class Produtos {
    private String nome;
    private String precoVenda;
    private String precoCusto;
    private String quantidade;
    
/*
 * Metodos Set
 *
 */
    public void setNome(String _nome) {
        nome = _nome;
    } 
    
    public void setPrecoVenda(String _precoVenda) {
        precoVenda = _precoVenda;
    }
    public void setPrecoCusto(String _precoCusto) {
        precoCusto = _precoCusto;
    }
    
    public void setQuantidade(String _quantidade) {
        quantidade = _quantidade;    
    }
 
/*
 * Metodos Get
 */   
    
    public String getNome() {
        return nome;
    }
    
    public String getPrecoVenda() {
        return precoVenda;
    }
    public String getPrecoCusto() {
        return precoCusto;
    }
    
    public String getQuantidade() {
        return quantidade;    
    }
    
}
