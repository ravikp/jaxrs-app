package samples.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

// Specifies the path to the RESTful service
@Path("/helloworld")
public class helloWorld {

    // Specifies that the method processes HTTP GET requests
    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello World!";
    }
}
