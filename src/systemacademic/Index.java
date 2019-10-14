package systemacademic;
import java.util.Scanner;

public class Index {

	
	/*	    							  ( Info basic of Projects)
	 *	 0  			1	         2		   3			  4		5		6		    7			    8			
	 * Title of Project | Intention of Project | Description |  Number of collaborator | Initial Date | Finish Date | Funding Agency | Value of Funding Agency | Status of Project | 
	 *       
	 *
	 *	     						    	( Info basic of Participants )
	 * 	   0 		    1	  	2			  3		    4			 5		      6	             7		  8		        			
	 * Name of collaborator | E-mail | Type of Participant | Associated Project | Students Guidelines | Titles of Papers | Name of Conference | Year | Research Associated (if have) |
	 * 
	 * 
	 * 			Status of Project
	 * 			
	 * In preparation -> In progress -> Completed
	 * 
	 * */
	
	static int line_projects = 100, columm_projects = 9 , line_collaborator = 100 , columm_collaborator = 9;
	static String [][] projects = new String[line_projects][columm_projects];
	static String [][] collaborator = new String[line_collaborator][columm_collaborator];
	
	public static void main(String[] args) {
		
		int key = -1, key_adm = -1, key_p = -1, index_projectForParticipant;
		int index_projects = -1, index_participants = 0, day, month, year, typePart;
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
						System.out.println("(1) - Add Project");
						System.out.println("(2) - Add Collaborator");
						System.out.println("(3) - Edit Project");
						System.out.println("(4) - Edit status of projects");
						System.out.println("(5) - Edit Collaborator");
						System.out.println("(6) - Show Projects");
						System.out.println("(7) - Show collaborator");
						System.out.println("(0) - Sign out");						
						
						key_p = input.nextInt();
						input.nextLine();
						
						switch (key_p) {
						case 1:
							System.out.println("Title of Project:");
							
							index_projects++;
							projects[index_projects][0] = input.nextLine();
							
							projects[index_projects][8] = "In preparation";
							
							System.out.println("Continue? (Yes or No)");
							key1 = input.nextLine();					
							
							if(key1.equals("Yes") || key1.equals("Y") || key1.equals("y")) {
								System.out.println("Intention of Project:"); 
							
								projects[index_projects][1] = input.nextLine();					
						
								System.out.println("Description of Project:"); 
								
								projects[index_projects][2] = input.nextLine();								
					
								System.out.println("Number of collaborator of Project:"); 
								
								projects[index_projects][3] = input.nextLine();
								
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
									
									
									projects[index_projects][4] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
									
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
									
											
									projects[index_projects][5] = (Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) );
									
									System.out.println("Continue to complete Funding Agency of project? (Yes or No)");
									key1 = input.nextLine();
									
									if(key1.equals("Yes") || key1.equals("Y")  || key1.equals("y")) {
										System.out.println("Funding Agency of Project:");
										
										projects[index_projects][6] = input.nextLine();										
										
										System.out.println("Value of Funding Agency:");
										
										projects[index_projects][7] = input.nextLine();	
									}
								}
							}
							break;
							
						case 2:
							
							System.out.println("Name of Collaborator");
							
							collaborator[index_participants][0] = input.nextLine();
							
							System.out.println("E-mail of Collaborator (like: ****@gmail.com"); //validar somente e-mail
							
							collaborator[index_participants][1] = input.nextLine();
							
							System.out.println("Type of Participant:");
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
							
							System.out.println("Associated Project: (Title of Project)");
							
							projectParticipant = input.nextLine();
							
							index_projectForParticipant = search_Projects(projectParticipant);
							
							if(!(projects[index_projectForParticipant][8].equals("In preparation"))) {
								System.out.println("This project isn't in preparation, you can't add collaborator");
								break; 
							}
							
							collaborator[index_participants][3] = projectParticipant;				
							System.out.println("If you wanna to add Papers, Guidelines or more, try to Edit Collaborator");
																	
						    index_participants++;
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
							show_Projects();
							break;
						case 7:
							
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
	
	public static void show_Collaborator() {
		System.out.println("Collaborators:\n");
		 for (int l = 0; l < collaborator.length; l++)  {  
		    	if(projects[l][0] != null)
		    		System.out.println("Name of collaborator:" + projects[l][0]);
		    	
		    	if(projects[l][1] != null)
		    		System.out.println("E-mail: " + projects[l][1]);
		    	
		    	if(projects[l][2] != null)
				    System.out.println("Type of Participant: " + projects[l][2]);
		    	
		    	if(projects[l][3] != null)
				    System.out.println("Associated Project: " + projects[l][3]);
		    	
		    	if(projects[l][4] != null)
				    System.out.println("Number of Papers: " + projects[l][4]);
		    	
		    	if(projects[l][5] != null)
				    System.out.println("Number of guidelines: " + projects[l][5]);
		    	
		    	if(projects[l][6] != null)
				    System.out.println("Titles of Papers: " + projects[l][6]);
		    	
		    	if(projects[l][7] != null)
				    System.out.println("Name of Conference: " + projects[l][7]);
		    	
		    	if(projects[l][8] != null)
				    System.out.println("Year: " + projects[l][8]);
		    	
		    	if(projects[l][9] != null)
				    System.out.println("Research Associated: " + projects[l][9]);
		    	
		    	if(projects[l][0] != null)
		    		System.out.println("");
		     
		 }  
		
	}
	
	public static void show_Projects() {
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
				    System.out.println("Number of collaborator: " + projects[l][7]);
		    	
		    	if(projects[l][8] != null)
				    System.out.println("Status of Project: " + projects[l][8]);
		    	
		    	if(projects[l][0] != null)
		    		System.out.println("");
		     
		 }  
		
	}
	
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
	
	/* Name of collaborator | E-mail | Type of Participant | Associated Project |  Students Guidelines | Titles of Papers | Name of Conference | Year | Research Associated (if have) |*/
	
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
				if(projects[indexProject][8].equals("In progress")) collaborator[indexCollaborator][7] = titleProject;
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
				collaborator[indexCollaborator][5].concat("|"+ paperInfo);
				System.out.println("Sucess");
				
				System.out.println("Name of Conference that publish the paper:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][6].concat("|"+ paperInfo);
				System.out.println("Sucess");
				
				System.out.println("Year of Conference:");
				paperInfo = input.nextLine();
				collaborator[indexCollaborator][7].concat("|"+ paperInfo);
				System.out.println("Sucess");
				
				System.out.println("You have Research Associated: Yes/No");
				value = input.nextLine();
				if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) {
					System.out.println("Title of Research Associated:");
					paperInfo = input.nextLine();
					indexProject = search_Projects(paperInfo);
					if(projects[indexProject][8].equals("In progress")) {
						collaborator[indexCollaborator][7].concat("|"+ paperInfo);
						System.out.println("Sucess");
					}
					else System.out.println("You only can associated with in progress projects, this project is" + projects[indexProject][8]);										
					
				}
				else {
					collaborator[indexCollaborator][7].concat("|"+ "*");
				}
				
				return;
			}
		}
		
	}
	
	public static void guidelinesStudents(int indexCollaborator) {
		Scanner input = new Scanner(System.in);
		String student, value;
		
		if(collaborator[indexCollaborator][4] == null) {
			System.out.println("New Student that you guidelines:");
			collaborator[indexCollaborator][4] = input.nextLine();				
		}
		else if (collaborator[indexCollaborator][4] != null) {
			System.out.println("You have these Students Guidelines:" + collaborator[indexCollaborator][4]);
			System.out.println("You wanna add another Students? Yes/No");
			value = input.nextLine();
			if(value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) { 
				System.out.println("New Student Guidelines:");
				student = input.nextLine();
				collaborator[indexCollaborator][4].concat("|"+ student);
				System.out.println("Sucess");
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
				String[] AssociatedProjects = collaborator[indexCollaborator][3].split("|");
				
				if(AssociatedProjects.length >= 2 && collaborator[indexCollaborator][2].equals("Graduation Student")) { // Check test
					System.out.println("Sorry, Graduation Student can't associate more than 2 projects");
					return;
				}
				else {
					System.out.println("New Associated Project:");
					project = input.nextLine();
					collaborator[indexCollaborator][3].concat("|"+ project);
					System.out.println("Sucess");
					return;
				}
			}
		}
		
		
		
	}
	
	public static String checkStatusProject(String project) {
		int indexProject = search_Projects(project);
		return projects[indexProject][8];
	}
	
	public static void edit_statusProjects() {
		String title;
		int index_editTitle, answer, papers = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What the title of project you want to change status?");
		
		title = input.nextLine();
		index_editTitle = search_Projects(title);
		
		System.out.println("This project is: " + projects[index_editTitle][8]);
		System.out.println(" (1) Change for Completed");
		System.out.println(" (2) Change for In Progress");
		answer = input.nextInt();
		input.nextLine();
		
		if(answer == 1) { // Check if is enable to complete
			title = checkStatusProject(projects[index_editTitle][0]);
			if(title.equals("In progress")) {
				papers = checkPapersProject(projects[index_editTitle][0]); // Check if how many papers have published about this project
				if(papers == 0){
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
	
	public static boolean checkFullyRegisterProject(int index_project) {	
		
		for(int i = 0; i < projects[index_project].length ; i++) {
			if(projects[index_project][i] == null) {
				return false;
			}
		}
		return true;
	}
	
	public static int checkPapersProject(String title) {
		int i = 0;
		
		for(int j = 0; j < collaborator.length; j++ ) {
			String titleByCol[] = collaborator[j][3].split("|");
			for(int k = 0; k < titleByCol.length; k++) {
				if(titleByCol[k].equals(title)) {
					String papersByCol[] = collaborator[j][5].split("|");
					for(int l = 0; l < papersByCol.length; l++) {
						i++;
					}
				}
			}
			
		}
		return i;
	}		
	
	public static void edit_Project() {
			String project;
			int index_project;
			Scanner input = new Scanner(System.in);
			System.out.println("What title of project you want edit:");
			project = input.nextLine();
			index_project = search_Projects(project);
			
			if(index_project == -1) {
				System.out.println("Error: not find this title");
			}
			
			int op = -1;
			while(op != 0) {
				System.out.println("Choose what you want to edit:");
				System.out.println("(1) Title");
				System.out.println("(2) Intention");
				System.out.println("(3) Description"); 
				System.out.println("(4) Number of collaborator");
				System.out.println("(5) Date");
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
				case 0:
					op = 0;
					break;
				default:
					System.out.println("\nError #404 \n Invalid Input");
				}
			}
		}
	
	public static int search_Projects(String title) {
		for (int l = 0; l < projects.length; l++) {
			if(projects[l][0].equals(title))
				return l;
		}
		return -1;
	}
	
	public static int search_Collaborator(String name) {
		for (int l = 0; l < collaborator.length; l++) {
			if(collaborator[l][0].equals(name))
				return l;
		}
		return -1;
	}
	
}	

