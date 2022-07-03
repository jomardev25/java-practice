package com.jbignacio.kafka;

import java.util.Properties;
import java.util.Scanner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		runProducer();
	}

	static void runProducer() throws InterruptedException {

		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer"   , "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer" , "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("kafka.topic"      , "kafka-tutorial");

		KafkaProducer kafkaProducer = new KafkaProducer(properties);
		int i=0;

		System.out.println("Kafka Producer in Java for topic (sends every 3 sec)" + properties.getProperty("kafka.topic"));

		try {
			while (true) {
				i++;
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter your message: ");

				ProducerRecord producerRecord = new ProducerRecord("kafka-tutorial","key-" + i, scanner.nextLine());

				Thread.sleep(3000);
				kafkaProducer.send(producerRecord);
			}
		} finally {
			kafkaProducer.close();
		}

	}

}
