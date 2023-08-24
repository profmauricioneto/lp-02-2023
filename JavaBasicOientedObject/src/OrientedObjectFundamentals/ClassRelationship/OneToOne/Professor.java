package OrientedObjectFundamentals.ClassRelationship.OneToOne;

/**
 *
 * @author maumneto
 */
public class Professor {
    public String name;
    public int id_professor;
    public Course course;
    
    public Professor(String name, int id_professor, Course course) {
        this.name = name;
        this.id_professor = id_professor;
        this.course = course;
    }
}
