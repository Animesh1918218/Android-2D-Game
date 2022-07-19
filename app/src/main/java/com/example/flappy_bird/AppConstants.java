package com.example.flappy_bird;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class AppConstants {
    static BitmapBank bitmapBank;
    static GameEngine gameEngine;
    static int screenWidth,screenHeight;
    static int gravity;
    static  int velocityWhenJumped;
    static int gapBetweenTopAndBottomTubes;
    static int numberOfTubes;
    static int tubeVelocity;
    static int minTubeOffsetY;
    static int maxTubeOffsetY;
    static int distanceBetweenTubes;
    static SoundBank soundBank;
    static Context gameActivityContext;
    public static void initialization(Context context){
        setScreenSize(context);
        bitmapBank = new BitmapBank(context.getResources());
        setGameConstants();
        gameEngine = new GameEngine();
        soundBank = new SoundBank(context);
    }
    public static SoundBank  getSoundBank(){
        return soundBank;
    }
    public static void setGameConstants()
    {
        AppConstants.gravity = 3;
        AppConstants.velocityWhenJumped = -30;
        AppConstants.gapBetweenTopAndBottomTubes = 500;
        AppConstants.numberOfTubes = 2;
        AppConstants.tubeVelocity = 12;
        AppConstants.minTubeOffsetY = (int)(AppConstants.gapBetweenTopAndBottomTubes/2.0);
        AppConstants.maxTubeOffsetY = AppConstants.screenHeight-AppConstants.minTubeOffsetY-AppConstants.gapBetweenTopAndBottomTubes;
        AppConstants.distanceBetweenTubes = AppConstants.screenWidth*3/4;
    }
    public static BitmapBank getBitmapBank()
    {
        return bitmapBank;
    }
    public static GameEngine getGameEngine(){
        return gameEngine;
    }
    private static void setScreenSize (Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        AppConstants.screenWidth=width;
        AppConstants.screenHeight=height;
    }
}
