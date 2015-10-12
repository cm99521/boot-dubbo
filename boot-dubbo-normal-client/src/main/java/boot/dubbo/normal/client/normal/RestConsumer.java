package boot.dubbo.normal.client.normal;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import boot.dubbo.api.User;

public class RestConsumer {

	public static void main(String[] args) {
		while (true) {
			get();
			post();
			put();
			delete();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void get() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://localhost:9090/user/get/1");
		Response response = target.request().header("Content-Type", "application/json").get();
		// Read output in string format
		if (response.getStatus() != 200) {
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
		}
		System.out.println("findUser: " + response.readEntity(User.class));
		response.close();
		
	}
	static void post() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://localhost:9090/user/post");
		
		User userPost = new User(2, "cliff add");
		Response response = target.request().post(Entity.entity(userPost, "application/json"));
		// Read output in string format
		if (response.getStatus() != 200) {
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
		}
		System.out.println("addUser: " + response.readEntity(List.class));
		response.close();
		
	}
	static void put() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://localhost:9090/user/put");
		
		User userPost = new User(2, "cliff update");
		Response response = target.request().put(Entity.entity(userPost, "application/json"));
		// Read output in string format
		if (response.getStatus() != 200) {
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
		}
		System.out.println("updateUser: " + response.readEntity(List.class));
		response.close();
		
	}
	static void delete() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://localhost:9090/user/delete/2");
		
		Response response = target.request().delete();
		// Read output in string format
		if (response.getStatus() != 200) {
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
		}
		System.out.println("deleteUser: " + response.readEntity(List.class));
		response.close();
		
	}
}
