package br.com.zeroth.zthconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZthConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZthConfigServerApplication.class, args);
	}

}
