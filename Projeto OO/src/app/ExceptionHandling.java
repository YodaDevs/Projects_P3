package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    private static Scanner input;

    public static String readDate() {
		input = new Scanner(System.in);
		
		while (true) {
			try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String in = input.nextLine();
                Date data = dateFormat.parse(in);
                String str = dateFormat.format(data);
				return str;
				
			} catch (ParseException e) {
				System.out.println("Error: Invalid input. Enter an date with this format: dd/MM/yyyy.");
			} 
		}     
    }

    public static float readfloat() {
		input = new Scanner(System.in);
		
		while (true) {
			try {
				float value = input.nextFloat();
				return value;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: Invalid input. Try another number.");
			} finally {
				input.nextLine();
			}
		}     
	}
	
	public static int readInt() {
		input = new Scanner(System.in);
		
		while (true) {
			try {
				int value = input.nextInt();
				return value;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: Invalid input. Try another number.");
			} finally {
				input.nextLine();
			}
		}
		
	}

	public static boolean isCPF(String CPF) {
        // Error is considered CPF's formed by a sequence of equal numbers
        if (CPF == null || 
            CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - Protects code from any type conversion errors (int)
        try {
        // Calculation of the 1st. Verifying digit
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converts the ith CPF character to a number:
        // for example, transforms character '0' into integer 0      
        // (48 is the position of '0' in the ASCII table)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converts to its numeric character
          
        // Calculation of the 2nd. Verifying digit
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
        // Checks whether the calculated digits match the entered digits.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
    }
    


}