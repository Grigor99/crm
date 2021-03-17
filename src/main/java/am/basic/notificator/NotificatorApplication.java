package am.basic.notificator;

import am.basic.notificator.crm.util.Md5Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class NotificatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificatorApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new Md5Encoder();
    }
}
