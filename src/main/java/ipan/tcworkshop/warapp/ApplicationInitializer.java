package ipan.tcworkshop.warapp;


import ipan.tcworkshop.warapp.config.SpringConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig.class);

        System.out.println("!!!!!!!!!!!!!!!!!!!!Initialiing");
        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("myDispatcherServlet", servlet);
        registration.setLoadOnStartup(1);

        // Fucking trailing asterisk shits all over the project. '/*' - bitch.
        registration.addMapping("/");
        registration.setInitParameter("enableLoggingRequestDetails", "true");
    }
}
