
package OrientedObjectFundamentals.statics.example01;

/**
 *
 * @author maumneto
 */
public class Usuario {
    private static int id = 0;
    private int idInstance;
    
    public Usuario() {
        idInstance = incrementarId();
    }
    
    private static int incrementarId() {
        return ++id;
    }
    
    public int getIdInstance() {
        return idInstance;
    }
    
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        System.out.println(user1.getIdInstance());
        Usuario user2 = new Usuario();
        System.out.println(user2.getIdInstance());
        Usuario user3 = new Usuario();
        System.out.println(user3.getIdInstance());
        
        System.out.println(Usuario.id);
    }
}
