package kk.springframework.msscbrewery;

//import org.apache.activemq.artemis.core.com.example.demo.config.Configuration;
//import org.apache.activemq.artemis.core.com.example.demo.config.impl.ConfigurationImpl;
//import org.apache.activemq.artemis.core.server.ActiveMQServer;
//import org.apache.activemq.artemis.core.server.ActiveMQServers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsscBreweryApplication {

//	ActiveMQServer server= ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//	.setPersistenceEnabled(false)
//	.setJournalDirectory("target/data/journal")
//	.setSecurityEnabled(false)
//	.addAcceptorConfiguration("invm","vm://0"));

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);
	}

}
