package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: CorsConfig
 * Package: config
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/8 0008 12:04
 * @Description: todo
 * @Version 1.0
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
//            @Override
////            public void addCorsMappings(CorsRegistry registry) {
////                registry.addMapping("/**")
////                        .allowedOrigins("*")
////                        .allowedMethods("GET", "POST","PUT","DELETE")
////                        .allowedHeaders("Content-Type", "Authorization")
////                        .allowCredentials(true);
////            }
        };
    }
}