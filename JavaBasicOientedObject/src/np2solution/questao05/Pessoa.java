/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package np2solution.questao05;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    private int id;
    protected String name;
    public Departamento departamento;
    
    public Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }
    
    protected int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
