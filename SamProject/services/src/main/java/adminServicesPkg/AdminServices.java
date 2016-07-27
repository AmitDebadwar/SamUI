package adminServicesPkg;

/**
 * Created by SaiRahem on 25/07/2016.
 */
/**
 * Created by SaiRahem on 25/07/2016.
 */


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/adminServices")
public class AdminServices {

    @GET
    @Path("/validateUser")
    @Produces(MediaType.APPLICATION_JSON)
    public String validateUser() {
        return "success from server";
    }

}
