public class SomeWatermelon implements SomeEdibleItem {

    public void taste() {
        System.out.println("Heavenly !");
    }

    public void isSweet() {
        System.out.println("Yes !!");
    }

    public void isSour() {
        System.out.println("Nope !");
    }

    public void isSpicy() {
        System.out.println("Nope !");
    }

    public void isMoreHorrible() {
        System.out.println("Never !!");
    }

    @Override
    public void isHorrible() {
        System.out.println("Never !!");
    }

}