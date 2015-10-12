package boot.dubbo.normal.client.normal;

import ws2j.userservice.User;
import ws2j.userservice.UserService;
import ws2j.userservice.UserServicePortType;


public class RMIConsumer {

	public static void main(String[] args) throws Exception {
		UserServicePortType userService = new UserService().getUserServicePort();
		while(true){
			System.out.println("findAllUsers: " + userService.findAllUsers());
			
			Integer userIdFind = 1;
			System.out.println("findUser: " + userService.findUser(userIdFind));
			
			User userPost = new User();
			userPost.setId(2);
			userPost.setName("cliff add");
			System.out.println("findUser: " + userService.addUser(userPost));
			
			User userPut = new User();
			userPut.setId(2);
			userPut.setName("cliff update");
			System.out.println("findUser: " + userService.updateUser(userPut));
			
			Integer userIdDelete = 2;
			System.out.println("findUser: " + userService.deleteUser(userIdDelete));
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

	}

}
