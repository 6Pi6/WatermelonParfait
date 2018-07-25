public class MyWatermelon{

    public static void main(String[] args) {

        int[] array = new int[] {5, 7, 35, 3, 21, 3, 12, 6, 24, 0, 7, 4, 100};
        Watermelon watermelon = new Watermelon();

        // isEven()
        System.out.println("Even numbers in the array---------->"); 
        watermelon.isSomething(array, (a) -> {
            if(a % 2 == 0 ) {
                return true;
            } else {
                return false;
            }
        });
        
        //isOdd()
        System.out.println("Odd numbers in the array---------->");
        watermelon.isSomething(array, (a) -> {
            if(a % 2 != 0 ) {
                return true;
            } else {
                return false;
            }
        });
    }
}