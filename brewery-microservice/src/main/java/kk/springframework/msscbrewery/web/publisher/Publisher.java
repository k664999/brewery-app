package kk.springframework.msscbrewery.web.publisher;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import kk.springframework.msscbrewery.web.entities.BeerEntity;
import kk.springframework.msscbrewery.web.repositories.BeerRepository;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

@Component
public class Publisher {

    private static BeerRepository beerRepository;

    public Publisher(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public static void sendToQueue() throws NoSuchAlgorithmException, KeyManagementException, URISyntaxException, IOException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://guest:guest@localhost");
        factory.setConnectionTimeout(300000);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare("my-queue", true, false, false, null);

        int count = 0;

        System.out.println(beerRepository.findAll().toString());

        ArrayList<BeerEntity>beerEntities =  new ArrayList<>(beerRepository.findAll());

        while (count < beerEntities.size()) {


            String message = beerEntities.get(count).toString();

            channel.basicPublish("", "my-queue", null, message.getBytes());
            count++;
            System.out.println("Published message: " + message);

            Thread.sleep(1000);
        }
    }
}
