public class SwitchOnCommand implements Command {
    private SmartDevice smartDevice;

    public SwitchOnCommand(SmartDevice smartDevice){
        this.smartDevice = smartDevice;
    }

    @Override
    public void execute() {
        smartDevice.switchOn();
    }
}
