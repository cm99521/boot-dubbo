package boot.dubbo.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("pai")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface PAIService {
	/**
	 * 获取所有用户
	 * 
	 * @return所有用户
	 */
    @GET
    @Path("listApps")
	List<Application> listApps();
    
   
}
