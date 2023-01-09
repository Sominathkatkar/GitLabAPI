package com.sacumen;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sacumen.model.User;

@SpringBootTest
class GitLabRestApiApplicationTests {

	@Autowired
	RestTemplate restTemplate;
	@Test
	void contextLoads() {
	}

	
	

	@Test
	public void gitLabUserTest() throws URISyntaxException {
		final String baseUrl = "http://localhost:8080/GitLabApiController/users";
		URI uri = new URI(baseUrl);

		ResponseEntity<User> response = this.restTemplate.getForEntity(uri, User.class);
		User user = response.getBody();
		System.out.println(user);
		Assert.assertEquals(200, response.getStatusCodeValue());
	}
}
