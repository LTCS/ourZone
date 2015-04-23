package ourZone;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/publish")
public class PublishService
{
	@POST
	@Path("/singlearticle")
    @Consumes("application/json") 
	public Response publishSingleArticle(String msg)
	{
		return Response.status(200).entity(msg).build();
	}
}
