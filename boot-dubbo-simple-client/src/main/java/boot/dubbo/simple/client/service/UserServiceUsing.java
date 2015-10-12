package boot.dubbo.simple.client.service;

import org.springframework.stereotype.Service;

import boot.dubbo.api.User;
import boot.dubbo.api.UserService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class UserServiceUsing {
	@Reference(protocol="rest")
	private UserService userService;
	
	public void test() {
		System.out.println("findAllUsers: " + userService.findAllUsers());
		
		Integer userIdFind = 1;
		System.out.println("findUser: " + userService.findUser(userIdFind));
		
		User userPost = new User(2, "cliff create");
		System.out.println("findUser: " + userService.addUser(userPost));
		
		User userPut = new User(2, "cliffUpdate");
		System.out.println("findUser: " + userService.updateUser(userPut));
		
		Integer userIdDelete = 2;
		System.out.println("findUser: " + userService.deleteUser(userIdDelete));
	}
}
