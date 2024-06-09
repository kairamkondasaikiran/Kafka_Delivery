package kafka.delivery.com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.delivery.com.service.KafkaService;

@RestController
public class DeliveryController {

	@Autowired
  private KafkaService service;
	
	@PostMapping("/produceMessage")
	public ResponseEntity<?> produceMessage(){
		
		this.service.updateLocation(" ("+Math.round(Math.random()*100)+")"+ " ("+Math.round(Math.random()*100)+")");
		return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
	}
}
