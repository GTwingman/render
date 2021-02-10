package ru.lnmo.render;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Render {

    public static void render(BufferedImage img) {

        Vector.tangle(img, 100, 200, 300,200,400,500);
     for (int j = 1; j <= 16; j++) {
            Vector.line(img,500,400,500+Math.cos(j* Math.PI/8 )*100,400+Math.sin(j* Math.PI/8)*100);
     }
        
      for (int j = 1; j <= 3; j++) {
             img.getGraphics().setColor(Color.BLACK);
             img.getGraphics().drawLine(
                     500, 400,
                     (int)(500+Math.cos(j* Math.PI*2/3 )*100),(int)(400+Math.sin(j* Math.PI*2/3)*100)
             );
                Vector.tanglega(img,
                        500+Math.cos(j* Math.PI*2/3 )*100,400+Math.sin(j* Math.PI*2/3)*100,
                        500+Math.cos(j* Math.PI*2/3 )*300,400+Math.sin(j* Math.PI*2/3)*300,
                        500+Math.cos((j+1)* Math.PI*2/3 )*300, 400+Math.sin((j+1)* Math.PI*2/3)*300,
                        j);
         }

    }


}
