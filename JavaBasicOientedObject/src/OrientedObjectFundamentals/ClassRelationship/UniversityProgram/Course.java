package OrientedObjectFundamentals.ClassRelationship.UniversityProgram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Course {
    public String nameCourse;
    public int idCourse;
    public List<Student> group;
    public University university;
    
    public Course(String nameCourse, int idCourse, University university) {
        this.nameCourse = nameCourse;
        this.idCourse = idCourse;
        this.university = university;
        group = new ArrayList<>();
    }
    
    public String getNameCourse() {
        return nameCourse;
    }
    public int getIdCourse() {
        return idCourse;
    }
    
    public void addStudent(Student student) {
        group.add(student);
    }
    
    public int getTotalStudents() {
        return group.size();
    }
    
    public void showAllStudents() {
        for(Student s: group) {
            System.out.println(s.studentName);
        }
    }
}
