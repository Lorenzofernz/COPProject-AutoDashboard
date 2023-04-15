public class TemperatureGauge {
    
     int temp;
     int maxTemp = 250;
     int minTemp = 0;
     int tempRange = maxTemp - minTemp;
     boolean overheated = false;

    public  int getTemp(int temp) {
        temp = (int) (Math.random() * tempRange + minTemp);
        return temp;
    }

    public  void displayTemp() {
        System.out.println("Current temperature: " + getTemp(temp));
    }

    public  boolean isOverheated(int temp) {
        if (temp > 220) {
            return true;
        } else {
            return false;
        }
    }

    public  void displayOverheated() {
        System.out.println("Vehicle is overheated: " + isOverheated(temp));
    }
    
}