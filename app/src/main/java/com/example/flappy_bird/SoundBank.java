package com.example.flappy_bird;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;

public class SoundBank {
    Context context;
    MediaPlayer theme,point,hit,wing;
    public SoundBank(Context context) {
           this.context = context;
           theme = MediaPlayer.create(context,R.raw.theme);
           point = MediaPlayer.create(context,R.raw.point);
           hit = MediaPlayer.create(context,R.raw.hit);
           wing = MediaPlayer.create(context,R.raw.wing);

    }
    public void playTheme(){
        if(theme!=null)
        {
            theme.setLooping(true);
            theme.start();
        }
    }
    public void playPoint(){
        if(point!=null)
        {
            point.start();
        }
    }
    public void playHit(){
        if(hit!=null)
        {
            hit.start();
        }
    }
    public void playWing(){
        if(wing!=null)
        {
            wing.start();
        }
    }
    public void stop(){
        if(theme!=null)
        {
            theme.release();
            theme=null;
        }
    }
}
