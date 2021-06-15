public class CourseImpl implements Course{

    private final String name;

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CourseImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}


