public class Robot implements CanRun, CanJump {

    private int maxLength;
    private int maxHeight;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public int run () {
        System.out.println("Я робот, я бегу");
        return maxLength;
    }

    @Override
    public int jump () {
        System.out.println("Я робот, я прыгаю");
        return maxHeight;
    }
}