package teste.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("hello/{nome}")
public class RecursoSimples {
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public RecursoSimples() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of RecursoSimple
     * @return an instance of String
     */
    @GET
    @Produces("text/html")
    public String getHtml(@PathParam("nome") String nome) {
        return "<html><body><h1>Hello "+nome+"!!</h1></body></html>";
    }

    /**
     * PUT method for updating or creating an instance of RecursoSimple
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }

}