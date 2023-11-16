package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// @EnableWebMvc
@Configuration
public class WebResourceConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/index", "/index.html");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // All resources go to where they should go
        registry.addResourceHandler("/*.html")
                .setCachePeriod(0)
                .addResourceLocations("classpath:/client/build/");
    }
}