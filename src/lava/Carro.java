/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lava;

/**
 *
 * @author aluno TDS
 */
public class Carro {
     
    private String Marca;
    private String modelo;
    private int anofabricacao;
    private String cor;
    private String placa;
    
    
    public Carro(String Marca, String modelo, int ano, String cor, String placa){
        this.Marca = Marca;
        this.modelo = modelo;
        this.anofabricacao = ano;
        this.cor = cor;      
        this.placa = placa;
    }
    
     public String exibeCarro(){
        return " Marca: " + this.Marca + " Modelo: " + this.modelo + " Ano: " + this.anofabricacao + " Cor: " +this.cor + "Placa: " +this.placa;
    }
    
}
