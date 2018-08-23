package com.ezeagu.android.redplayer;

public class Music {

    private String musicTitle;
    private String musicArtiste;
    private String musicTime;
    private int mImageResourceId;

    public Music(String musicTitle, String musicArtiste, String musicTime, int imageResourceId) {
        this.musicTitle = musicTitle;
        this.musicArtiste = musicArtiste;
        this.musicTime = musicTime;
        mImageResourceId = imageResourceId;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getMusicArtiste() {
        return musicArtiste;
    }

    public String getMusicTime() {
        return musicTime;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
