package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Consolas.Nintendo;
import Consolas.PlayStation;
import Consolas.Xbox;

public class Main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		ArrayList<PlayStation> playStations = new ArrayList<PlayStation>();
		ArrayList<Xbox>xboxs= new ArrayList<Xbox>();
		ArrayList<Nintendo> nintendos = new ArrayList<Nintendo>();
		
		String noSerie;
		int year;
		String paisDeOrigen;
		String nombre;
		
		boolean bandera=true;
		
		while(bandera==true) {
			System.out.println("Introduce la consola que deseas registrar ");
			System.out.println("1: Registrar PlayStation");
			System.out.println("2: Registrar Xbox");
			System.out.println("3: Registrar Nintendo");
			System.out.println("4: Mostrar Playstations");
			System.out.println("5: Mostrar Xboxs");
			System.out.println("6: Mostrar Nintendos");
			
			int opcion= lector.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Introduce número de serie");
					lector.nextLine();
					noSerie=lector.nextLine();
					System.out.println("Introduce nombre");
					nombre=lector.nextLine();
					System.out.println("Introduce país de origen");
					paisDeOrigen=lector.nextLine();
					System.out.println("Introduce año de consola");
					year=lector.nextInt();
					
					PlayStation ps = new PlayStation(nombre,paisDeOrigen,year,noSerie);
					
					playStations.add(ps);
					
					break;
					
				case 2:
					System.out.println("Introduce número de serie");
					lector.nextLine();
					noSerie=lector.nextLine();
					System.out.println("Introduce nombre");
					nombre=lector.nextLine();
					System.out.println("Introduce país de origen");
					paisDeOrigen=lector.nextLine();
					System.out.println("Introduce año de consola");
					year=lector.nextInt();
					
					Xbox xbox = new Xbox(nombre,paisDeOrigen,year,noSerie);
					xboxs.add(xbox);
					
					break;
					
				case 3:
					System.out.println("Introduce número de serie");
					lector.nextLine();
					noSerie=lector.nextLine();
					System.out.println("Introduce nombre");
					nombre=lector.nextLine();
					System.out.println("Introduce país de origen");
					paisDeOrigen=lector.nextLine();
					System.out.println("Introduce año de consola");
					year=lector.nextInt();
					
					Nintendo nintendo= new Nintendo(nombre,paisDeOrigen,year,noSerie);
					nintendos.add(nintendo);
					
					break;
					
				case 4:
					
					for(int i =0; i<playStations.size();i++) {
						System.out.println(playStations.get(i));
					}
					
					break;
				case 5:
					
					for(int i =0; i<xboxs.size();i++) {
						System.out.println(xboxs.get(i));
					}
					
					break;
					
				case 6:
					
					for(int i =0; i<nintendos.size();i++) {
						System.out.println(nintendos.get(i));
					}
					
					 break;
					
					default:
						System.out.println("Opcion invalida");
					break;
						
			}
			
			System.out.println("Desea continuar registrando consolas?");
			System.out.println("true: continuar");
			System.out.println("false: no continuar");
			bandera=lector.nextBoolean();
		}
		
		lector.close();

	}

}
