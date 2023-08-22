/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.Fundamentals;

import java.util.Calendar;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double altura;
    
    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + calcularIdade());
    }
    
    public int calcularIdade() {
        int idade;
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        idade = anoAtual - anoNascimento;
        return idade;
    }
}
