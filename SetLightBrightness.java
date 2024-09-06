public class SetLightBrightness implements Command {
    private Light light;
    private Integer brightnessLevel;

    public SetLightBrightness(Light light, Integer brightnessLevel) {
        this.light = light;
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    public void execute() {
        light.setLightBrightness(brightnessLevel);
    }
    
}
