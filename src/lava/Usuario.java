/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lava;

/**
 *
 * @author aluno TDS
 */
public class Usuario {
    
    private String nome;
    private String sobrenome;
    private Carro carro;
    
     public Usuario(){
        this.nome = "";
        this.sobrenome = "";
    }
    public Usuario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.carro = null;
    }
    public String getNome(){
        return this.nome;
    }    
    public String getSobrenome(){
        return this.sobrenome;
    }    
    
    public void setcarro(Carro carro){
        this.carro = carro;
    }
        
    public Carro getcarro(Carro carro){
        return this.carro;
    }
    
    public String exibeUsuario(){
        return "Nome e Sobrenome: " + this.nome + " " + this.sobrenome + " Carro: " + this.carro.exibeCarro();
    }
    
}
