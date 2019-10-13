package systemacademic;
import java.util.Scanner;

public class Index {

	
	/*	  																	  ( Info basic of Projects)
	 *			0  					1			     2					3					  4				5				6				      7						8			
	 * Title of Project | Intention of Project | Description |  Number of participants | Initial Date | Finish Date | Funding Agency | Value of Funding Agency | Status of Project | 
	 *       
	 *
	 *	     																( Info basic of Participants )
	 * 			0 					1						2					3					4					5						6			7					8		
	 *  Name of Participant | Associated Project | Type of Participant | Number of Papers | Number of guidelines | Titles of Papers | Name of Conference | Year | Research Associated (if have) |
	 * 
	 * 
	 * */
	
	
	static int line_projects = 100, columm_projects = 9 , line_participants = 100 , columm_participants = 9;
	static String [][] projects = new String[line_projects][columm_projects];
	static String [][] participants = new String[line_participants][columm_participants];
	
	public static void main(String[] args) {
		
		int key = -1, key_prof = -1, key_p = -1, key_manager = -1, columm = 0;
		int index_projects = 0, index_participants = 0, day, month, year;
		String start,login, password, key1;
		
		Scanner input = new Scanner(System.in);
		
		while (key != 0) {
			System.out.println("Welcome to Jitlab (Just in time labory) ");
			System.out.println("Login or Exit?");
			start = input.nextLine();
			
			if(start.equals("Exit") || start.equals("exit")) {
				input.close();
				System.exit(0);
			}
			
			//reset variables
			key_manager = -1;
			key_prof = -1;
			
			System.out.println("Login: ");
			login = input.nextLine();				
			System.out.println("Password: ");
			password = input.nextLine();
			
			// Manager options
			if(login.equals("manager") && password.equals("123")) {
				System.out.println("Sucess\nWelcome Manager \n");
				while(key_manager != 0) {
					System.out.println("What do you want to do?");
					System.out.println("(1) - Show projects");
					System.out.println("(0) - Sign out");
					
					key_p = input.nextInt();
					input.nextLine();
					
					switch (key_p) {
					
						case 1:
							show_projects();
							break;
						case 0:
							key_manager = 0;
							break;
						default:
							System.out.println("\nError #404 \n Invalid Input");
					
					}
					
					
				}	
			}
			
			// Professor options
			else if(login.equals("professor") && password.equals("123")) {
				System.out.println("Sucess\nWelcome Professor \n");
				while(key_prof != 0) {
						System.out.println("What do you want to do?");
						System.out.println("(1) - Add Project");
						System.out.println("(2) - Add Participants");
						System.out.println("(3) - Add Paper");
						System.out.println("(4) - Add Student Oriented");
						System.out.println("(5) - Edit Project");
						System.out.println("(0) - Sign out");
						
						key_p = input.nextInt();
						input.nextLine();
						
						switch (key_p) {
						case 1:
							System.out.println("Name of Project:");
							columm = 0;
							projects[index_projects][columm] = input.nextLine();
							
							index_projects++;
							
							projects[index_projects-1][8] = "In preparation";
							
							System.out.println("Continue? (Yes or No)");
							key1 = input.nextLine();					
							
							if(key1.equals("Yes") || key1.equals("Y") || key1.equals("y")) {
								System.out.println("Intention of Project:"); 
								columm++;
								projects[index_projects-1][columm] = input.nextLine();					
						
								System.out.println("Description of Project:"); 
								columm++;
								projects[index_projects-1][columm] = input.nextLine();								
					
								System.out.println("Number of participants of Project:"); 
								columm++;
								projects[index_projects-1][columm] = input.nextLine();
								
								System.out.println("Continue to complete the date? \n (Yes or No)");
								key1 = input.nextLine();
								
								if(key1.equals("Yes") || key1.equals("Y")  || key1.equals("y")) {
									
									System.out.println("Initial Date of Project:" + "\nDay: ");
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 || day < 0) {
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 || month < 0) {
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 || year < 2000) {
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									columm++;
									projects[index_projects-1][columm] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
									
									System.out.println("Final Date of Project:"  + "\nDay: ");
									
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 || day < 0) {
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 || month < 0) {
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 || year < 2000) {
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									columm++;		
									projects[index_projects-1][columm] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
									
									System.out.println("Continue to complete Funding Agency of project? (Yes or No)");
									key1 = input.nextLine();
									
									if(key1.equals("Yes") || key1.equals("Y")  || key1.equals("y")) {
										System.out.println("Funding Agency of Project:");
										columm++;
										projects[index_projects-1][columm] = input.nextLine();
										
										
										
										System.out.println("Value of Funding Agency:");
										columm++;
										projects[index_projects-1][columm] = input.nextLine();	
										
										projects[index_projects-1][8] = "In progress";
									}
								}
							}
							break;
							
						case 2:
							System.out.println("Name of participant:");
							columm = 0;
							participants[index_participants][columm] = input.nextLine();
							/*  Name of Participant | Associated Project | Type of Participant | Number of Papers | Number of guidelines | Titles of Papers | Name of Conference | Year | Research Associated (if have) |*/
							index_participants++;					
				
							System.out.println("Associated Project: (Title of project)"); // Chamar metodo que listar� os projetos disponiveis e o professor ter� a op��o de escolher (1), (2), projetos ao estudante. 
							columm++;
							participants[index_participants-1][columm] = input.nextLine();					
						
							System.out.println("Type of Participant: (Example: Student of Graduation)"); 
							columm++;
							participants[index_participants-1][columm] = input.nextLine();											
						    
						    break;
							
						case 0:
							key_prof = 0;
							break;
						default:
							System.out.println("\nError #404 \n Invalid Input");
						
						
						}
						
					}
				}
		
			
		}

		input.close();
		System.exit(0);

	}
	
	
	public static void show_projects() {
		System.out.println("Projects:\n");
		 for (int l = 0; l < projects.length; l++)  {  
		    	if(projects[l][0] != null)
		    		System.out.println("Title of Project:" + projects[l][0]);
		    	
		    	if(projects[l][1] != null)
		    		System.out.println("Initial Date: " + projects[l][1]);
		    	
		    	if(projects[l][2] != null)
				    System.out.println("Finish Date: " + projects[l][2]);
		    	
		    	if(projects[l][3] != null)
				    System.out.println("Funding Agency: " + projects[l][3]);
		    	
		    	if(projects[l][4] != null)
				    System.out.println("Value of Funding Agency: " + projects[l][4]);
		    	
		    	if(projects[l][5] != null)
				    System.out.println("Intention of Project: " + projects[l][5]);
		    	
		    	if(projects[l][6] != null)
				    System.out.println("Description: " + projects[l][6]);
		    	
		    	if(projects[l][7] != null)
				    System.out.println("Number of participants: " + projects[l][7]);
		    	
		    	if(projects[l][8] != null)
				    System.out.println("Status of Project: " + projects[l][8]);
		    	
		    	if(projects[l][0] != null)
		    		System.out.println("");
		     
		 }  
		
	}
	
}	
