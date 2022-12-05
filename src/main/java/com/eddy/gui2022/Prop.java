package com.eddy.gui2022;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prop {
    private int x, y;
    private Image image;
    private boolean collideable;
    private Rectangle2D hitBox;

    public Prop(String path, int x, int y, boolean collideable) {
        this.x = x;
        this.y = y;
        this.collideable = collideable;
        hitBox = new Rectangle2D(x,y,50,50);


        //load and/or create character data file
        File imageFile = new File(path);
        if (!imageFile.exists()) {
            try {
                imageFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //load external resources
        try {
            image = new Image(new FileInputStream("src/main/resources/com/eddy/gui2022/guy.png"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not load prop image");
        }
    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(image, x, y);
    }

    public boolean colliding(Rectangle2D other) {
        return hitBox.intersects(other);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isCollideable() {
        return collideable;
    }

    public void setCollideable(boolean collideable) {
        this.collideable = collideable;
    }
}
