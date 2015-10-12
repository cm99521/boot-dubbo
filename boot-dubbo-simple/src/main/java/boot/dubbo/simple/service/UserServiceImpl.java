package boot.dubbo.simple.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import boot.dubbo.api.User;
import boot.dubbo.api.UserService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(protocol = { "dubbo", "rest", "webservice" })
public class UserServiceImpl implements UserService {

	private static Map<Integer, User> users = new ConcurrentHashMap<Integer, User>();
	static
	{
		User user = new User(1,"cliff");
		users.put(user.getId(), user);
	}
	@Override
	public List<User> findAllUsers() {
		return new ArrayList<User>(users.values());
	}

	@Override
	public User findUser(Integer userId) {
		return users.get(userId);
	}

	@Override
	public List<User> addUser(User user) {
		users.put(user.getId(), user);
		return new ArrayList<User>(users.values());
	}

	@Override
	public List<User> updateUser(User user) {
		users.put(user.getId(), user);
		return new ArrayList<User>(users.values());
	}

	@Override
	public List<User> deleteUser(Integer userId) {
		users.remove(userId);
		return new ArrayList<User>(users.values());
	}

	

}
