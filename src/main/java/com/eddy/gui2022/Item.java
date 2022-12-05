package com.eddy.gui2022;

import javafx.scene.canvas.GraphicsContext;

public class Item extends Prop{

    private String description;

    public Item(String path, int x, int y, boolean collideable, String description) {
        super (path, x, y, collideable);
        this.description = description;
    }
    public void inspect(GraphicsContext gc) {
        gc.fillText("Hello", 100, 100);
    }


}
