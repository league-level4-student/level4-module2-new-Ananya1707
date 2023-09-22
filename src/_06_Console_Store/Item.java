package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import _02_Generics_Store.Cart;

public abstract class Item {
	String item;
	
	public JLabel getItem(String item) {
		return new JLabel(loadImage(item));
	}
	
	@SuppressWarnings("rawtypes")
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
