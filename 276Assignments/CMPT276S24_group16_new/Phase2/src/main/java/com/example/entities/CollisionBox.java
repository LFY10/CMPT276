package com.example.entities;

import com.example.utils.Position;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CollisionBox {
    private final Rectangle2D.Float collisionBox;
    private final int xRenderDifference;
    private final int yRenderDifference;

    public CollisionBox(Position pos, Dimension dim, int xRenderDifference, int yRenderDifference) {
        this.xRenderDifference = xRenderDifference;
        this.yRenderDifference = yRenderDifference;
        this.collisionBox = new Rectangle2D.Float(pos.getX(), pos.getY(), dim.width, dim.height);
    }

    /**
     * /**
     * Draws the collision box of the entity for debugging purposes.
     *
     * @param g The graphics object used for drawing the collision box.
     * @author Pardeep Singh Manhas
     */
    public void drawCollisionBox(Graphics g) {
        g.drawRect((int) collisionBox.x, (int) collisionBox.y, (int) collisionBox.width, (int) collisionBox.height);
    }

    /**
     * Retrieves the collision box of the entity. The collision box is generally smaller than the entities size. Used for
     * collision/entity detection.
     *
     * @return The collision box of the entity.
     * @author Pardeep Singh Manhas
     */
    public Rectangle2D.Float getCollisionBox() {
        return collisionBox;
    }

    public int getxRenderDifference() {
        return xRenderDifference;
    }

    public int getyRenderDifference() {
        return yRenderDifference;
    }

    public float getCurrentXPos() {
        return collisionBox.x;
    }

    public float getCurrentYPos() {
        return collisionBox.y;
    }

    public void setCurrentXPos(float newX) {
        collisionBox.x = newX;
    }

    public void setCurrentYPos(float newY) {
        collisionBox.y = newY;
    }

    public float getWidth(){
        return collisionBox.width;
    }

    public float getHeight(){
        return collisionBox.height;
    }
}
