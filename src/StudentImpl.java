import java.util.Arrays;
import java.util.List;

public class StudentImpl implements Student{
    private final String name;
    private final List<Course> courses;

    public StudentImpl(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public StudentImpl(String name, Course... courses) {
        this.name = name;
        this.courses = Arrays.asList(courses);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}

