public class MusicPlayer implements SmartDevice{
    private Integer volumeLevel;

    @Override
    public void switchOn() {
        System.out.println("Music Player switched on");
    }

    @Override
    public void switchOff() {
      System.out.println("Music Player switched off");
    }

    public void setMusicPlayerVolume(Integer volumeLevel){
        this.volumeLevel = volumeLevel;
        System.out.println("Volume adjusted to "+ this.volumeLevel);
    }
    
}
