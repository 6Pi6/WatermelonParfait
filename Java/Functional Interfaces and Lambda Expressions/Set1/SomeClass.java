public class SomeClass implements EdibleItem, EdibleItemA {
    
    public void taste() {
        System.out.println("Meow");
    }

    public void isSweet() {
        System.out.println("Haha");
    }

    public void isSour() {
        System.out.println("Water !");
    }
    
    public void isSpicy() {
        System.out.println("Muhahaah!");
    }

    public void isHorrible() {
        EdibleItem.super.isHorrible();
    }

}