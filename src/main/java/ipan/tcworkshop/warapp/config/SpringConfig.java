package org.ipan.tzar.springDocs.config;

import org.springframework.context.annotation.*;

@Configuration
@Import({
        WebConfig.class,
})
public class SpringConfig {

}
