import java.util.function.Predicate;

public class Watermelon {    

    // isEven()

    // isOdd()

    public void isSomething(int[] array, Predicate<Integer> predicate) {
        for(int i : array) {
            if(predicate.test(i)) {
                System.out.println( i );
            }
        }
    }


}