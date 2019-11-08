/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryejemploobserver;

/**
 *
 * @author Taty Escobar
 */
public class PesoArgObservador extends Observador {

	private double valorCambio = 29.86;
	
	public PesoArgObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
	}
}
