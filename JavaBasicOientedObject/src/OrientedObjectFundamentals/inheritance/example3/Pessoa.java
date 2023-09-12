/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.example3;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    private int id;
    protected String nome;
    public Departamento departamento;
    
    public Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }
    
    protected int getId() {
        return id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
