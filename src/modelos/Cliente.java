/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * @author 18200647
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String CPF;
    private int RG;
    private String telefone;
    private String dataNasc;
    private String endereco;
    
/*
 * Metodos Set
 */
    public void setNome(String _nome) {
        nome = _nome;
    } 
    
    public void setSobrenome(String _sobrenome) {
        sobrenome = _sobrenome;
    }
    public void setCPF(String _CPF) {
        CPF = _CPF;
    }
    
    public void setRG(int _RG) {
        RG = _RG;    
    }
    
    public void setTelefone(String _telefone) {
        telefone = _telefone;
    }
   
    public void setDataNasc(String _dataNasc) {
        dataNasc = _dataNasc;
    }
   
    public void setEndereco(String _endereco) {
        endereco = _endereco;
    }

    
    
    
    
/*
 * Metodos Get
 */   
    
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    public String getCPF() {
        return CPF;
    }
    
    public int getRG() {
        return RG;    
    }
    
    public String getTelefone() {
        return telefone;
    }
   
    public String getDataNasc() {
        return dataNasc;
    }
   
    public String getEndereco() {
        return endereco;
    }
    
}
