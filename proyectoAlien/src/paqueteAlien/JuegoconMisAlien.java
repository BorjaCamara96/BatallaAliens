package paqueteAlien;

import java.util.Scanner;

public class JuegoconMisAlien {
    
    public static void main(String[] args) throws InterruptedException {
        //Llama a metodo Scanner para introducir datos por pantalla a traves de objeto 'sc'
    	Scanner sc = new Scanner(System.in);
        //Se declara variable booleana para control de errores por datos introducidos por pantalla.
    	boolean control = true;
        //Se declara variable que posteriormente servira como control en el caso de querer repetir
    	int rep;
        //Declara objeto llamado 'velociraptor' 
        Alien velociraptor = new Alien();
        //Declara String vacio para nombre de objeto creado
        String nameVeloc = "";
        //Bucle que se repite en caso de no introducir datos correctos, mientras que la variable 'control' sea FALSE
        do {
            //Control de errores 
            try {
                    //Introducimos por pantalla valor String para variable 'nameValoc'
                    System.out.println("Introduce un nombre para el Velociraptor:");
                    nameVeloc = sc.nextLine();
                    //En caso de no dar error, tornamos 'control' a TRUE
                    control = true;
            }
            catch(Exception e) {
                    //En caso de introducir datos incorrectos, mostramos mensaje informativo, limpiamos buffer de 'sc' y tornamos 'control' a FALSE
                    System.out.println("Ha introducido un valor no valido...");
                    sc.nextLine();
                    control = false;
            }
        }while(control == false);
        //Introducimos como parametro variable 'nameVeloc' para metodo 'setNombre' de objeto 'velociraptor'
        velociraptor.setNombre(nameVeloc);
        //Mostramos por pantalla el resultado a traves de un metodo 'get'
        System.out.println("El nombre del Velociraptor es "+velociraptor.getNombre());
        //Llamamos a metodo 'nace' de objeto 'velociraptor' que torna su atributo 'vivo' en TRUE
        velociraptor.nace();
        //Condicion, si el metodo 'estavivo' retorna TRUE, mostramos mensaje informando
        if(velociraptor.estavivo() == true) System.out.println("Velociraptor "+velociraptor.getNombre()+" esta vivo");
        //En caso de retornar FALSE, lo mostramos a traves de un mensaje
        else System.out.println("Velociraptor "+velociraptor.getNombre()+" esta muerto");
        //Motramos por pantalla resultados de los metodos 'getNombre' y 'getAgresividad' mostrando valores de los atributos dentro de la clase
        System.out.println("Nivel de agresividad de "+velociraptor.getNombre()+": "+velociraptor.getAgresividad()+" puntos.");
        
        System.out.println("\n// Se vuelve mas agresivo...\n");
        
        //Llamaos a metodo 'masagresivo', que aumentara valor de atributo 'agresividad'
        velociraptor.masagresivo();
        //De nuevo informamos por mensaje segun el valor booleano de atributo 'vivo'
        if(velociraptor.estavivo() == true) System.out.println("Velociraptor "+velociraptor.getNombre()+" esta vivo");
        else System.out.println("Velociraptor "+velociraptor.getNombre()+" esta muerto");
        //Mostramos de nuevo los valores de los atributos y comprobamos que 'agresividad' a aumentado
        System.out.println("Nivel de agresividad de "+velociraptor.getNombre()+": "+velociraptor.getAgresividad()+" puntos.");
        
        System.out.println("\n// Se muere Velociraptor...\n");
        
        //Llamamos a metodo 'muere' que torna atributo booleano 'vivo' a FALSE, y modifica el resto de atributos a '0'
        velociraptor.muere();
         //De nuevo informamos por mensaje segun el valor booleano de atributo 'vivo'
        if(velociraptor.estavivo() == true) System.out.println("Velociraptor "+velociraptor.getNombre()+" esta vivo");
        else System.out.println("Velociraptor "+velociraptor.getNombre()+" esta muerto");
        System.out.println("Nivel de agresividad de "+velociraptor.getNombre()+": "+velociraptor.getAgresividad()+" puntos.");
        
        System.out.println("\n// Se crea un Alien Xenomorfo a traves de un constructor...\n");
        
        //Creamos variables vacias para sus atributos
        String nameXeno = "", origXeno = "";
        int agresXeno = 0, destXeno = 0;
        /*Realizamos control de errores con bucle para repetir operacion en caso de que 'control' retorne a FALSE.
        Si los datos introducidos son correctos, la variable cogera los valores y la variable 'control retornara a TRUE, saliendo del bucle*/
        do {
        	try {
		        System.out.println("Introduce nombre de Xenomorfo:");
		        nameXeno = sc.nextLine();
		        control = true;
        	}
        	catch(Exception e) {
        		System.out.println("Ha introducido un valor no valido...");
                        sc.nextLine();
	    		control = false;
        	}
        }while(control == false);
        do {
    		try {
		        System.out.println("Introduce planeta de origen de Xenomorfo:");
		        origXeno = sc.nextLine();
		        control = true;
    		}
    		catch(Exception e) {
    			System.out.println("Ha introducido un valor no valido...");
                        sc.nextLine();
	    		control = false;
    		}
        }while(control == false);
        do {
    		try {
    			do {
		        	System.out.println("Introduce que agresividad tendra de inicio: (1 - 100)");
		            agresXeno = sc.nextInt();
		            if(agresXeno < 0 || agresXeno > 101){
		                System.out.println("El valor no esta entre 1 y 100.");
		            }
		            else {
		            	control = true;
		            }
    			}while(agresXeno < 0 || agresXeno > 101);
    		} 
    		catch(Exception e) {
    			System.out.println("Ha introducido un valor no valido...");
	    		control = false;
	    		sc.nextLine();
    		}
        }while(control == false);
        do {
    		try {
    			do {
		        	System.out.println("Introduce que destrucción tendra de inicio: (1 - 100)");
		        	destXeno = sc.nextInt();
		            if(destXeno < 0 || destXeno > 101){
		                System.out.println("El valor no esta entre 1 y 100.");
		            }
		            else {
		            	control = true;
		            }
    			}while(destXeno < 0 || destXeno > 101);
    		} 
    		catch(Exception e) {
    			System.out.println("Ha introducido un valor no valido...");
	    		control = false;
	    		sc.nextLine();
    		}
        }while(control == false);
        
        //Creamos objeto 'xenomorfo' a traves de un constructor pasando como parametros las variables anteriores
        Alien xenomorfo = new Alien(nameXeno, agresXeno, origXeno, destXeno);
        
        //Mostramos informacion de objeto creado mediante metodos 'get'
        if(xenomorfo.estavivo() == true) System.out.println("Xenomorfo "+xenomorfo.getNombre()+" esta vivo");
        else System.out.println("Xenomorfo "+xenomorfo.getNombre()+" esta muerto");
        System.out.println("Nivel de agresividad de "+xenomorfo.getNombre()+": "+xenomorfo.getAgresividad()+" puntos.\n"
        		+ "Poder de destrucción de "+xenomorfo.getNombre()+": "+xenomorfo.getpoderDestruccion()+" puntos.\n"
                        + "Planeta de origen de "+xenomorfo.getNombre()+": "+xenomorfo.getPlanetaOrigen()+".");
        
        System.out.println("\nIntroduce INTRO para continuar...");
        sc.nextLine();
        
        do {
        	sc.nextLine();  
	        System.out.println("\n// Se crean Aliens a traves de un vector...\n");
	        
                //Declara variable con numero de objetos a crear
	        int numAliens = 8;
                //Declara objeto vector con longitud de valor 'numAliens'
	        Alien AliensV[] = new Alien [numAliens];
	        for(int i = 0;i<AliensV.length;i++) {
                    //Se llama a metodo constructor vacio para crear objeto
	            AliensV[i] = new Alien();
                    //Se dan valores a atributos correspondientes, en algunos casos de forma aleatoria
	            AliensV[i].nace();
	            AliensV[i].setordenAlien(i+1);
	            AliensV[i].setNombreRM();
	            AliensV[i].setPlanetaOrigenRM();
	            AliensV[i].setAgresividadRM();
	            AliensV[i].setpoderDestruccionRM();
	            //Se muestra por pantalla informacion sobre el objeto vector creado posicion por posicion
	            System.out.println("*·*·*·*·*·*·*·*·*·*·*·*·*·*\nALIEN "+AliensV[i].getordenAlien()+":\n\nNOMBRE: "+AliensV[i].getNombre()+"\nPLANETA: "+AliensV[i].getPlanetaOrigen()+""
	                    + "\nAGRESIVIDAD: "+AliensV[i].getAgresividad()+"\nPODER DESTRUCCIÓN: "+AliensV[i].getpoderDestruccion()+"\n*·*·*·*·*·*·*·*·*·*·*·*·*·*");
	        }      
	        
	        System.out.println("Introduce INTRO para continuar...");
	        sc.nextLine();        
	        
	        System.out.println("\n// Metodo que ordena Aliens por PODER DE DESTRUCCIÓN...\n");
	        
                //Declara nuevo objeto vector auxiliar con la misma longitud que vector anterior
	        Alien[] AliensVAux = new Alien [AliensV.length];
	    	for(int i=0;i<AliensV.length;i++) {
                        //Crea nuevo objeto
	    		AliensVAux[i] = new Alien();
                        //Vuelcan sobre objeto vector auxiliar los mismos datos que el objeto vector original, a traves de metodos 'set' y 'get'
	    		AliensVAux[i].nace();
	    		AliensVAux[i].setordenAlien(AliensV[i].getordenAlien());
	    		AliensVAux[i].setNombre(AliensV[i].getNombre());
	    		AliensVAux[i].setAgresividad(AliensV[i].getAgresividad());
	    		AliensVAux[i].setPlanetaOrigen(AliensV[i].getPlanetaOrigen());
	    		AliensVAux[i].setpoderDestruccion(AliensV[i].getpoderDestruccion());
	    	}
	    	
                //Llama a metodo 'ordenarAliens' de clase Alien, y pasa como parametro el objeto vector AliensVAux
	    	Alien.ordenarAliens(AliensVAux);
	        
                //Se muestra informacion de vector auxiliar una vez a sido ordenador por metodo anterior de menor a mayor por su atributo 'poderDeDestruccion'
	        for(int i = 0;i<AliensV.length;i++) {
	            System.out.println("*·*·*·*·*·*·*·*·*·*·*·*·*·*\nALIEN "+AliensVAux[i].getordenAlien()+":\n\nNOMBRE: "+AliensVAux[i].getNombre()+"\nPLANETA: "+AliensVAux[i].getPlanetaOrigen()+""
	                    + "\nAGRESIVIDAD: "+AliensVAux[i].getAgresividad()+"\nPODER DESTRUCCIÓN: "+AliensVAux[i].getpoderDestruccion()+"\n*·*·*·*·*·*·*·*·*·*·*·*·*·*");
	        }      
	        
	        System.out.println("Introduce INTRO para continuar...");
	        sc.nextLine();
	        
	        System.out.println("\n// Prueba de PODER DE DESTRUCCIÓN...\n");
	        
                //Muestra por pantalla primer y ultimo objeto de vector
	        System.out.println("Se probara el PODER DE DESTRUCCIÓN de ALIEN "+AliensV[0].getordenAlien()+" || NOMBRE: "+AliensV[0].getNombre()+" || PODER DE DESTRUCCIÓN: "+AliensV[0].getpoderDestruccion()+" y "
	        		+ "ALIEN "+AliensV[AliensV.length-1].getordenAlien()+" || NOMBRE: "+AliensV[AliensV.length-1].getNombre()+" || PODER DE DESTRUCCIÓN: "+AliensV[AliensV.length-1].getpoderDestruccion()+".\n");
	        //Llama a metodo 'pruebaPoder' de clase Alien para obtener cual de los dos objetos pasados por parametros tiene mayor valor en atributo 'poderDeDestruccion'
                System.out.println(AliensV[0].pruebaPoder(AliensV[0], AliensV[AliensV.length-1]).getNombre()+" tiene más PODER DE DESTRUCCIÓN.");
	        
	        System.out.println("\n// Modo COMBATE Y TORNEO...\n");
	        
                System.out.println("Introduce INTRO para continuar...");
	        sc.nextLine();
	        
	        System.out.println("\n// Cuartos de final...\n");
	        
	        System.out.println("Introduce INTRO para continuar...");
	        sc.nextLine();
                
                //Declara objeto vector con longitud de 4
	        Alien[] AliensVCuartos = new Alien[4];
                //Declara variable 'x' para un numero de vueltas al bucle y variable 'y' para la seleccion de dos en dos las posiciones de objeto vector
	        int x = 0, y = 0;
                //Bucle para hacer las vueltas
	    	do {
                    //Constructor vacio que crea nuevo objeto vector en posicion de 'x'
	            AliensVCuartos[x] = new Alien();
                    //Muestra por pantalla informacion a traves de 'get'
	            System.out.println("\n##############\nALIEN "+AliensV[y].getordenAlien()+" | NOMBRE: "+AliensV[y].getNombre()+" | PLANETA: "+AliensV[y].getPlanetaOrigen()+" | AGRESIVIDAD: "+AliensV[y].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensV[y].getpoderDestruccion()+"\n"
	                            + "### VERSUS ### \n"
	                            + "ALIEN "+AliensV[y+1].getordenAlien()+" | NOMBRE: "+AliensV[(y+1)].getNombre()+" | PLANETA: "+AliensV[(y+1)].getPlanetaOrigen()+"| AGRESIVIDAD: "+AliensV[(y+1)].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensV[(y+1)].getpoderDestruccion()+"\n##############\n");
	            
	            System.out.println("// Combatiendo...\n");
	            
                    /*Llama a metodo 'combate' de clase Aliente y pasa los dos objetos como parametros
                    Vuelca los atributos del objeto retornado de metodo 'combate' al nuevo objeto creado                    */
	            AliensVCuartos[x] = Alien.combate(AliensV[y], AliensV[y+1]);
	            AliensVCuartos[x].nace();
	            AliensVCuartos[x].setordenAlien(Alien.combate(AliensV[y], AliensV[y+1]).getordenAlien());
	            AliensVCuartos[x].setNombre(Alien.combate(AliensV[y], AliensV[y+1]).getNombre());
	            AliensVCuartos[x].setAgresividad(Alien.combate(AliensV[y], AliensV[y+1]).getAgresividad());
	            AliensVCuartos[x].setPlanetaOrigen(Alien.combate(AliensV[y], AliensV[y+1]).getPlanetaOrigen());
	            AliensVCuartos[x].setpoderDestruccion(Alien.combate(AliensV[y], AliensV[y+1]).getpoderDestruccion());
	            
                    //Muestra por mensaje que objeto a retornado
                    Alien.ganador(AliensV[y], AliensV[y+1]);
                    //Incrementa 'x' en uno y 'y' en 2 para obtener en la proxima vuelta las dos siguientes posiciones del vector
	            x++;
	            y += 2;
	    	}while(x < 4);
	    	
	    	System.out.println("\n// Semifinal...\n");
	    	
	    	System.out.println("Introduce INTRO para continuar...");
	    	sc.nextLine();
	    	
	    	Alien[] AliensVSemis = new Alien[2];
	    	x = 0;
	    	y = 0;
	    	do {
	            AliensVSemis[x] = new Alien();
	                System.out.println("\n##############\nALIEN "+AliensVCuartos[y].getordenAlien()+" | NOMBRE: "+AliensVCuartos[y].getNombre()+" | PLANETA: "+AliensVCuartos[y].getPlanetaOrigen()+" | AGRESIVIDAD: "+AliensVCuartos[y].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensVCuartos[y].getpoderDestruccion()+"\n"
	                                + "### VERSUS ### \n"
	                                + "ALIEN "+AliensVCuartos[y+1].getordenAlien()+" | NOMBRE: "+AliensVCuartos[(y+1)].getNombre()+" | PLANETA: "+AliensVCuartos[(y+1)].getPlanetaOrigen()+" | AGRESIVIDAD: "+AliensVCuartos[(y+1)].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensVCuartos[(y+1)].getpoderDestruccion()+"\n##############\n");
	                
	                System.out.println("// Combatiendo...\n");
	                
	                AliensVSemis[x] = Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]);
	                AliensVSemis[x].nace();
	                AliensVSemis[x].setordenAlien(Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]).getordenAlien());
	                AliensVSemis[x].setNombre(Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]).getNombre());
	                AliensVSemis[x].setAgresividad(Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]).getAgresividad());
	                AliensVSemis[x].setPlanetaOrigen(Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]).getPlanetaOrigen());
	                AliensVSemis[x].setpoderDestruccion(Alien.combate(AliensVCuartos[y], AliensVCuartos[y+1]).getpoderDestruccion());
	                Alien.ganador(AliensVCuartos[y], AliensVCuartos[y+1]);
	                x++;
	                y += 2;
	    	}while(x < 2);
	    	
	    	System.out.println("\n// FINAL...\n");
	    	
	    	System.out.println("Introduce INTRO para continuar...");
	    	sc.nextLine();
	    	
	    	Alien AlienGanador = new Alien();
	    	System.out.println("##############\nALIEN "+AliensVSemis[0].getordenAlien()+" | NOMBRE: "+AliensVSemis[0].getNombre()+" | PLANETA: "+AliensVSemis[0].getPlanetaOrigen()+" | AGRESIVIDAD: "+AliensVSemis[0].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensVSemis[0].getpoderDestruccion()+"\n"
					+ "### VERSUS ### \n"
					+ "ALIEN "+AliensVSemis[1].getordenAlien()+" | NOMBRE: "+AliensVSemis[1].getNombre()+" | PLANETA: "+AliensVSemis[1].getPlanetaOrigen()+" | AGRESIVIDAD: "+AliensVSemis[1].getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AliensVSemis[1].getpoderDestruccion()+"\n##############\n");
	    	
	        System.out.println("// Combatiendo...\n");
	        
	        AlienGanador = Alien.combate(AliensVSemis[0], AliensVSemis[1]);
	    	AlienGanador.setordenAlien(Alien.combate(AliensVSemis[0], AliensVSemis[1]).getordenAlien());
	    	AlienGanador.setNombre(Alien.combate(AliensVSemis[0], AliensVSemis[1]).getNombre());
	    	AlienGanador.setAgresividad(Alien.combate(AliensVSemis[0], AliensVSemis[1]).getAgresividad());
	    	AlienGanador.setPlanetaOrigen(Alien.combate(AliensVSemis[0], AliensVSemis[1]).getPlanetaOrigen());
	    	AlienGanador.setpoderDestruccion(Alien.combate(AliensVSemis[0], AliensVSemis[1]).getpoderDestruccion());
	    	Alien.ganador(AliensVSemis[0], AliensVSemis[1]);
	    	
	    	
	    	System.out.println("\n// GANADOR!!!\n");
	    	System.out.println("##############\nALIEN "+AlienGanador.getordenAlien()+" | NOMBRE: "+AlienGanador.getNombre()+" | PLANETA: "+AlienGanador.getPlanetaOrigen()+" | AGRESIVIDAD: "+AlienGanador.getAgresividad()+" | PODER DE DESTRUCCIÓN: "+AlienGanador.getpoderDestruccion()+"\n##############");
	    	
	    	try {
		    	System.out.println("\nIntroduce '0' si quiere crear nuevos Aliens. De lo contrario se cerrara el programa.");
		    	rep = sc.nextInt();
	        	}
        	catch(Exception e) {
        		rep = 1;
        	}
        }while(rep == 0);
        System.out.println("Saliendo...");
    }
}
