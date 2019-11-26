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
    


}