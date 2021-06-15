import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Course course1 = new CourseImpl("Математика");
        Course course2 = new CourseImpl("Физика");
        Course course3 = new CourseImpl("Английский язык");
        Course course4 = new CourseImpl("История");
        Course course5 = new CourseImpl("Русский язык");

        Student student1 = new StudentImpl("Иванов", course1, course2, course3);
        Student student2 = new StudentImpl("Петров", course3, course2);
        Student student3 = new StudentImpl("Сидоров", course1, course2, course3, course4, course5);
        Student student4 = new StudentImpl("Васечкин", course2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Список уникальных курсов");
        System.out.println(getUniqueCourses(students));

        System.out.println("Список самых любознательных студентов");
        System.out.println(getMostInquisitiveStudents(students));

        System.out.println("Список студентов, посещающих курс 'Физика'");
        System.out.println(getStudentsByCourse(students, course2));
    }


       public static List<Course> getUniqueCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<Student> getMostInquisitiveStudents(List<Student> students) {
        List<Student> studentsSorted = students.stream()
                .sorted(Comparator.comparingInt(student -> student.getAllCourses().size()))
                .collect(Collectors.toList());
        Collections.reverse(studentsSorted);
        return studentsSorted.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

   
    public static List<Student> getStudentsByCourse(List<Student> students, Course course) {
        return students.stream()
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }
}


