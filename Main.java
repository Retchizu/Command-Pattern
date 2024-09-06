public class Main {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        
        Command switchOnLight = new SwitchOnCommand(light);
        Command switchOffLight = new SwitchOffCommand(light);

        Command adjustBrightness = new SetLightBrightness((Light)light, 100);
        CentralHub centralHub = new CentralHub();
        
        //using central hub
        centralHub.setCommand(switchOnLight);
        centralHub.pressButton();

        centralHub.setCommand(adjustBrightness);
        centralHub.pressButton();

        centralHub.setCommand(switchOffLight);
        centralHub.pressButton();

        SmartDevice musicPlayer = new MusicPlayer();
        Command switchOnMusicPlayer = new SwitchOnCommand(musicPlayer);
        Command switchOffMusicPlayer = new SwitchOffCommand(musicPlayer);
        Command adjustMusicPlayerVolume = new SetVolumeLevel((MusicPlayer)musicPlayer, 86);
        //not using central hub
        switchOnMusicPlayer.execute();

       //using central hub
  
        centralHub.setCommand(adjustMusicPlayerVolume);
        centralHub.pressButton();

        centralHub.setCommand(switchOffMusicPlayer);
        centralHub.pressButton();
    }
}
