/**
 * 
 */
package entities;

import entities.enums.Color;

/**
 * Classe que contem as informacoes das formas
 * 
 * @author Matos
 *
 */
public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
	
}
