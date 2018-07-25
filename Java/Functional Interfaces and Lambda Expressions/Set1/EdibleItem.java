public interface EdibleItem {
    void taste();

    void isSweet();

    void isSour();

    void isSpicy();
    
    default void isHorrible() {
        System.out.println("Maybe");
    }
}