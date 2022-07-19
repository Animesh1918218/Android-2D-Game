package com.example.flappy_bird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {
    Bitmap background;
    Bitmap[] bird;
    Bitmap tubeTop,tubeBottom;
    Bitmap pinkTubeTop,pinkTubeBottom;
    Bitmap redTubeTop,redTubeBottom;
    Bitmap skyTubeTop,skyTubeBottom;

    public BitmapBank(Resources res) {
    background = BitmapFactory.decodeResource(res,R.drawable.background_image);
    background = scaleImage(background);
    bird = new Bitmap[8];
    bird[0] = BitmapFactory.decodeResource(res,R.drawable.frame1);
    bird[1] = BitmapFactory.decodeResource(res,R.drawable.frame2);
    bird[2] = BitmapFactory.decodeResource(res,R.drawable.frame3);
    bird[3] = BitmapFactory.decodeResource(res,R.drawable.frame4);
    bird[4] = BitmapFactory.decodeResource(res,R.drawable.frame5);
    bird[5] = BitmapFactory.decodeResource(res,R.drawable.frame6);
    bird[6] = BitmapFactory.decodeResource(res,R.drawable.frame7);
    bird[7] = BitmapFactory.decodeResource(res,R.drawable.frame8);
    tubeTop = BitmapFactory.decodeResource(res,R.drawable.pipe_top);
    tubeBottom = BitmapFactory.decodeResource(res,R.drawable.pipe_bottom);
    pinkTubeTop = BitmapFactory.decodeResource(res,R.drawable.pink_pipe_top);
    pinkTubeBottom = BitmapFactory.decodeResource(res,R.drawable.pink_pipe_bottom);
    redTubeTop = BitmapFactory.decodeResource(res,R.drawable.red_pipe_top);
    redTubeBottom = BitmapFactory.decodeResource(res,R.drawable.red_pipe_bottom);
    skyTubeTop = BitmapFactory.decodeResource(res,R.drawable.sky_pipe_top);
    skyTubeBottom = BitmapFactory.decodeResource(res,R.drawable.sky_pipe_bottom);

    }
    public Bitmap getSkyTubeTop()
    {
        return skyTubeTop;
    }
    public Bitmap getSkyTubeBottom()
    {
        return  skyTubeBottom;
    }
    public Bitmap getRedTubeTop()
    {
        return redTubeTop;
    }
    public Bitmap getRedTubeBottom()
    {
        return  redTubeBottom;
    }

    public Bitmap getPinkTubeTop()
    {
        return pinkTubeTop;
    }
    public Bitmap getPinkTubeBottom()
    {
        return  pinkTubeBottom;
    }

    public Bitmap getTubeTop()
    {
        return tubeTop;
    }
    public Bitmap getTubeBottom()
    {
        return tubeBottom;
    }
    public int getTubeWidth()
    {
        return tubeTop.getWidth();
    }
    public int getTubeHeight()
    {
        return tubeTop.getHeight();
    }
    public Bitmap getBird(int frame){
        return bird[frame];

    }
    public int getBirdWidth(){
        return bird[0].getWidth();
    }
    public int getBirdHeight(){
        return bird[0].getHeight();
    }
    public Bitmap getBackground(){
        return background;
    }
    public int getBackgroundWidth(){
        return background.getWidth();
    }
    public int getBackgroundHeight(){
        return background.getHeight();
    }
    public Bitmap scaleImage(Bitmap bitmap){
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        int backgroundScaledWidth = (int) widthHeightRatio * AppConstants.screenHeight;
        return Bitmap.createScaledBitmap(bitmap,backgroundScaledWidth,AppConstants.screenHeight,false);
    }
}
