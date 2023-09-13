package com.dnb.devconnector;

import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.devconnector.dto.Experience;
import com.dnb.devconnector.dto.Profile;
import com.dnb.devconnector.dto.User;
import com.dnb.devconnector.exceptions.InvalidMailException;
import com.dnb.devconnector.service.ExperienceService;
import com.dnb.devconnector.service.ProfileService;
import com.dnb.devconnector.service.UserService;
@SpringBootApplication
public class DevconnectorApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DevconnectorApplication.class, args);
		System.out.println("hello");
//		UserService userService = applicationContext.getBean(UserService.class);
//		ProfileService profileService = applicationContext.getBean(ProfileService.class);
//		ExperienceService experienceService=applicationContext.getBean(ExperienceService.class);
//		
//		User user = new User();
//		Profile profile= null;
//		Experience experience= new Experience();
//		
//		
//		try {
//			user = new User("aara","s11","aa111r","ar");
//			userService.createUser(user);
//			Profile profile1= new Profile("1","xyz","xyz","xyz","xyz","xyz","xyz","xyz","xyz","xyz","xyz","xyz","xyz");
//			profileService.createUserProfile(profile1);
//			experience= new Experience("1","xyz","xyz","xyz");
//			experienceService.createUserExperience(experience);
//		}catch (Exception e) {
//			e.printStackTrace();// TODO: handle exception
//		}
		
//		Scanner sc= new Scanner(System.in);
//		while(true) {
//			System.out.println(
//					"1.Create User Account\n2.Get User Details by ID\n3. Delete User Details by ID\n4.Retrieve All Users\n5.Exit");
//			System.out.println();
//			System.out.print("Enter your Choice: ");
//			int value = sc.nextInt();
//			switch (value) {
//			case 1:
//				try {
////					System.out.println("Enter the user name:");
////					String username= sc.next();
////					user.setUserName(username);
////					System.out.println("Enter the user name:");
////					String usermail= sc.next();
////					user.setUserEmail(usermail);
////					System.out.println("Enter the user name:");
////					String password= sc.next();
////					user.setUserPassword(password);
////					System.out.println("Enter the user name:");
////					String confirmpassword= sc.next();
////					user.setConfirmPassword(confirmpassword);
////					
////					
////					
////					System.out.println(user);
//					User user2= userService.createUser(user);
//					System.out.println(user2);
//				}catch (Exception e) {
//					// TODO: handle exception
//				}
//				break;
//			case 2:
//				System.out.println("Enter user email");
//				String useremail = sc.next();
//				Optional<User> returnAccount;
//				try {
//					returnAccount = userService.getUserByEmail(useremail);
//					System.out.println(returnAccount);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} 
//				break;
//			case 3:
//				System.out.println("Enter the user email");
//				String accountID = sc.next();
//				
//				try {
//					System.out.println(userService.deleteUser(accountID));
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
//				
//			}
//			
//			}
//		
//	
//	}
//
//	public static String generateAlphanumericUUID() {
//		UUID uuid = UUID.randomUUID();
//		String alphanumericUUID = uuid.toString().replace("-", "");
//		return alphanumericUUID;
//	}

}
}
