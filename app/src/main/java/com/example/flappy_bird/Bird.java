package com.example.flappy_bird;

public class Bird {
    private int birdX,birdY,currentFrame,velocity;
    public static int maxFrame;
    public Bird() {
        birdX = AppConstants.screenWidth/2-AppConstants.getBitmapBank().getBirdWidth()/2;
        birdY = AppConstants.screenHeight/2-AppConstants.getBitmapBank().getBirdHeight()/2;
        currentFrame = 0;
        maxFrame = 7;
        velocity = 0;
    }
    public int getVelocity(){
       return velocity;
    }
    public void setVelocity(int velocity){
        this.velocity= velocity;
    }
    public int getCurrentFrame(){
        return currentFrame;
    }
    public void setCurrentFrame(int currentFrame)
    {
        this.currentFrame=currentFrame;
    }
    public int getX(){
        return birdX;
    }
    public int getY(){
        return birdY;
    }
    public void setX(int birdX)
    {
        this.birdX=birdX;
    }
    public void setY(int birdY)
    {
        this.birdY=birdY;
    }

}
