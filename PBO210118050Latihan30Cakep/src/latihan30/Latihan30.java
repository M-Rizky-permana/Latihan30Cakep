/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan30;

import java.util.Scanner;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Latihan30 {
    
     public static final String ANSI_RESET = "\u001B[0m";
    	public static final String ANSI_BLACK = "\u001B[30m";
    	public static final String ANSI_RED = "\u001B[31m";
    	public static final String ANSI_GREEN = "\u001B[32m";
    	public static final String ANSI_YELLOW = "\u001B[33m";
    	public static final String ANSI_BLUE = "\u001B[34m";
    	public static final String ANSI_PURPLE = "\u001B[35m";
    	public static final String ANSI_CYAN = "\u001B[36m";
    	public static final String ANSI_WHITE = "\u001B[37m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ANSI_RED + "Kamu " + ANSI_GREEN + "ngerjain sendiri " + ANSI_YELLOW + "latihan 17 sampe " + ANSI_BLUE + "latihan 30 ini ?");
		System.out.print(ANSI_BLUE + "Jawab" + ANSI_RED + "(Yoi/Enggak) : " + ANSI_RESET);
		Scanner scanner = new Scanner(System.in);
		String jawab = scanner.nextLine();
		jawab = jawab.toUpperCase();
		if ( jawab.equals("YOI"))
			System.out.println(ANSI_RED+"Capek Bener."+ANSI_PURPLE+" Good Job");
		else 
			System.out.println(ANSI_RED+"Tetep cakep sih.\n"+ANSI_CYAN+"Sing penting paham konsepnya yee.\n"+ANSI_RESET+"Keep the code works dude");
		
        
    }
    }
    

