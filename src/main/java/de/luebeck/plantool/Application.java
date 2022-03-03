package de.luebeck.plantool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories(basePackages="de.th_luebeck.stundenplantool.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="de.th_luebeck.stundenplantool.entities")
public class Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        viewControllerRegistry.addViewController("/overview").setViewName("overview");
		/*
		viewControllerRegistry.addViewController("/create").setViewName("create");
		viewControllerRegistry.addViewController("/courses").setViewName("courses");
		viewControllerRegistry.addViewController("/modules").setViewName("modules");
		viewControllerRegistry.addViewController("/selection").setViewName("selection");
		*/
    }


}