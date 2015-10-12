package boot.dubbo.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface UserService {
	/**
	 * 获取所有用户
	 * 
	 * @return所有用户
	 */
    @GET
    @Path("get/all")
	List<User> findAllUsers();
    
    @GET
    @Path("get/{userId}")
    User findUser(@PathParam ("userId") Integer userId);

    @POST
    @Path("post")
	List<User> addUser(User user);
    
    @PUT
    @Path("put")
    List<User> updateUser(User user);
    
    @DELETE
    @Path("delete/{userId}")
    List<User> deleteUser(@PathParam ("userId") Integer userId);
}
