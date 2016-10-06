package cc.ionicboot;

import cc.ionicboot.api.LoginController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        //register(Endpoint.class);
        register(LoginController.class);
        //filter
        //register(RequestFilter.class);
    }
}