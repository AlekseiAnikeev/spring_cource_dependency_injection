package ru.agentche.musicplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 01.12.2022
 */
public class MusicPlayer {
    private List<Music> listMusic = new ArrayList<>();
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public void playMusic() {
        listMusic.forEach(musicName -> System.out.println("Playing: " + musicName.getSong()));
    }
}
