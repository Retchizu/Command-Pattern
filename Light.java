public class Light implements SmartDevice{
    private Integer brightnessLevel;

    @Override
    public void switchOn() {
        System.out.println("Light switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Light switched off");
    }

    public void setLightBrightness(Integer brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
        System.out.println("Light brightness adjusted to "+ this.brightnessLevel);
    }
}   
