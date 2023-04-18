public class Main {
    public static void main(String[] args) {
        TemperatureGauge temp = new TemperatureGauge();
        temp.displayTemp();
        

        Speedometer speed = new Speedometer();
        speed.displaySpeed();

        FuelGauge fuel = new FuelGauge();
        fuel.displayFuel();
        fuel.displayMPG();
        
        
    }
}
