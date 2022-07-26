package com.example.flappy_bird;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread{
    SurfaceHolder surfaceHolder;
    boolean isRunning;
    long startTime,loopTime;
    long delay=33;
    public GameThread(SurfaceHolder surfaceHolder){
        this.surfaceHolder=surfaceHolder;
        isRunning=true;

    }

    @Override
    public void run() {
        while (isRunning){
            startTime= SystemClock.uptimeMillis();
            Canvas canvas=surfaceHolder.lockCanvas(null);
            if (canvas!=null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas);
                    AppConstants.getGameEngine().updateAndDrawBird(canvas);
                    AppConstants.getGameEngine().updateAndDrawTubes(canvas);
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            loopTime = SystemClock.uptimeMillis() - startTime;
            if (loopTime<delay)
            {
                try{
                    Thread.sleep(delay-loopTime);
                }catch (InterruptedException e){
                    Log.e( "Interrupted","Interrupted while sleeping");
                }
            }
        }
    }
    public boolean isRunning(){
        return isRunning;
    }
    public void setIsRunning(boolean state)
    {
        isRunning = state;
    }
}
