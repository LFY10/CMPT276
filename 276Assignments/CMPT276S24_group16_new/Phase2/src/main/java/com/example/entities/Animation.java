package com.example.entities;

import java.awt.image.BufferedImage;

public class Animation {

    private final BufferedImage[][] animations;
    private final int animationTypes;
    private int currentAnimationType;
    private final int frames;
    private int currentFrame;
    private int animationCounter;
    private int animationSpeed;
    private final int ANIMATION_DEFAULT_SPEED = 144;

    public Animation(GameImage image) {
        this.animationTypes = 2;
        this.frames = 6;
        this.animationCounter = 0;
        this.currentFrame = 0;
        this.currentAnimationType = 0;
        this.animationSpeed = ANIMATION_DEFAULT_SPEED / (frames * 2);
        this.animations = new BufferedImage[animationTypes][frames];
        initializeAnimations(image);
    }

    private void initializeAnimations(GameImage image) {
        BufferedImage trueImage = image.getImage();
        int width = image.getImageWidth();
        int height = image.getImageHeight();
        for (int i = 0; i < animationTypes; i++) {
            for (int j = 0; j < frames; j++) {
                animations[i][j] = trueImage.getSubimage(width * j, height * i, width, height);
            }
        }
    }

    public void update(int index){
        updateCurrentAnimation();
        updateAnimationType(index);
    }
    private void updateCurrentAnimation(){
        animationCounter++;
        if (animationCounter >= animationSpeed) {
            animationCounter = 0;
            currentFrame++;
            if (currentFrame == frames) {
                currentFrame = 0;
            }
        }
    }

    public void updateAnimationType(int index){
        if (index < 0 || index >= animationTypes){
            return;
        }
        this.currentAnimationType = index;
    }

    public BufferedImage getCurrentImage(){
        return animations[currentAnimationType][currentFrame];
    }

    public int getCurrentAnimationType() {
        return currentAnimationType;
    }

    public void setCurrentAnimationType(int currentAnimationType) {
        this.currentAnimationType = currentAnimationType;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getAnimationSpeed() {
        return animationSpeed;
    }

    public void setAnimationSpeed(int animationSpeed) {
        this.animationSpeed = animationSpeed;
    }

    public int getANIMATION_DEFAULT_SPEED() {
        return ANIMATION_DEFAULT_SPEED;
    }

}
