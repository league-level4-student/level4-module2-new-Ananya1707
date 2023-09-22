package _02_Generics_Store;

import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import _06_Console_Store.Item;


public abstract class Food extends Item{
    String item;

    //public abstract JLabel getFood();
    public abstract JLabel getItem();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
