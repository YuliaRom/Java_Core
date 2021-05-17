public class Human implements CanRun, CanJump {

    private int maxLength;
    private int maxHeight;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public int run () {
        System.out.println("Я человек, я бегу");
        return maxLength;
    }

    @Override
    public int jump () {
        System.out.println("Я человек, я прыгаю");
        return maxHeight;
    }
}