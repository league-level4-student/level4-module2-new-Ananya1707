package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Item{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}
/*
	@Override
	public JLabel getItem() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	*/
}
