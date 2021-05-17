import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(500, 1);
        Cat cat = new Cat(300, 2);
        Robot robot = new Robot(150, 5);
        Object[] participants = {human, cat, robot};

        Road road = new Road();
        Wall wall = new Wall();
        List<Course> courses = new ArrayList<Course>() {{
            add(road);
            add(wall);
        }};

        for (Course course : courses) {
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] != null) {
                    boolean result = course.doIt(participants[i]);
                    if (!result) {
                        participants[i] = null;
                    }
                }
            }
        }
    }
}
