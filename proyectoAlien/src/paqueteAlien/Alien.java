package paqueteAlien;

import java.util.Random;

public class Alien {
    private int ordenAlien = 0;
    private String nombre;
    private static String[] listaNombres = {"UULQUL", "TOL", "KROGNOX", "SCAER'OID", "SCRIRGUID", "VRUD", "DREQNOKS", "EGZID", "SCOGRILS", "DRUX", "DRINKOLS", "VOTS", "OGNOX", "KUK", "VORIAN", "ALLANA", "TEOTIHUACAN"};
    private static String[] listaNombresUtilizados = new String [listaNombres.length];
    private static int numUtilizados = 0;
    private boolean vivo;
    private int agresividad;
    private static String[] listaPlanetas = {"ARRAKIS", "TATOOINE", "PANDORA", "AERELON", "KRYNN", "TLÖN", "ZUYUA", "UMMO", "MELMAC", "GUEDEN", "SKARO"};
    private String planetaOrigen;
    private int poderDeDestruccion;

    public void setordenAlien(int x) {
    	ordenAlien = x;
    }
    public int getordenAlien() {
    	return ordenAlien;
    }
    public String setPlanetaOrigenRM(){
        Random rm = new Random ();
        int x = rm.nextInt(0, listaPlanetas.length-1);
        return planetaOrigen = listaPlanetas[x];
    }
    public String setPlanetaOrigen(String x) {
        for(int i = 0;i<listaPlanetas.length;i++){
            if(listaPlanetas[i] == x){
                return planetaOrigen = x;
            }
        }
        return planetaOrigen = null;
    }
    public String getPlanetaOrigen() {
            return planetaOrigen;
    }
    public void setNombre(String x){ 
        nombre = x;  
    } 
    public String setNombreRM(){
        if(numUtilizados == 8) numUtilizados = 0;
        Random rm = new Random ();
        boolean control;
        int x;
        do {
            control = true;
            x = rm.nextInt(0, listaNombres.length-1);
            for(int i=0;i<listaNombresUtilizados.length;i++) {
                if(listaNombresUtilizados[i] == listaNombres[x]) {
                        control = false;
                }
            }
        }while(control == false);
        listaNombresUtilizados[numUtilizados] = listaNombres[x];
        numUtilizados++;
        return nombre = listaNombres[x];    
        
    }
    public String getNombre(){ 
        return nombre; 
    }      
    public int setpoderDestruccionRM(){
        Random rm = new Random ();
        int x = rm.nextInt(10, 100);
        return poderDeDestruccion = x;
    }
    public int setpoderDestruccion(int x) {
        return poderDeDestruccion = x;
    }
    public int getpoderDestruccion() {
        return poderDeDestruccion;
    }
    public int setAgresividadRM(){
        Random rm = new Random ();
        int x = rm.nextInt(10, 100);
        return agresividad = x;
    }
    public int setAgresividad(int x){  
        return agresividad = x;  
    }
    public int getAgresividad(){
        return agresividad;
    }   
    public void nace(){  
        vivo = true;
    } 
    public boolean estavivo(){      
        return vivo; 
    } 
    public void muere(){ 
        vivo = false;
        agresividad = 0;
        poderDeDestruccion = 0;
    }
    public void masagresivo(){
        agresividad++;
    }
    public void masagresivo(int x){
        agresividad = agresividad + x;
    } 
    public void menosgresivo(){
        agresividad--;
    }
    public void menosgresivo(int x){
        agresividad = agresividad - x;
	}   
    public static void ordenarAliens(Alien[] A) {
    	Alien Aux;
    	for(int i=0;i<A.length;i++) {
    		for(int j=0;j<A.length-1;j++) {
    			if(A[j].getpoderDestruccion()>A[j+1].getpoderDestruccion()) {
    				Aux = A[j+1];
    				A[j+1] = A[j];
    				A[j] = Aux;
    			}
    		}
    	}
    }
    public Alien pruebaPoder(Alien A, Alien B) {
    	if(A.getpoderDestruccion() > B.getpoderDestruccion()) {
    		return A;
    	}
    	else if(A.getpoderDestruccion() < B.getpoderDestruccion()) {
    		return B;
    	}
    	else {
    		if(A.getAgresividad() > B.getAgresividad()) {
        		return A;
    		}
    		else if(A.getAgresividad() < B.getAgresividad()) {
        		return B;
    		}
    		else {
    			return null;
    		}
    	}
    }
    public static Alien combate(Alien A, Alien B) throws InterruptedException {
        Thread.sleep(1000);
    	if(A.getpoderDestruccion() > B.getpoderDestruccion()) {
    		B.muere();
    		return A;
    	}
    	else if(A.getpoderDestruccion() < B.getpoderDestruccion()) {
    		A.muere();
    		return B;
    	}
    	else {
    		if(A.getAgresividad() > B.getAgresividad()) {
    			B.muere();
        		return A;
    		}
    		else if(A.getAgresividad() < B.getAgresividad()) {
    			A.muere();
        		return B;
    		}
    		else {
    			return null;
    		}
    	}
    }
    public static void ganador(Alien A, Alien B) {
    	if(A.estavivo() == true && B.estavivo() == false) {
    		System.out.println(A.getNombre()+" HA GANADO LA RONDA !!!.\n"+B.getNombre()+" abandona el torneo.");
    	}
    	else if(A.estavivo() == false && B.estavivo() == true) {
    		System.out.println(B.getNombre()+" HA GANADO LA RONDA !!!.\n"+A.getNombre()+" abandona el torneo.");
    	}
    }
    public Alien() {
    }
    public Alien(String x, int y, String z, int b) {
    	nombre = x;
    	vivo = true;
    	agresividad = y;
    	planetaOrigen = z;
    	poderDeDestruccion = b;
    }
    public Alien(String x){
        nombre = x;
    }
    public Alien(int x){
        poderDeDestruccion = x;
    }
}
