package ipan.tcworkshop.warapp.config;

import ipan.tcworkshop.warapp.MainController;
import org.springframework.context.annotation.*;

@Configuration
@Import({
        WebConfig.class,
})
public class SpringConfig {
    @Bean
    public MainController mainController() {
        return new MainController();
    }
}
