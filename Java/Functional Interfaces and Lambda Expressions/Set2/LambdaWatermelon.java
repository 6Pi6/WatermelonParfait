public class LambdaWatermelon {
    public static void main(String[] args) {
        
        WatermelonyClass myClass = new WatermelonyClass();
        myClass.watermelonyMethod(12, "Yay!!");

        // Lambda expression -- Functional Interfaces
        WatermelonyInterface watermelonyInterface = (a, b) -> {
            System.out.println(a + " "+b);
        };

        watermelonyInterface.watermelonyMethod(2, "Hahahahah !");
    }
}