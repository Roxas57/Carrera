package com.hilos.carrera.Carrera;

import javax.swing.JOptionPane;

import javafx.scene.image.ImageView;

public class Corredor extends Thread {
	
	private ImageView posicion;
	private CarreraController corredor;
	
	public Corredor(ImageView posicion, CarreraController corredor) {
		this.posicion = posicion;
		this.corredor = corredor;
	}

	public void run() {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		
		while(true) {
			try {
				Thread.sleep((int)(Math.random() * 1000));
				c1 = (int) corredor.getC1().getLayoutX();
				c2 = (int) corredor.getC2().getLayoutX();
				c3 = (int) corredor.getC3().getLayoutX();
				c4 = (int) corredor.getC4().getLayoutX();
				
				if(c1 < corredor.getBarrera().getLayoutX() - 50 && c2 < corredor.getBarrera().getLayoutX() - 50 
						&& c3 < corredor.getBarrera().getLayoutX() - 50 && c4 < corredor.getBarrera().getLayoutX() - 50 ) {
					posicion.setLayoutX(posicion.getLayoutX() + 10);
				} else {
					break;
				}
				
				if(posicion.getLayoutX() >= corredor.getBarrera().getLayoutX() - 50) {
					if (c1 > c2) {
						if (c1 > c3) {
							if (c1 > c4) {
								 JOptionPane.showMessageDialog(null, "Ha ganado el corredor Rojo");
							}
						}
					}
					if (c2 > c1) {
						if (c2 > c3) {
							if (c2 > c4) {
								JOptionPane.showMessageDialog(null, "Ha ganado el corredor Azul");
							}
						}
					}
					if (c3 > c1) {
						if (c3 > c2) {
							if (c3 > c4) {
								JOptionPane.showMessageDialog(null, "Ha ganado el corredor Verde");
							}
						}
					}
					if (c4 > c1) {
						if (c4 > c2) {
							if (c4 > c3) {
								JOptionPane.showMessageDialog(null, "Ha ganado el corredor Amarillo");
							}
						}
					}
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			
		}
	}
	
	
}
