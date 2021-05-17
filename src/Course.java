abstract public class Course {

    abstract public boolean doIt(Object participant);

    protected String getClassName(Object object) {
        if(object instanceof Human) {
            return "Человек";
        }
        if(object instanceof Cat) {
            return "Кот";
        }
        if(object instanceof Robot) {
            return "Робот";
        }
        return "Кто-то другой";
    }
}

