package com.example.musicplayerv2.Model;

public class AudioFile {
    private String path;
    private String title;
    private String artist;
    private String album;
    private String duration;
    private byte[] art;
    private boolean selected;

    public AudioFile(String path, String title, String artist, String album, String duration, byte[] art) {
        this.path = path;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.art = art;
    }

    public AudioFile() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public byte[] getArt() {
        return art;
    }

    public void setArt(byte[] art) {
        this.art = art;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
