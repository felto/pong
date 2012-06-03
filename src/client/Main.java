package client;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Main {
	public static void main(String args[]) throws MalformedURLException, IOException {
		System.out.println("YOU GIT!");
		System.out.println("NO, YOU'RE A GIT!");
		
		final BufferedImage img = ImageIO.read(new URL("http://www.baconbabble.com/wp-content/uploads/2011/05/smile-1.jpg"));
		JFrame jF = new JFrame(":)");
		
		jF.add(new JPanel() {
			private static final long serialVersionUID = 3303264469218221735L;

			@Override
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, new ImageObserver() {
					@Override
					public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
						return true;
					}
				});
			}
		});
		
		jF.setResizable(false);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
		jF.pack();
		jF.setVisible(true);
	}
}
