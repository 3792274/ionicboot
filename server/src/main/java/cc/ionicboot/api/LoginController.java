package cc.ionicboot.api;


import cc.ionicboot.services.LoginSevice;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * The type Login controller.
 */
@Component
@Path("hello")
public class LoginController {

    @Inject
    private LoginSevice loginSevice;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String login(@PathParam("id") @NotNull String input) {
        return input + this.loginSevice.getName();
    }
}
