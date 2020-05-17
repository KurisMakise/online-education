package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 5/17/2020 23:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

}
