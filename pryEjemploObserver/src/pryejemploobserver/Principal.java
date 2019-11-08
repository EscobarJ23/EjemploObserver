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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Subject subject = new Subject();

		new DolarObservador(subject);
		new PesoArgObservador(subject);
		new PesoMexObservador(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
