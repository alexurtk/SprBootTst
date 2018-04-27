package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        return application.sources(Application.class);
    }

    public void lol(){
        System.out.println("test lol");
    }

    public void lol2(){
        System.out.println("test lol2");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("test");
    }

    public void test(){
        System.out.println("test2");
    }
}
