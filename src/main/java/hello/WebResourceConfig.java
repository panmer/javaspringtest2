package hello;

import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
// import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// @EnableWebMvc
@Configuration
public class WebResourceConfig implements WebMvcConfigurer {
    // private static final String[] CLASSPATH_RESOURCE_LOCATIONS =
    // {
    //     "classpath:/static/"
    // };

    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addRedirectViewController("/", "/index.html");
    // }

    // public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //     // All resources go to where they should go
    //     registry.addResourceHandler("./*.html", "/**/*.css", "/**/*.html", "/**/*.js", "/**/*.js.map", "/**/*.css.map",
    //                                 "/**/*.jsx", "/**/*.png", "/**/*.jpg", "/**/*.ttf", "/**/*.woff", "/**/*.woff2", "/**/*.ico")
    //             .setCachePeriod(0)
    //             .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    // }
}