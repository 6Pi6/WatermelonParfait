public class AwesomeWatermelon {
    public static void main(String[] args) {
        // ananonymous class
        WatermelonyInterface watermelonyInterface = new WatermelonyInterface() {
            public void watermelonyMethod() {
                System.out.println("Yay, Watermelon !!");
            }  
        };
        watermelonyInterface.watermelonyMelthod();        
    }
}