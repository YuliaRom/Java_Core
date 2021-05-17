public class Wall extends Course{

    private final int height = 3;

    @Override
    public boolean doIt(Object participant) {
        CanJump canJump = (CanJump) participant;
        int participantMaxHeight = canJump.jump();
        if(participantMaxHeight > height) {
            System.out.println(getClassName(participant) + " смог перепрыгнуть! Ура!");
            return true;
        } else {
            System.out.println(getClassName(participant) + " не смог перепрыгнуть, слишком высокая стена!");
            return false;
        }
    }
}