package az.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author knfx094
 */
public class EnvironmentService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public EnvironmentService() {
        // constructor
    }

    public void validateEnvironmentVar() {
        String env = System.getenv("SPRINGBOOT_PROFILE");
        if (env == null || env.trim().length() < 1 || env.equalsIgnoreCase("null")) {
            throw new RuntimeException("***** SPRINGBOOT_PROFILE var not set *****");
        } else {
            logger.info("***** running api, environment: " + env + " *****");
        }

    }

}
