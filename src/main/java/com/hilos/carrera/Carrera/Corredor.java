package com.hilos.carrera.Carrera;

import javax.swing.JOptionPane;

import javafx.scene.image.ImageView;

public class Corredor extends Thread {
	
	private ImageView posicion;
	private CarreraController corredor;
	
	private boolean confirm = true;
	
	public Corredor(ImageView posicion, CarreraController corredor) {
		this.posicion = posicion;
		this.corredor = corredor;
	}
	
	public void run() {
		//Estas son las coordenadas de los corredores
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		
		//Con este while lo que hacemos en un bucle "infinito"
		while(confirm) {
			try {
				//En esta línea lo que hacemos es que los hilos avancen poco a poco de forma aleatoria
				Thread.sleep((int)(Math.random() * 1000));
				//Aquí obtenemos la posición las imágenes de los corredores
				c1 = (int) corredor.getC1().getLayoutX();
				c2 = (int) corredor.getC2().getLayoutX();
				c3 = (int) corredor.getC3().getLayoutX();
				c4 = (int) corredor.getC4().getLayoutX();
				
				//Aquí si la posción del los corredores es menor a la de la barrera el programa sigue, si no se finaliza.
				if(c1 < corredor.getBarrera().getLayoutX() - 50 && c2 < corredor.getBarrera().getLayoutX() - 50 
						&& c3 < corredor.getBarrera().getLayoutX() - 50 && c4 < corredor.getBarrera().getLayoutX() - 50 ) {
					posicion.setLayoutX(posicion.getLayoutX() + 10);
				} else {
					break;
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}	
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
	}
	
	
	public boolean pauseRun() {
		return confirm = false;
	}
	
	
}
