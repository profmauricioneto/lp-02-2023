/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.example3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Departamento {
    private int idDepartamento;
    public String descricao;
    public List<Pessoa> pessoas;
    
    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
        this.pessoas = new ArrayList<>();
    }
    
    protected int getIdDepartamento() {
        return idDepartamento;
    }
}
