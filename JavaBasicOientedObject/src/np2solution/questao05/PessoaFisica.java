package np2solution.questao05;

/**
 *
 * @author maumneto
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    public Departamento departamento;
    
    public PessoaFisica(int id, Departamento departamento, String name) {
        super(id, departamento);
        setName(name);
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
