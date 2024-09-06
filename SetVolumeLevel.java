public class SetVolumeLevel implements Command {
    private MusicPlayer musicPlayer;
    private Integer volumeLevel;

    public SetVolumeLevel(MusicPlayer musicPlayer, Integer volumeLevel) {
        this.musicPlayer = musicPlayer;
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void execute() {
        musicPlayer.setMusicPlayerVolume(volumeLevel);
    }
    
}
