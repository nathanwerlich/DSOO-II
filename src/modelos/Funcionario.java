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
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String CPF;
    private String RG;
    private String telefone;
    private String dataNasc;
    private String endereco;
    private String cargo;
    private String salario;
    private String usuario;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String cpf, String rg, String telefone, String dataNasc,
                                    String endereco, String cargo, String salario, String usuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = cpf;
        this.RG = rg;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
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
    
    public void setRG(String _RG) {
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
    
    public void setCargo(String _cargo) {
        cargo = _cargo;
    }
   
    public void setSalario(String _salario) {
        salario = _salario;
    }
  
    public void setUsuario(String _usuario) {
        usuario = _usuario;
    }    
    
    public void setSenha(String _senha) {
        senha = _senha;
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
    
    public String getRG() {
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
    
    public String getCargo() {
        return cargo;
    }
   
    public String getSalario() {
        return salario;
    }
  
    public String getUsuario() {
        return usuario;
    }    
    
    public String getSenha() {
        return senha;
    }     
    
    
}
