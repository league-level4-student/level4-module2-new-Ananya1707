package _02_Generics_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

public class Cart<T extends Object> {
    private T[] cart;

	@SuppressWarnings("unchecked")
	public Cart() {
        cart = (T[]) new Cart[5];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 5 items");
    }

    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                panel.add(((NonFood)cart[i]).getNonFood());
            }
        }
        frame.pack();

    }

    public int length() {
        return cart.length;
    }
    
    public void remove(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == item) {
                cart[i] = null;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Your cart does not have that item");
    }
}
