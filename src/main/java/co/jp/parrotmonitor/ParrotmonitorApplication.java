package co.jp.parrotmonitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ParrotmonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParrotmonitorApplication.class, args);
		new ParrotMonitor().monitor();
	}
}
