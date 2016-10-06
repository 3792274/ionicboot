package cc.ionicboot.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * The type Login sevice.
 */
@Component
@PropertySource("classpath:application.properties")
public class LoginSevice {
    /**
     * The Name.
     */
    @Value("${name:world}")
    String name;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }
}
