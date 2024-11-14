package hro.gob.gt.ehr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class corsConfigurer implements WebMvcConfigurer {

   @Override
    public void addCorsMappings(CorsRegistry registry) {

     registry.addMapping("/**");

      /* {
           registry.addMapping("/**")
                   .allowedOrigins(
                           "http://localhost:5173"   // Add more IPs and ports as needed
                   )
                   .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify allowed HTTP methods
                   .allowedHeaders("*");  // Allow all headers (you can specify specific headers if needed)
      }*/
   }
}
