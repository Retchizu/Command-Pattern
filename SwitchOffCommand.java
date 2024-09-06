public class SwitchOffCommand implements Command {
    SmartDevice smartDevice;

    public SwitchOffCommand(SmartDevice smartDevice){
        this.smartDevice = smartDevice;
    }

    @Override
    public void execute() {
      smartDevice.switchOff();
    }
    
    
}
