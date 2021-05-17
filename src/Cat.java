public class Cat implements CanRun, CanJump{
    private int maxLength;
    private int maxHeight;

    public Cat(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public int run () {
        System.out.println("Я кот, я бегу");
        return maxLength;
    }
    @Override
    public int jump () {
        System.out.println("Я кот, я прыгаю");
        return maxHeight;
    }
}
