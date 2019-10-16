package systemacademic;
import java.util.Scanner;

public class Index {

	
	/*	  								 ( Info basic of Projects)
	 *	  0  				1	          2		   3			  4		5		6	      		7	     8			
	 * Title of Project | Intention of Project | Description |  Number of collaborator | Initial Date | Finish Date | Funding Agency | Value of Funding Agency | Status of Project | 
	 *       
	 *
	 *	     							 	( Info basic of Collaborator )
	 * 	    0 		   1	  	 2	    		 3		     4			 5		      6	             7		      8		        			
	 * Name of collaborator | E-mail | Type of Participant | Associated Project | Students Guidelines | Titles of Papers | Name of Conference | Year | Research Associated (if have) |
	 * 
	 * 
	 * 									(Info basic of Production Academic)
	 *         0			1			2		    3		        4		5		   	
	 * Title of Project | Collaborators of Project | Students Guidelines | Titles of Papers | Name of Conference | Year |
	 * 
	 * 									    (Status of Project)
	 * 			
	 * 								  [In preparation -> In progress -> Completed]
	 * 
	 * Login: admin
	 * password: 123
	 * 
	 * 
	 * */
	
	
	static int line_projects = 100, columm_projects = 9 , line_collaborator = 100 , columm_collaborator = 9, line_prodAcademic = 100, columm_prodAcademic = 6, indexPA = 0;
	static String [][] projects = new String[line_projects][columm_projects];
	static String [][] collaborator = new String[line_collaborator][columm_collaborator];
	static String [][] prodAcademic = new String[line_prodAcademic][columm_prodAcademic];
	
	public static void main(String[] args) {
		
		int key = -1, key_adm = -1, key_p = -1, index_projectForParticipant;
		int index_projects = -1, index_participants = -1, day, month, year, typePart;
		String login, password, key1, projectParticipant;
		
		Scanner input = new Scanner(System.in);
		
		while (key != 0) {
			System.out.println("Welcome to Jitlab (Just in time labory) ");
			
			//reset variables
			key_adm = -1;
			
			System.out.println("Login: ");
			login = input.nextLine();				
			System.out.println("Password: ");
			password = input.nextLine();
			
			if(login.equals("admin") && password.equals("123")) {
				System.out.println("Sucess\nWelcome Administrator\n");
				while(key_adm != 0) {
						System.out.println("What do you want to do?");
						System.out.println("(1) - Add Project"); //Add project to string [][] projects
						System.out.println("(2) - Add Collaborator"); // Add Collaborator to string [][] collaborator
						System.out.println("(3) - Edit Project");	// Edit Projects at string [][] projects
						System.out.println("(4) - Edit status of projects");	// Edit Status of projects = In preparation -> In progress -> Completed
						System.out.println("(5) - Edit Collaborator"); // Edit Collaborator at string [][] collaborator, like name, type of collaborator
						System.out.println("(6) - Show Projects"); // Show a specific project that you choose 
						System.out.println("(7) - Show Collaborators"); // Show a specific collaborator that you choose
						System.out.println("(8) - Show Academic Report"); // Show a report about this Lab
						System.out.println("(0) - Sign out");	// Sign out of app					
						
						key_p = input.nextInt();
						input.nextLine();
						
						switch (key_p) {
						case 1:
							System.out.println("Title of Project:");
							
							index_projects++; // increment index of string [][]project, because it's count where a put the new project in string[][]project
							projects[index_projects][0] = input.nextLine();
							
							projects[index_projects][8] = "In preparation"; // status of project, initial at In preparation, because need to follow system requirements
							
							System.out.println("Continue? (Yes or No)");
							key1 = input.nextLine();					
							
							if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y")) {
								System.out.println("Intention of Project:"); // Objective of Project
							
								projects[index_projects][1] = input.nextLine();					
						
								System.out.println("Description of Project:"); // Description about the project
								
								projects[index_projects][2] = input.nextLine();								
					
								System.out.println("Number of collaborator of Project:"); // You choose a number of collaborator for your project (but after, you can add more than this)
								
								projects[index_projects][3] = input.nextLine();
								
								System.out.println("Continue to complete the date? \n (Yes or No)"); // Complete date about project follow Brazil Date Format
								key1 = input.nextLine();
								
								if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y") ) {
									
									System.out.println("Initial Date of Project:" + "\nDay: ");
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 && day < 0) { // Day need to be accept
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 && month < 0) { // Month need to be accept
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 && year < 2000) { // Year need to be accept
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									String dayz,monthz,yearz; // String reserved to check numbers(after)
									
									if(day < 10) dayz = "0" + Integer.toString(day);  // this two lines, converter Integer to String to get day
									else dayz = Integer.toString(day);
									
									if(month < 10) monthz = "0" + Integer.toString(month); // this two lines, converter Integer to String to get month
									else monthz = Integer.toString(month);
									
									if(year < 10) yearz = "0" + Integer.toString(year); // this two lines, converter Integer to String to get year
									else yearz = Integer.toString(year);
									
									projects[index_projects][4] = (dayz + "/" + monthz + "/" + yearz); // Save Date in string[][]projects
									
									System.out.println("Final Date of Project:"  + "\nDay: ");
									
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 && day < 0) { // Day need to be accept
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 && month < 0) {  // Month need to be accept
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 && year < 2000) { // Year need to be accept
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									if(day < 10) dayz = "0" + Integer.toString(day); // this two lines, converter Integer to String to get day
									else dayz = Integer.toString(day);
									
									if(month < 10) monthz = "0" + Integer.toString(month); // this two lines, converter Integer to String to get month
									else monthz = Integer.toString(month);
									
									if(year < 10) yearz = "0" + Integer.toString(year); // this two lines, converter Integer to String to get year
									else yearz = Integer.toString(year);
									
									projects[index_projects][5] = (dayz + "/" + monthz + "/" + yearz); // Save Date in string[][]projects
									
									System.out.println("Continue to complete Funding Agency of project? (Yes or No)");
									key1 = input.nextLine();
									
									if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y")) {
										System.out.println("Funding Agency of Project:"); 
										
										projects[index_projects][6] = input.nextLine();										
										
										System.out.println("Value of Funding Agency:");
										
										projects[index_projects][7] = input.nextLine();	
									}
								}
							}
							break;
							
						case 2:
							
							System.out.println("Name of Collaborator:");
							index_participants++;
							collaborator[index_participants][0] = input.nextLine();
							
							System.out.println("E-mail of Collaborator: (like: ****@gmail.com"); 
							
							collaborator[index_participants][1] = input.nextLine(); // Still not have how check is accept, but this save e-mal of collaborator
							
							System.out.println("Type of Collaborator:"); // Type of collaborators, because need to follow system requirements 
							System.out.println("(1) Graduation Student");
							System.out.println("(2) Master degree Student");
							System.out.println("(3) Doctorate Student");
							System.out.println("(4) Professor");
							System.out.println("(5) Researcher");
							
							typePart = input.nextInt();
							input.nextLine();
							
							if(typePart == 1)  collaborator[index_participants][2] = "Graduation Student";
							else if(typePart == 2)  collaborator[index_participants][2] = "Master degree Student";
							else if(typePart == 3)  collaborator[index_participants][2] = "Doctorate Student";
							else if(typePart == 4)  collaborator[index_participants][2] = "Professor";
							else if(typePart == 5)  collaborator[index_participants][2] = "Researcher";
							else {
								System.out.println("Sorry, Incorrect comand, try to edit this participant to continue with his info");
								break;
							}
							
							System.out.println("Associated Project: (Title of Project)"); // Associated Project, but you can change any moment at Edit Collaborator
							
							projectParticipant = input.nextLine();
							
							index_projectForParticipant = search_Projects(projectParticipant); // We received one number that's the index at string[][]projects of our request with title of project 
							
							if(index_projectForParticipant < 0) { // If not exist this project
								System.out.println("Error: Project not Found! Try Edit Collaborator");
								break;
							}
							
							if( index_projectForParticipant >= 0 && !(projects[index_projectForParticipant][8].equals("In preparation"))) { //If exist but this project isn't available, follow system requirements
								System.out.println("This project isn't in preparation, you can't add collaborator");
								break; 
							}
							
							collaborator[index_participants][3] = projectParticipant;				
							System.out.println("If you wanna to add Papers, Guidelines or more, try Edit Collaborator"); // Advice to user
																						
						    break;
							
						case 3:
							edit_Project(); 
							break;
						case 4:
							edit_statusProjects();
							break;
						case 5:
							edit_Collaborator();
							break;
						case 6:
							System.out.println("Title of Project:");
							String nameProj =  input.nextLine();
							show_Project(nameProj);
							break;
						case 7:
							System.out.println("Name of Collaborator:");
							String nameCollaborator =  input.nextLine();
							show_Collaborator(nameCollaborator);
							break;
						case 8:
							showReport();
							break;
						case 0:
							key_adm = 0;
							key = 0;
							break;
						default:
							System.out.println("\nError #404 \n Invalid Input");
						
						
						}
						
					}
				}

			else {
				input.close();
				System.exit(0);
			}
			
		}
	}

	// Show sorted descending Production Academic with Titles, Name of Conference and more, about one project
	public static void showProductionAcademic(String title) {
		int year, yearz = 2030;
		while(true) {
			if(yearz == 2000) break;
			for(int i = 0; i < 100; i++) {
				if(prodAcademic[i][5] != null && prodAcademic[i][0] != null) {
					year = Integer.parseInt(prodAcademic[i][5]);
					if(year == yearz && prodAcademic[i][0].equals(title) ) {
						if(prodAcademic[i][1] != null)
						System.out.println("Collaborators of Project:" + prodAcademic[i][1]);
						if(prodAcademic[i][2] != null)
						System.out.println("Students Guidelines:" + prodAcademic[i][2]);
						if(prodAcademic[i][3] != null)
						System.out.println("Titles of Papers:" + prodAcademic[i][3]);
						if(prodAcademic[i][4] != null)
						System.out.println("Name of Conference:" + prodAcademic[i][4]);
						if(prodAcademic[i][5] != null)
						System.out.println("Year:" + prodAcademic[i][5]);
					}
				}
			}
			yearz--;			
		}
		
	}
	
	// Show Collaborator informations like E-mail, Associated Project, Titles of Papers and more
	public static void show_Collaborator(String name) {
		int indexCollaborator = search_Collaborator(name);
		
		if(indexCollaborator < 0) {
			System.out.println("Error: Not Find Collaborator");		
			return;
		}
		
			if(collaborator[indexCollaborator][0] != null)
				System.out.println("Collaborator: " + collaborator[indexCollaborator][0]);		
		    	
		    if(collaborator[indexCollaborator][1] != null)
		    	System.out.println("E-mail: " + collaborator[indexCollaborator][1]);
		    	
		    if(collaborator[indexCollaborator][2] != null)
				System.out.println("Type of Participant: " + collaborator[indexCollaborator][2]);
		    	
		    if(collaborator[indexCollaborator][3] != null)
				System.out.println("Associated Project: " + collaborator[indexCollaborator][3]);
		    	
		    if(collaborator[indexCollaborator][4] != null)
				System.out.println("Students Guidelines: " + collaborator[indexCollaborator][4]);
		    	
		    if(collaborator[indexCollaborator][5] != null)
				System.out.println("Titles of Papers: " + collaborator[indexCollaborator][5]);
		    	
		    if(collaborator[indexCollaborator][6] != null)
				System.out.println("Name of Conference: " + collaborator[indexCollaborator][6]);
		    	
		    if(collaborator[indexCollaborator][7] != null)
				System.out.println("Year: " + collaborator[indexCollaborator][7]);
		    	
		    if(collaborator[indexCollaborator][8] != null)
				System.out.println("Research Associated: " + collaborator[indexCollaborator][8]);
		    	
		    if(collaborator[indexCollaborator][0] != null)
		    	System.out.println("");
		     
		
	}
	
	// Show Project informations like Initial Date, Finish Date and call showProductionAcademic to give more information about that Project
	public static void show_Project(String title) {
		int indexProj = search_Projects(title);
		
		if(indexProj < 0) {
			System.out.println("Error: Not Find Project");		
			return;
		}
		    	
		if(projects[indexProj][0] != null)
		    		System.out.println("Title of Project:" + projects[indexProj][0]);
		    	
		    	if(projects[indexProj][4] != null)
		    		System.out.println("Initial Date: " + projects[indexProj][4]);
		    	
		    	if(projects[indexProj][5] != null)
				    System.out.println("Finish Date: " + projects[indexProj][5]);
		    	
		    	if(projects[indexProj][6] != null)
				    System.out.println("Funding Agency: " + projects[indexProj][6]);
		    	
		    	if(projects[indexProj][7] != null)
				    System.out.println("Value of Funding Agency: " + projects[indexProj][7]);
		    	
		    	if(projects[indexProj][1] != null)
				    System.out.println("Intention of Project: " + projects[indexProj][1]);
		    	
		    	if(projects[indexProj][2] != null)
				    System.out.println("Description: " + projects[indexProj][2]);
		    	
		    	if(projects[indexProj][3] != null)
				    System.out.println("Number of collaborator: " + projects[indexProj][3]);
		    	
		    	if(projects[indexProj][8] != null)
				    System.out.println("Status of Project: " + projects[indexProj][8]);
		    	
		    	if(projects[indexProj][0] != null)
		    		System.out.println("");
		    	
		    	showProductionAcademic(title);
		    	
		return;
	}
	
	
	// You can Edit Information about Collaborator
	public static void edit_Collaborator() {
		System.out.println("What the name of collaborator you want to edit?");
		Scanner input = new Scanner(System.in);
		String collaboratorName = input.nextLine();
		int index_CollaboratorName = search_Collaborator(collaboratorName);
		
		if(index_CollaboratorName == -1) {
			System.out.println("Error #404: Not Found Participant");
			return;
		}
		
		int op = -1;
		while(op != 0) {
			System.out.println("Choose what you want to edit:");
			System.out.println("(1) Name");
			System.out.println("(2) E-mail");
			System.out.println("(3) Type of Collaborator"); 
			System.out.println("(4) Associated Project");
			System.out.println("(5) Add Papers");
			System.out.println("(6) Add Guidelines");
			System.out.println("(0) Finish");
			
			op = input.nextInt();
			input.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("New name:");
				collaborator[index_CollaboratorName][0] = input.nextLine();
				System.out.println("Sucess");
				break;
				
			case 2:
				System.out.println("New E-mail:");
				collaborator[index_CollaboratorName][1] = input.nextLine();
				System.out.println("Sucess");
				break;
				
			case 3:
				while(true) {
					int type;
					System.out.println("Type of Collaborator:");
					System.out.println("(1) Graduation Student");
					System.out.println("(2) Master degree Student");
					System.out.println("(3) Doctorate Student");
					System.out.println("(4) Professor");
					System.out.println("(5) Researcher");
					
					type = input.nextInt();
					input.nextLine();
					
					if(type == 1) {
						collaborator[index_CollaboratorName][2] = "Graduation Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 2)  {
						collaborator[index_CollaboratorName][2] = "Master degree Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 3)  {
						collaborator[index_CollaboratorName][2] = "Doctorate Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 4)  {
						collaborator[index_CollaboratorName][2] = "Professor";
						System.out.println("Sucess");
						break;
					}
					else if(type == 5)  {
						collaborator[index_CollaboratorName][2] = "Researcher";
						System.out.println("Sucess");
						break;
					}
					else {
						System.out.println("Incorrect comand, try again");
					}
				}
				break;
			
			case 4:
				collaboratorProjectAssociated(index_CollaboratorName);
				break;
			case 5:
				addPapers(index_CollaboratorName);
				break;
			case 6:
				if(collaborator[index_CollaboratorName][2].equals("Professor")) {
					guidelinesStudents(index_CollaboratorName);
				}
				else {
					System.out.println("Just Professor can Guidelines Students");
				}
				break;
			case 0:
				op = 0;
				break;
			default:
				System.out.println("\nError #404 \n Invalid Input");
			}
		}
		
		
		
		
	}
	
	// You can add Papers or new Papers related with collaborator 
	public static void addPapers(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String paperInfo, value, titleProject;
		int indexProject;
		
		if(collaborator[indexCollaborator][5] == null) {
			System.out.println("Title of Paper:");
			collaborator[indexCollaborator][5] = input.nextLine();
			System.out.println("Name of Conference that publish the paper:");
			collaborator[indexCollaborator][6] = input.nextLine();
			System.out.println("Year of Conference:");
			collaborator[indexCollaborator][7] = input.nextLine();
			System.out.println("You have Research Associated: Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) {
				System.out.println("Title of Research Associated:"); // Need to check if Status of Project Associated is In progress 
				titleProject = input.nextLine();
				indexProject = search_Projects(titleProject);
				if(projects[indexProject][8].equals("In progress")) {
					collaborator[indexCollaborator][8] = titleProject;
					prodAcademic[indexPA][0] = collaborator[indexCollaborator][8];
					prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];					
					prodAcademic[indexPA][3] = collaborator[indexCollaborator][5];
					prodAcademic[indexPA][4] = collaborator[indexCollaborator][6];
					prodAcademic[indexPA][5] = collaborator[indexCollaborator][7];
					indexPA++;
				}
				else System.out.println("You only can associated with in progress projects, this project is" + projects[indexProject][8]);
				
				
				
				
			}
			else {
				collaborator[indexCollaborator][8] = "*";
			}			
		}
		else if (collaborator[indexCollaborator][5] != null) {
			System.out.println("You have these Titles of Papers:" + collaborator[indexCollaborator][5]);
			System.out.println("You wanna add anothers Papers? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				
				System.out.println("New Title of Paper:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][5].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][3] = paperInfo;
				
				System.out.println("Name of Conference that publish the paper:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][6].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][4] = paperInfo;
				
				System.out.println("Year of Conference:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][7].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][5] = paperInfo;
				
				System.out.println("You have Research Associated: Yes/No");
				value = input.nextLine();
				if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) {
					System.out.println("Title of Research Associated:");
					paperInfo = input.nextLine();
					indexProject = search_Projects(paperInfo);
					if(projects[indexProject][8].equals("In progress")) {
						collaborator[indexCollaborator][7].concat("="+ paperInfo);
						System.out.println("Sucess");
						prodAcademic[indexPA][0] = paperInfo;
						prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];					
						indexPA++;
					}
					else System.out.println("You only can associated with in progress projects, this project is" + projects[indexProject][8]);										
					
				}
				else {
					collaborator[indexCollaborator][7].concat("="+ "*");
				}
				
				return;
			}
		}
		
	}
	
	// You can add Guidelines if you is Professor, so you can tell who student you helping
	public static void guidelinesStudents(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String student, value;
		
		if(collaborator[indexCollaborator][4] == null) {
			System.out.println("What project associated:");
			String professorAssociated = input.nextLine();
			
			System.out.println("New Student that you guidelines:");
			collaborator[indexCollaborator][4] = input.nextLine();
			
			prodAcademic[indexPA][0] = professorAssociated;
			prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];	
			prodAcademic[indexPA][2] = collaborator[indexCollaborator][4];					
		}
		else if (collaborator[indexCollaborator][4] != null) {
			System.out.println("You have these Students Guidelines:" + collaborator[indexCollaborator][4]);
			System.out.println("You wanna add another Students? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				System.out.println("What project associated:");
				String professorAssociated = input.nextLine();
				
				System.out.println("New Student Guidelines:");
				student = input.nextLine();
				collaborator[indexCollaborator][4].concat("="+ student);
				System.out.println("Sucess");
				
				prodAcademic[indexPA][0] = professorAssociated;
				prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];	
				prodAcademic[indexPA][2] = student;
				
				return;
			}
		}
	}
	
	
	public static void collaboratorProjectAssociated(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String statusProject, project, value;
		
		if(collaborator[indexCollaborator][3] == null) {
			System.out.println("New Associated Project:");
			project = input.nextLine();
			statusProject = checkStatusProject(project);
			
			if(statusProject.equals("In preparation")) {
				collaborator[indexCollaborator][3] = project;
				System.out.println("Sucess");			
			}
			else if (statusProject.equals("In progress")) {
				System.out.println("Sorry, but you can't add Participants to projects in progress");
				return;
			}
			else if(statusProject.equals("Completed")) {
				System.out.println("Sorry, but you can't add Participants to this projects, it's completed ");
				return;
			}
		}
		else if (collaborator[indexCollaborator][3] != null) {
			System.out.println("You have this Associated Project:" + collaborator[indexCollaborator][3]);
			System.out.println("You wanna add another Associated Project? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				String[] AssociatedProjects = collaborator[indexCollaborator][3].split("=");
				
				if(AssociatedProjects.length >= 2 && collaborator[indexCollaborator][2].equals("Graduation Student")) { // Check test
					System.out.println("Sorry, Graduation Student can't associate more than 2 projects");
					return;
				}
				else {
					System.out.println("New Associated Project:");
					project = input.nextLine();
					collaborator[indexCollaborator][3].concat("="+ project);
					System.out.println("Sucess");
					return;
				}
			}
		}
		
		
		
	}
	
	// Give us Status of Project
	public static String checkStatusProject(String project) {
		int indexProject = search_Projects(project);
		return projects[indexProject][8];
	}
	
	// Edit Status of Project if you follow the System Requirements
	public static void edit_statusProjects() {
		String title;
		int index_editTitle, answer, papers = 0, professor = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What the title of project you want to change status?");
		
		title = input.nextLine();
		index_editTitle = search_Projects(title);
		
		if(index_editTitle == -1) {
			System.out.println("Error: not find this title");
			return;
		}		
		
		System.out.println("This project is: " + projects[index_editTitle][8]);
		System.out.println(" (1) Change for Completed");
		System.out.println(" (2) Change for In Progress");
		answer = input.nextInt();
		input.nextLine();
		
		if(answer == 1) { // Check if is enable to complete
			title = checkStatusProject(projects[index_editTitle][0]);
			if(title.equals("In progress")) {
				papers = checkPapersProject(projects[index_editTitle][0]); // Check if how many papers have published about this project
				professor = checkProfessorProject(projects[index_editTitle][0]);
				if(papers == 0 && professor == 0){
					System.out.println("You can't change to completed, because you need add at least one Paper published");
				}
				else {
					projects[index_editTitle][8] = "Completed";
					System.out.println("Sucess");
				}
			}
			System.out.println("Project Status now is " + projects[index_editTitle][8]);
		}
		else if (answer == 2) { // Check if is enable to change for In progress
			if(checkFullyRegisterProject(index_editTitle)) {
				projects[index_editTitle][8] = "In progress";
				System.out.println("Sucess");
				System.out.println("Project Status now is " + projects[index_editTitle][8]);
			}
			else {
				System.out.println("Project Status still " + projects[index_editTitle][8] + "\n Because, you need to complete all basic information about this project");
			}	
		}
			
		
		
	}
	
	// Check if all information about one Project is complete, that's because we need all basic information about one project to change his status
	public static boolean checkFullyRegisterProject(int index_project) {	
		
		for(int i = 0; i < projects[index_project].length ; i++) {
			if(projects[index_project][i] == null) {
				return false;
			}
		}
		return true;
	}
	
	// Check if Collaborator is a Professor
	public static int checkProfessorProject(String title) {
		for(int j = 0; j < collaborator.length; j++ ) {
			if(collaborator[j][3] != null) {
				String proj[] = collaborator[j][3].split("=");
				for(int k = 0; k < proj.length; k++) {
					if(proj[k].equals(title) && collaborator[j][2].equals("Professor")) {
						return 1;
					}
				} 
			}
		}
		return 0;
	}
	
	// Check how many Papers have in one project
	public static int checkPapersProject(String title) {
		
		for(int j = 0; j < collaborator.length; j++ ) {				
				if(collaborator[j][5] != null) {																			
					return 1;	
				}
		}
		return 0;
	}		
	
	// You can Edit information about one project
	public static void edit_Project() {
			String project;
			int index_project, day, month, year;
			Scanner input = new Scanner(System.in);
			System.out.println("What title of project you want edit:");
			project = input.nextLine();
			index_project = search_Projects(project);
			
			if(index_project == -1) {
				System.out.println("Error: not find this title");
				return;
			}
			
			int op = -1;
			while(op != 0) {
				System.out.println("Choose what you want to edit:");
				System.out.println("(1) Title");
				System.out.println("(2) Intention");
				System.out.println("(3) Description"); 
				System.out.println("(4) Number of collaborator");
				System.out.println("(5) Date");  //!!!!! Do this
				System.out.println("(6) Funding Agency");
				System.out.println("(0) Finish edit");
				
				op = input.nextInt();
				input.nextLine();
				
				switch(op) {
				case 1:
					System.out.println("New title:");
					projects[index_project][0] = input.nextLine();
					System.out.println("Sucess");
					break;
					
				case 2:
					System.out.println("New intention:");
					projects[index_project][1] = input.nextLine();
					System.out.println("Sucess");
					break;
					
				case 3:
					System.out.println("New description:");
					projects[index_project][2] = input.nextLine();
					System.out.println("Sucess");
					break;
				
				case 4:
					System.out.println("New number of collaborator:");
					projects[index_project][3] = input.nextLine();
					System.out.println("Sucess");
					break;
				case 5:
					
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
					
					
					projects[index_project][4] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
					
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
					
							
					projects[index_project][5] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
					
					break;
				case 6:
					System.out.println("New Funding Agency of Project:");
					
					projects[index_project][6] = input.nextLine();										
				
					System.out.println("New Value of Funding Agency:");
					
					projects[index_project][7] = input.nextLine();	
					break;
				case 0:
					op = 0;
					break;
				default:
					System.out.println("\nError #404 \n Invalid Input");
				}
			}
		}
	
	// Search one projects and give us Integer that's index of project in string[][]projects
	public static int search_Projects(String title) {
		for (int l = 0; l < projects.length; l++) {
			if(projects[l][0] != null && projects[l][0].equals(title))
				return l;
		}
		return -1;
	}
	
	// Search one collaborator and give us Integer that's index of collaborator in string[][]collaborator
	public static int search_Collaborator(String name) {
		for (int l = 0; l < collaborator.length; l++) {
			if(collaborator[l][0] != null && collaborator[l][0].equals(name))
				return l;
		}
		return -1;
	}
	
	// Show a report to user, with all information with system requirements
	public static void showReport() {
		int col = 0;
		int projPre = 0;
		int projPro = 0;
		int projCom = 0;
		int totalProj = 0;
		int prodGui = 0;
		int prodPaper = 0;

	static int line_projects = 100, columm_projects = 9 , line_collaborator = 100 , columm_collaborator = 9, line_prodAcademic = 100, columm_prodAcademic = 6, indexPA = 0;
	static String [][] projects = new String[line_projects][columm_projects];
	static String [][] collaborator = new String[line_collaborator][columm_collaborator];
	static String [][] prodAcademic = new String[line_prodAcademic][columm_prodAcademic];
	
	public static void main(String[] args) {
		
		int key = -1, key_adm = -1, key_p = -1, index_projectForParticipant;
		int index_projects = -1, index_participants = -1, day, month, year, typePart;
		String login, password, key1, projectParticipant;
		
		Scanner input = new Scanner(System.in);
		
		while (key != 0) {
			System.out.println("Welcome to Jitlab (Just in time labory) ");
			
			//reset variables
			key_adm = -1;
			
			System.out.println("Login: ");
			login = input.nextLine();				
			System.out.println("Password: ");
			password = input.nextLine();
			
			if(login.equals("admin") && password.equals("123")) {
				System.out.println("Sucess\nWelcome Administrator\n");
				while(key_adm != 0) {
						System.out.println("What do you want to do?");
						System.out.println("(1) - Add Project"); //Add project to string [][] projects
						System.out.println("(2) - Add Collaborator"); // Add Collaborator to string [][] collaborator
						System.out.println("(3) - Edit Project");	// Edit Projects at string [][] projects
						System.out.println("(4) - Edit status of projects");	// Edit Status of projects = In preparation -> In progress -> Completed
						System.out.println("(5) - Edit Collaborator"); // Edit Collaborator at string [][] collaborator, like name, type of collaborator
						System.out.println("(6) - Show Projects"); // Show a specific project that you choose 
						System.out.println("(7) - Show Collaborators"); // Show a specific collaborator that you choose
						System.out.println("(8) - Show Academic Report"); // Show a report about this Lab
						System.out.println("(0) - Sign out");	// Sign out of app					
						
						key_p = input.nextInt();
						input.nextLine();
						
						switch (key_p) {
						case 1:
							System.out.println("Title of Project:");
							
							index_projects++; // increment index of string [][]project, because it's count where a put the new project in string[][]project
							projects[index_projects][0] = input.nextLine();
							
							projects[index_projects][8] = "In preparation"; // status of project, initial at In preparation, because need to follow system requirements
							
							System.out.println("Continue? (Yes or No)");
							key1 = input.nextLine();					
							
							if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y")) {
								System.out.println("Intention of Project:"); // Objective of Project
							
								projects[index_projects][1] = input.nextLine();					
						
								System.out.println("Description of Project:"); // Description about the project
								
								projects[index_projects][2] = input.nextLine();								
					
								System.out.println("Number of collaborator of Project:"); // You choose a number of collaborator for your project (but after, you can add more than this)
								
								projects[index_projects][3] = input.nextLine();
								
								System.out.println("Continue to complete the date? \n (Yes or No)"); // Complete date about project follow Brazil Date Format
								key1 = input.nextLine();
								
								if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y") ) {
									
									System.out.println("Initial Date of Project:" + "\nDay: ");
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 && day < 0) { // Day need to be accept
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 && month < 0) { // Month need to be accept
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 && year < 2000) { // Year need to be accept
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									String dayz,monthz,yearz; // String reserved to check numbers(after)
									
									if(day < 10) dayz = "0" + Integer.toString(day);  // this two lines, converter Integer to String to get day
									else dayz = Integer.toString(day);
									
									if(month < 10) monthz = "0" + Integer.toString(month); // this two lines, converter Integer to String to get month
									else monthz = Integer.toString(month);
									
									if(year < 10) yearz = "0" + Integer.toString(year); // this two lines, converter Integer to String to get year
									else yearz = Integer.toString(year);
									
									projects[index_projects][4] = (dayz + "/" + monthz + "/" + yearz); // Save Date in string[][]projects
									
									System.out.println("Final Date of Project:"  + "\nDay: ");
									
									day = input.nextInt();
									input.nextLine();
									
									while(day > 31 && day < 0) { // Day need to be accept
										System.out.println("Please input the correct Day:");
										day = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Month: ");
									month = input.nextInt();
									input.nextLine();
								
									while(month > 12 && month < 0) {  // Month need to be accept
										System.out.println("Please input the correct Month:");
										month = input.nextInt();
										input.nextLine();
									}
									
									System.out.println("Year: ");
									year = input.nextInt();
									input.nextLine();
									while(year > 2030 && year < 2000) { // Year need to be accept
										System.out.println("Please input the correct Year:");
										year = input.nextInt();
										input.nextLine();
									}
									
									if(day < 10) dayz = "0" + Integer.toString(day); // this two lines, converter Integer to String to get day
									else dayz = Integer.toString(day);
									
									if(month < 10) monthz = "0" + Integer.toString(month); // this two lines, converter Integer to String to get month
									else monthz = Integer.toString(month);
									
									if(year < 10) yearz = "0" + Integer.toString(year); // this two lines, converter Integer to String to get year
									else yearz = Integer.toString(year);
									
									projects[index_projects][5] = (dayz + "/" + monthz + "/" + yearz); // Save Date in string[][]projects
									
									System.out.println("Continue to complete Funding Agency of project? (Yes or No)");
									key1 = input.nextLine();
									
									if(key1.equalsIgnoreCase("Yes") || key1.equalsIgnoreCase("Y")) {
										System.out.println("Funding Agency of Project:"); 
										
										projects[index_projects][6] = input.nextLine();										
										
										System.out.println("Value of Funding Agency:");
										
										projects[index_projects][7] = input.nextLine();	
									}
								}
							}
							break;
							
						case 2:
							
							System.out.println("Name of Collaborator:");
							index_participants++;
							collaborator[index_participants][0] = input.nextLine();
							
							System.out.println("E-mail of Collaborator: (like: ****@gmail.com"); 
							
							collaborator[index_participants][1] = input.nextLine(); // Still not have how check is accept, but this save e-mal of collaborator
							
							System.out.println("Type of Collaborator:"); // Type of collaborators, because need to follow system requirements 
							System.out.println("(1) Graduation Student");
							System.out.println("(2) Master degree Student");
							System.out.println("(3) Doctorate Student");
							System.out.println("(4) Professor");
							System.out.println("(5) Researcher");
							
							typePart = input.nextInt();
							input.nextLine();
							
							if(typePart == 1)  collaborator[index_participants][2] = "Graduation Student";
							else if(typePart == 2)  collaborator[index_participants][2] = "Master degree Student";
							else if(typePart == 3)  collaborator[index_participants][2] = "Doctorate Student";
							else if(typePart == 4)  collaborator[index_participants][2] = "Professor";
							else if(typePart == 5)  collaborator[index_participants][2] = "Researcher";
							else {
								System.out.println("Sorry, Incorrect comand, try to edit this participant to continue with his info");
								break;
							}
							
							System.out.println("Associated Project: (Title of Project)"); // Associated Project, but you can change any moment at Edit Collaborator
							
							projectParticipant = input.nextLine();
							
							index_projectForParticipant = search_Projects(projectParticipant); // We received one number that's the index at string[][]projects of our request with title of project 
							
							if(index_projectForParticipant < 0) { // If not exist this project
								System.out.println("Error: Project not Found! Try Edit Collaborator");
								break;
							}
							
							if( index_projectForParticipant >= 0 && !(projects[index_projectForParticipant][8].equals("In preparation"))) { //If exist but this project isn't available, follow system requirements
								System.out.println("This project isn't in preparation, you can't add collaborator");
								break; 
							}
							
							collaborator[index_participants][3] = projectParticipant;				
							System.out.println("If you wanna to add Papers, Guidelines or more, try Edit Collaborator"); // Advice to user
																						
						    break;
							
						case 3:
							edit_Project(); 
							break;
						case 4:
							edit_statusProjects();
							break;
						case 5:
							edit_Collaborator();
							break;
						case 6:
							System.out.println("Title of Project:");
							String nameProj =  input.nextLine();
							show_Project(nameProj);
							break;
						case 7:
							System.out.println("Name of Collaborator:");
							String nameCollaborator =  input.nextLine();
							show_Collaborator(nameCollaborator);
							break;
						case 8:
							showReport();
							break;
						case 0:
							key_adm = 0;
							key = 0;
							break;
						default:
							System.out.println("\nError #404 \n Invalid Input");
						
						
						}
						
					}
				}

			else {
				input.close();
				System.exit(0);
			}
			
		}
	}

	
	// Collaborators associated in one project
	public static void colAssoc(String title) {
		System.out.println("collaborators:");
		for(int i = 0; i < collaborator.length ; i++) {
			if(collaborator[i][0] != null && collaborator[i][3].equals(title)) {
				System.out.println(collaborator[i][0]);
			}
		}
		System.out.println("");
	}
	
	// Show sorted descending Production Academic with Titles, Name of Conference and more, about one project
	public static void showProductionAcademic(String title) {
		int year, yearz = 2030;
		while(true) {
			if(yearz == 2000) break;
			for(int i = 0; i < 100; i++) {
				if(prodAcademic[i][5] != null && prodAcademic[i][0] != null) {
					year = Integer.parseInt(prodAcademic[i][5]);
					if(year == yearz && prodAcademic[i][0].equals(title) ) {
						if(prodAcademic[i][1] != null)
						System.out.println("Collaborators of Project:" + prodAcademic[i][1]);
						if(prodAcademic[i][2] != null)
						System.out.println("Students Guidelines:" + prodAcademic[i][2]);
						if(prodAcademic[i][3] != null)
						System.out.println("Titles of Papers:" + prodAcademic[i][3]);
						if(prodAcademic[i][4] != null)
						System.out.println("Name of Conference:" + prodAcademic[i][4]);
						if(prodAcademic[i][5] != null)
						System.out.println("Year:" + prodAcademic[i][5]);
						
						System.out.println("");
					}
				}
			}
			yearz--;			
		}
		
	}
	
	// Show Collaborator informations like E-mail, Associated Project, Titles of Papers and more
	public static void show_Collaborator(String name) {
		int indexCollaborator = search_Collaborator(name);
		
		if(indexCollaborator < 0) {
			System.out.println("Error: Not Find Collaborator");		
			return;
		}
		
			if(collaborator[indexCollaborator][0] != null)
				System.out.println("Collaborator: " + collaborator[indexCollaborator][0]);		
		    	
		    if(collaborator[indexCollaborator][1] != null)
		    	System.out.println("E-mail: " + collaborator[indexCollaborator][1]);
		    	
		    if(collaborator[indexCollaborator][2] != null)
				System.out.println("Type of Participant: " + collaborator[indexCollaborator][2]);
		    	
		    if(collaborator[indexCollaborator][3] != null)
				System.out.println("Associated Project: " + collaborator[indexCollaborator][3]);
		    	
		    if(collaborator[indexCollaborator][4] != null)
				System.out.println("Students Guidelines: " + collaborator[indexCollaborator][4]);
		    	
		    if(collaborator[indexCollaborator][5] != null)
				System.out.println("Titles of Papers: " + collaborator[indexCollaborator][5]);
		    	
		    if(collaborator[indexCollaborator][6] != null)
				System.out.println("Name of Conference: " + collaborator[indexCollaborator][6]);
		    	
		    if(collaborator[indexCollaborator][7] != null)
				System.out.println("Year: " + collaborator[indexCollaborator][7]);
		    	
		    if(collaborator[indexCollaborator][8] != null)
				System.out.println("Research Associated: " + collaborator[indexCollaborator][8]);
		    	
		    if(collaborator[indexCollaborator][0] != null)
		    	System.out.println("");
		     
		
	}
	
	// Show Project informations like Initial Date, Finish Date and call showProductionAcademic to give more information about that Project
	public static void show_Project(String title) {
		int indexProj = search_Projects(title);
		
		if(indexProj < 0) {
			System.out.println("Error: Not Find Project");		
			return;
		}
		    	
		if(projects[indexProj][0] != null)
		    		System.out.println("Title of Project:" + projects[indexProj][0]);
		    	
		    	if(projects[indexProj][4] != null)
		    		System.out.println("Initial Date: " + projects[indexProj][4]);
		    	
		    	if(projects[indexProj][5] != null)
				    System.out.println("Finish Date: " + projects[indexProj][5]);
		    	
		    	if(projects[indexProj][6] != null)
				    System.out.println("Funding Agency: " + projects[indexProj][6]);
		    	
		    	if(projects[indexProj][7] != null)
				    System.out.println("Value of Funding Agency: " + projects[indexProj][7]);
		    	
		    	if(projects[indexProj][1] != null)
				    System.out.println("Intention of Project: " + projects[indexProj][1]);
		    	
		    	if(projects[indexProj][2] != null)
				    System.out.println("Description: " + projects[indexProj][2]);
		    	
		    	if(projects[indexProj][3] != null)
				    System.out.println("Number of collaborator: " + projects[indexProj][3]);
		    	
		    	if(projects[indexProj][8] != null)
				    System.out.println("Status of Project: " + projects[indexProj][8]);
		    	
		    	if(projects[indexProj][0] != null)
		    		System.out.println("");

		    	colAssoc(title);
		    	
		    	showProductionAcademic(title);
		    	
		return;
	}
	
	
	// You can Edit Information about Collaborator
	public static void edit_Collaborator() {
		System.out.println("What the name of collaborator you want to edit?");
		Scanner input = new Scanner(System.in);
		String collaboratorName = input.nextLine();
		int index_CollaboratorName = search_Collaborator(collaboratorName);
		
		if(index_CollaboratorName == -1) {
			System.out.println("Error #404: Not Found Participant");
			return;
		}
		
		int op = -1;
		while(op != 0) {
			System.out.println("Choose what you want to edit:");
			System.out.println("(1) Name");
			System.out.println("(2) E-mail");
			System.out.println("(3) Type of Collaborator"); 
			System.out.println("(4) Associated Project");
			System.out.println("(5) Add Papers");
			System.out.println("(6) Add Guidelines");
			System.out.println("(0) Finish");
			
			op = input.nextInt();
			input.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("New name:");
				collaborator[index_CollaboratorName][0] = input.nextLine();
				System.out.println("Sucess");
				break;
				
			case 2:
				System.out.println("New E-mail:");
				collaborator[index_CollaboratorName][1] = input.nextLine();
				System.out.println("Sucess");
				break;
				
			case 3:
				while(true) {
					int type;
					System.out.println("Type of Collaborator:");
					System.out.println("(1) Graduation Student");
					System.out.println("(2) Master degree Student");
					System.out.println("(3) Doctorate Student");
					System.out.println("(4) Professor");
					System.out.println("(5) Researcher");
					
					type = input.nextInt();
					input.nextLine();
					
					if(type == 1) {
						collaborator[index_CollaboratorName][2] = "Graduation Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 2)  {
						collaborator[index_CollaboratorName][2] = "Master degree Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 3)  {
						collaborator[index_CollaboratorName][2] = "Doctorate Student";
						System.out.println("Sucess");
						break;
					}
					else if(type == 4)  {
						collaborator[index_CollaboratorName][2] = "Professor";
						System.out.println("Sucess");
						break;
					}
					else if(type == 5)  {
						collaborator[index_CollaboratorName][2] = "Researcher";
						System.out.println("Sucess");
						break;
					}
					else {
						System.out.println("Incorrect comand, try again");
					}
				}
				break;
			
			case 4:
				collaboratorProjectAssociated(index_CollaboratorName);
				break;
			case 5:
				addPapers(index_CollaboratorName);
				break;
			case 6:
				if(collaborator[index_CollaboratorName][2].equals("Professor")) {
					guidelinesStudents(index_CollaboratorName);
				}
				else {
					System.out.println("Just Professor can Guidelines Students");
				}
				break;
			case 0:
				op = 0;
				break;
			default:
				System.out.println("\nError #404 \n Invalid Input");
			}
		}
		
		
		
		
	}
	
	// You can add Papers or new Papers related with collaborator 
	public static void addPapers(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String paperInfo, value, titleProject;
		int indexProject;
		
		if(collaborator[indexCollaborator][5] == null) {
			System.out.println("Title of Paper:");
			collaborator[indexCollaborator][5] = input.nextLine();
			System.out.println("Name of Conference that publish the paper:");
			collaborator[indexCollaborator][6] = input.nextLine();
			System.out.println("Year of Conference:");
			collaborator[indexCollaborator][7] = input.nextLine();
			System.out.println("You have Research Associated: Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) {
				System.out.println("Title of Research Associated:"); // Need to check if Status of Project Associated is In progress 
				titleProject = input.nextLine();
				indexProject = search_Projects(titleProject);
				while(indexProject == -1) {
					System.out.println("Error: Not find project");
					System.out.println("Title of Research Associated:"); // Need to check if Status of Project Associated is In progress 
					titleProject = input.nextLine();
					indexProject = search_Projects(titleProject);				
				}
				if(projects[indexProject][8].equals("In progress")) {
					collaborator[indexCollaborator][8] = titleProject;
					prodAcademic[indexPA][0] = collaborator[indexCollaborator][8];
					prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];					
					prodAcademic[indexPA][3] = collaborator[indexCollaborator][5];
					prodAcademic[indexPA][4] = collaborator[indexCollaborator][6];
					prodAcademic[indexPA][5] = collaborator[indexCollaborator][7];
					indexPA++;
				}
				else System.out.println("You only can associated with in progress projects, this project is" + projects[indexProject][8]);
				
				
				
				
			}
			else {
				collaborator[indexCollaborator][8] = "*";
			}			
		}
		else if (collaborator[indexCollaborator][5] != null) {
			System.out.println("You have these Titles of Papers:" + collaborator[indexCollaborator][5]);
			System.out.println("You wanna add anothers Papers? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				
				System.out.println("New Title of Paper:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][5].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][3] = paperInfo;
				
				System.out.println("Name of Conference that publish the paper:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][6].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][4] = paperInfo;
				
				System.out.println("Year of Conference:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][7].concat("="+ paperInfo);
				System.out.println("Sucess");
				prodAcademic[indexPA][5] = paperInfo;
				
				System.out.println("You have Research Associated: Yes/No");
				value = input.nextLine();
				if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) {
					System.out.println("Title of Research Associated:");
					paperInfo = input.nextLine();
					indexProject = search_Projects(paperInfo);
					if(projects[indexProject][8].equals("In progress")) {
						collaborator[indexCollaborator][7].concat("="+ paperInfo);
						System.out.println("Sucess");
						prodAcademic[indexPA][0] = paperInfo;
						prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];					
						indexPA++;
					}
					else System.out.println("You only can associated with in progress projects, this project is" + projects[indexProject][8]);										
					
				}
				else {
					collaborator[indexCollaborator][7].concat("="+ "*");
				}
				
				return;
			}
		}
		
	}
	
	// You can add Guidelines if you is Professor, so you can tell who student you helping
	public static void guidelinesStudents(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String student, value;
		
		if(collaborator[indexCollaborator][4] == null) {
			System.out.println("What project associated:");
			String professorAssociated = input.nextLine();
			
			System.out.println("New Student that you guidelines:");
			collaborator[indexCollaborator][4] = input.nextLine();
			
			System.out.println("Year: ");
			prodAcademic[indexPA][5] = input.nextLine();
			
			prodAcademic[indexPA][0] = professorAssociated;
			prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];	
			prodAcademic[indexPA][2] = collaborator[indexCollaborator][4];
			indexPA++;
		}
		else if (collaborator[indexCollaborator][4] != null) {
			System.out.println("You have these Students Guidelines:" + collaborator[indexCollaborator][4]);
			System.out.println("You wanna add another Students? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				System.out.println("What project associated:");
				String professorAssociated = input.nextLine();
				
				System.out.println("New Student Guidelines:");
				student = input.nextLine();
				collaborator[indexCollaborator][4].concat("="+ student);
				System.out.println("Sucess");
				
				System.out.println("Year:");
				prodAcademic[indexPA][5] = input.nextLine();
				System.out.println("Sucess");
				
				prodAcademic[indexPA][0] = professorAssociated;
				prodAcademic[indexPA][1] = collaborator[indexCollaborator][0];	
				prodAcademic[indexPA][2] = student;
				indexPA++;
				
				return;
			}
		}
	}
	
	
	public static void collaboratorProjectAssociated(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String statusProject, project, value;
		
		if(collaborator[indexCollaborator][3] == null) {
			System.out.println("New Associated Project:");
			project = input.nextLine();
			statusProject = checkStatusProject(project);
			
			if(statusProject.equals("In preparation")) {
				collaborator[indexCollaborator][3] = project;
				System.out.println("Sucess");			
			}
			else if (statusProject.equals("In progress")) {
				System.out.println("Sorry, but you can't add Participants to projects in progress");
				return;
			}
			else if(statusProject.equals("Completed")) {
				System.out.println("Sorry, but you can't add Participants to this projects, it's completed ");
				return;
			}
		}
		else if (collaborator[indexCollaborator][3] != null) {
			System.out.println("You have this Associated Project:" + collaborator[indexCollaborator][3]);
			System.out.println("You wanna add another Associated Project? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				String[] AssociatedProjects = collaborator[indexCollaborator][3].split("=");
				
				if(AssociatedProjects.length >= 2 && collaborator[indexCollaborator][2].equals("Graduation Student")) { // Check test
					System.out.println("Sorry, Graduation Student can't associate more than 2 projects");
					return;
				}
				else {
					System.out.println("New Associated Project:");
					project = input.nextLine();
					collaborator[indexCollaborator][3].concat("="+ project);
					System.out.println("Sucess");
					return;
				}
			}
		}
		
		
		
	}
	
	// Give us Status of Project
	public static String checkStatusProject(String project) {
		int indexProject = search_Projects(project);
		return projects[indexProject][8];
	}
	
	// Edit Status of Project if you follow the System Requirements
	public static void edit_statusProjects() {
		String title;
		int index_editTitle, answer, papers = 0, professor = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What the title of project you want to change status?");
		
		title = input.nextLine();
		index_editTitle = search_Projects(title);
		
		if(index_editTitle == -1) {
			System.out.println("Error: not find this title");
			return;
		}		
		
		System.out.println("This project is: " + projects[index_editTitle][8]);
		System.out.println(" (1) Change for Completed");
		System.out.println(" (2) Change for In Progress");
		answer = input.nextInt();
		input.nextLine();
		
		if(answer == 1) { // Check if is enable to complete
			title = checkStatusProject(projects[index_editTitle][0]);
			if(title.equals("In progress")) {
				papers = checkPapersProject(projects[index_editTitle][0]); // Check if how many papers have published about this project
				professor = checkProfessorProject(projects[index_editTitle][0]);
				if(papers == 0 && professor == 0){
					System.out.println("You can't change to completed, because you need add at least one Paper published");
				}
				else {
					projects[index_editTitle][8] = "Completed";
					System.out.println("Sucess");
				}
			}
			System.out.println("Project Status now is " + projects[index_editTitle][8]);
		}
		else if (answer == 2) { // Check if is enable to change for In progress
			if(checkFullyRegisterProject(index_editTitle)) {
				projects[index_editTitle][8] = "In progress";
				System.out.println("Sucess");
				System.out.println("Project Status now is " + projects[index_editTitle][8]);
			}
			else {
				System.out.println("Project Status still " + projects[index_editTitle][8] + "\n Because, you need to complete all basic information about this project");
			}	
		}
			
		
		
	}
	
	// Check if all information about one Project is complete, that's because we need all basic information about one project to change his status
	public static boolean checkFullyRegisterProject(int index_project) {	
		
		for(int i = 0; i < projects[index_project].length ; i++) {
			if(projects[index_project][i] == null) {
				return false;
			}
		}
		return true;
	}
	
	// Check if Collaborator is a Professor
	public static int checkProfessorProject(String title) {
		for(int j = 0; j < collaborator.length; j++ ) {
			if(collaborator[j][3] != null) {
				String proj[] = collaborator[j][3].split("=");
				for(int k = 0; k < proj.length; k++) {
					if(proj[k].equals(title) && collaborator[j][2].equals("Professor")) {
						return 1;
					}
				} 
			}
		}
		return 0;
	}
	
	// Check how many Papers have in one project
	public static int checkPapersProject(String title) {
		
		for(int j = 0; j < collaborator.length; j++ ) {				
				if(collaborator[j][5] != null) {																			
					return 1;	
				}
		}
		return 0;
	}		
	
	// You can Edit information about one project
	public static void edit_Project() {
			String project;
			int index_project, day, month, year;
			Scanner input = new Scanner(System.in);
			System.out.println("What title of project you want edit:");
			project = input.nextLine();
			index_project = search_Projects(project);
			
			if(index_project == -1) {
				System.out.println("Error: not find this title");
				return;
			}
			
			int op = -1;
			while(op != 0) {
				System.out.println("Choose what you want to edit:");
				System.out.println("(1) Title");
				System.out.println("(2) Intention");
				System.out.println("(3) Description"); 
				System.out.println("(4) Number of collaborator");
				System.out.println("(5) Date");  //!!!!! Do this
				System.out.println("(6) Funding Agency");
				System.out.println("(0) Finish edit");
				
				op = input.nextInt();
				input.nextLine();
				
				switch(op) {
				case 1:
					System.out.println("New title:");
					projects[index_project][0] = input.nextLine();
					System.out.println("Sucess");
					break;
					
				case 2:
					System.out.println("New intention:");
					projects[index_project][1] = input.nextLine();
					System.out.println("Sucess");
					break;
					
				case 3:
					System.out.println("New description:");
					projects[index_project][2] = input.nextLine();
					System.out.println("Sucess");
					break;
				
				case 4:
					System.out.println("New number of collaborator:");
					projects[index_project][3] = input.nextLine();
					System.out.println("Sucess");
					break;
				case 5:
					
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
					
					
					projects[index_project][4] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
					
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
					
							
					projects[index_project][5] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
					
					break;
				case 6:
					System.out.println("New Funding Agency of Project:");
					
					projects[index_project][6] = input.nextLine();										
				
					System.out.println("New Value of Funding Agency:");
					
					projects[index_project][7] = input.nextLine();	
					break;
				case 0:
					op = 0;
					break;
				default:
					System.out.println("\nError #404 \n Invalid Input");
				}
			}
		}
	
	// Search one projects and give us Integer that's index of project in string[][]projects
	public static int search_Projects(String title) {
		for (int l = 0; l < projects.length; l++) {
			if(projects[l][0] != null && projects[l][0].equals(title))
				return l;
		}
		return -1;
	}
	
	// Search one collaborator and give us Integer that's index of collaborator in string[][]collaborator
	public static int search_Collaborator(String name) {
		for (int l = 0; l < collaborator.length; l++) {
			if(collaborator[l][0] != null && collaborator[l][0].equals(name))
				return l;
		}
		return -1;
	}
	
	// Show a report to user, with all information with system requirements
	public static void showReport() {
		int col = 0;
		int projPre = 0;
		int projPro = 0;
		int projCom = 0;
		int totalProj = 0;
		int prodGui = 0;
		int prodPaper = 0;
		int j,k;
		String preparation = "In preparation";
		String progress = "In progress";
		String completed = "Completed";
		
		
		for(j = 0; j < collaborator.length ; j++) {
			if(collaborator[j][0] != null) col++;
				
			if(collaborator[j][4] != null ) {
				String guideline[] = collaborator[j][4].split("="); // Student Guideline
				for(k = 0; k < guideline.length; k++) {
					prodGui++;
				}
					
			}
				
			if(collaborator[j][5] != null) {
				String papers[] = collaborator[j][5].split("="); // Papers
				for(k = 0; k < papers.length; k++) {
					prodPaper++;
				} 
			}
		}
		
		
		for(j = 0; j < projects.length ; j++) {
			if(projects[j][8] != null) {
				if(projects[j][8].equals(preparation)) projPre++;
				if(projects[j][8].equals(progress)) projPro++;
				if(projects[j][8].equals(completed)) projCom++;
			}
		}
		
		totalProj = projPre + projPro + projCom;
		
		System.out.println("Number of collaborators: " + col);
		System.out.println("Number de projects In preparation: " + projPre);
		System.out.println("Number de projetos In progress: " + projPro);
		System.out.println("Number de projetos Completed: " + projCom);
		System.out.println("Number total of projects: " + totalProj);		
		System.out.println("Number of production academic by type: " + "\nPapers: "+ prodPaper + "\nGuidelines: " + prodGui);
		
		
	}
	
}	
