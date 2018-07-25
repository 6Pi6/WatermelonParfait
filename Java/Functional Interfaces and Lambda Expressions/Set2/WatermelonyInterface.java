@FunctionalInterface
public interface WatermelonyInterface {
    // This is a functional interface
    void watermelonyMethod(int a, String b);    
    
    default void sayOuch() {
        System.out.println("Ouch !!");
    }
}   