package org.ipan.tzar.springDocs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver getViewResolver() {
        UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
        urlBasedViewResolver.setPrefix("/WEB-INF/jsp/");
        urlBasedViewResolver.setSuffix(".jsp");
        urlBasedViewResolver.setViewClass(JstlView.class);
        return urlBasedViewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/public", "classpath:/static/")
                .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS));
    }
}
