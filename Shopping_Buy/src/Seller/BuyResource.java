package Seller;

import java.net.*;
import java.util.*;
 
import javax.ws.rs.*;
import javax.ws.rs.core.*;
 
 
@Path("/buy")
public class BuyResource {
    private BuyDao dao = BuyDao.getInstance();
     
   

  @GET
  @Produces(MediaType.APPLICATION_JSON)
public List<Buy> list() {
    return dao.listAll();
}

  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response add(Buy item) throws URISyntaxException {
      int newItemId = dao.add(item);
      URI uri = new URI("/items/" + newItemId);
      return Response.created(uri).build();
  }
  
@GET
  @Path("{id}")
  
  public Response get(@PathParam("id") int id) {
      Buy item = dao.get(id);
      if (item != null) {
          return Response.ok(item, MediaType.APPLICATION_JSON).build();
      } else {
          return Response.status(Response.Status.NOT_FOUND).build();
      }
  }
  
@PUT
@Consumes(MediaType.APPLICATION_JSON)
@Path("{id}")
public Response update(@PathParam("id") int id, Buy item) {
  item.setCustId(id);
    if (dao.update(item)) {
        return Response.ok().build();
    } else {
        return Response.notModified().build();
    }
}
  
@DELETE
@Path("{id}")
public Response delete(@PathParam("id") int id) {
    if (dao.delete(id)) {
        return Response.ok().build();
    } else {
        return Response.notModified().build();
    }
} 

  
}