package ru.lnmo.render;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Render {

    public static void render(BufferedImage img) {

        Vector.tangle(img, 100, 200, 300,200,400,500);
     for (int j = 1; j <= 16; j++) {
            Vector.line(img,500,400,500+Math.cos(j* Math.PI/8 )*100,400+Math.sin(j* Math.PI/8)*100);
     }

    }


}