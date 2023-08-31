package OrientedObjectFundamentals.ClassRelationship.UniversityProgram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class University {
    public String universityName;
    public String description;
    public List<Course> courses;
    
    public University(String universityName, String description) {
        this.universityName = universityName;
        this.description = description;
        courses = new ArrayList<>();
    }
    
    public String getNameUniversity() {
        return universityName;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void showCoursesName() {
        for(Course c: courses) {
            System.out.println(c.getNameCourse());
        }
    }
    
    public int getTotalCourses() {
        return courses.size();
    }
    
    public int getTotalStudentsUniversity() {
        int totalStudents = 0;
        for(Course c: courses) {
            totalStudents = totalStudents + c.getTotalStudents();
        }
        return totalStudents;
    }
}
