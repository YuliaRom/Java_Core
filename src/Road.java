public class Road extends Course {

    private final int length = 50;

    @Override
    public boolean doIt(Object participant) {
        CanRun canRun = (CanRun) participant;
        int participantMaxLength = canRun.run();
        if(participantMaxLength > length) {
            System.out.println(getClassName(participant) + " смог пробежать! Ура!");
            return true;
        } else {
            System.out.println(getClassName(participant) + " не смог пробежать, слишком длинная дистанция!");
            return false;
        }
    }
}