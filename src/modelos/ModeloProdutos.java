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
public class ModeloProdutos {
    private String nome;
    private float precoVenda;
    private float precoCusto;
    private int quantidade;
    
/*
 * Metodos Set
 */
    public void setNome(String _nome) {
        nome = _nome;
    } 
    
    public void setPrecoVenda(float _precoVenda) {
        precoVenda = _precoVenda;
    }
    public void setPrecoCusto(float _precoCusto) {
        precoCusto = _precoCusto;
    }
    
    public void setQuantidade(int _quantidade) {
        quantidade = _quantidade;    
    }
 
/*
 * Metodos Get
 */   
    
    public String getNome() {
        return nome;
    }
    
    public float getPrecoVenda() {
        return precoVenda;
    }
    public float getPrecoCusto() {
        return precoCusto;
    }
    
    public int getQuantidade() {
        return quantidade;    
    }
    
}
