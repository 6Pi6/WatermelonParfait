public class Watermelon implements EdibleItem {

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

    @Override
    public void isHorrible() {
        System.out.println("Never ");
    }

}