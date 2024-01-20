import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CameraMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		userInfo  user = new userInfo();
		CameraOperations obj=new CameraOperations();
		
		user.setUsername("aisha");
		user.setPassword("aisha@123");
		user.setWalletAmt(10000.00);

		
	System.out.println("+--------------------------------+");
	System.out.println("|  WELCOME TO CAMERA RENTAL APP  |");
	System.out.println("+--------------------------------+");
	
	System.out.println("Please Login To Continue");
	System.out.println("Enter you username");
	String username=sc.next();
	System.out.println("Enter you Password");
	String password=sc.next();
	
	
	if (user.getUsername().equals(username) && user.getPassword().equals(password))  {
		while(true) {
		System.out.println("Showing Main Menu");
		System.out.println("1. My Camera\n2. Rent A Camera\n3. View All Camera\n4. My Wallet\n5. Exit ");
		System.out.println("Pick ur Choice : ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: 
				System.out.println("Showing Sub List");
				System.out.println("1. Add Camera\n2. Remove Camera\n3. View Cameras\n4. Back to Main Menu");
			    System.out.println("Pick Your Choice : ");
			    int ch1=sc.nextInt();

			    switch(ch1) {
			    case 1: 
			    	 boolean backToMainMenu = false;
			    	 System.out.println("Enter Camera ID:");
                     int camId = sc.nextInt();
                     System.out.println("Enter Brand:");
                     String brand = sc.next();
                     System.out.println("Enter Model:");
                     String model = sc.next();
                     System.out.println("Enter Rent per Day:");
                     float rentPerDay = sc.nextFloat();

                     Camera cam1 = new Camera(ch1, brand, brand, rentPerDay, brand);
                     cam1.setCamid(camId);
                     cam1.setBrand(brand);
                     cam1.setModel(model);
                     cam1.setRentperday(rentPerDay);

                     String addResult = obj.addCamera(cam1);
                     System.out.println(addResult);
                    
			        break;
			        
				case 2 : 
					System.out.println("remove camera");
			     	ArrayList<Camera> camera=obj.ShowAllCameras();
			     	System.out.println("================================================================================");
			     	System.out.println("Camera id\t\tBrand\t\tModel\t\tPrice\t\tStatus");
			     	for(Camera c:camera)
			     	{
			     		System.out.println(c.camid +"\t\t"+c.brand+"\t\t"+c.model+"\t\t"+c.rentperday+"\t\t"+c.status);
					}
			     	System.out.println("=================================================================================");
				    System.out.println("Enter the camera id to remove");
			        int id=sc.nextInt();
	   	            obj.removeCamera(id);
	    	         System.out.println("Camera Successfully removed from the list");
     		         break;
				         
				case 3:System.out.println("view all camera "); 				
			        	ArrayList<Camera> camera1=obj.ShowAllCameras();
			        	System.out.println("==============================================================================");
			        	System.out.println("Camera id\t\tBrand\t\tModel\t\tPrice\t\tStatus");
				        for(Camera c:camera1) {
				    	   System.out.println(c.camid +"\t\t"+c.brand+"\t\t"+c.model+"\t\t"+c.rentperday+"\t\t"+c.status);
				       }
				        System.out.println("==============================================================================");
				        break;
				        
				 case 4:
			             backToMainMenu = true; 
			            break;
			            default:
			            System.out.println("Invalid choice. Please try again.");
			            break;
			            }
			     break;
			     
		  case 2:
				System.out.println("Rent a Camera Functionality");
				System.out.println("Enter Camera ID to rent:");
		        int rentCamId = sc.nextInt();
			    obj.rentACamera(rentCamId,user);
				break;

		 case 3:
			    System.out.println("View All Cameras");
			    List<Camera> allCameras = obj.ShowAllCameras();	    
			    if (allCameras.isEmpty()) 
			    {
			        System.out.println("No cameras available at the moment.");
			    } 
			    else 
			    {
			        System.out.println("=================================================================================");
			        System.out.println("Camera id\t\tBrand\t\tModel\t\tPrice\t\tStatus");
			        for (Camera camera : allCameras) {
			            System.out.println(camera.getCamid() + "\t\t" + camera.getBrand() + "\t\t" +
			                    camera.getModel() + "\t\t" + camera.getRentperday() + "\t\t" + camera.getStatus());
			     }
			        System.out.println("==================================================================================");
			    }
			    break;

			case 4:
			    System.out.println("My Wallet Functionality");
			    System.out.println("Current Wallet Balance: " + user.getWalletAmt());
			    System.out.println("1. Add Amount to Wallet");
			    System.out.println("2. Back to Main Menu");
			    System.out.println("Choose an option:");
			    int walletChoice = sc.nextInt();

			    switch (walletChoice) {
			        case 1:
			            user.addAmtToWallet();
			            break;
			        case 2:
			            break;
			        default:
			            System.out.println("Invalid choice. Please try again.");
			            break;
			    }
			    break;

			case 5: 
				System.out.println("Thanks for using App");
				System.exit(0);

	}
		
	}
		
	}
	else
		System.out.println("incorrect username/password");
	
	
	}
	}

