package com.everis.kafka.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.kafka.Sender;

@Controller
public class TestApi {

	@Autowired
	private Sender sender;
	
	@GetMapping(value="test.do/{mensaje}")
	public void test(@PathVariable("mensaje") String mensaje) {
		
		sender.send(mensaje);
		
		
	}
}
