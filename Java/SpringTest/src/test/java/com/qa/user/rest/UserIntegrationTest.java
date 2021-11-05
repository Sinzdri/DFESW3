package com.qa.user.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.user.domain.User;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // boots the entire context
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:user-schema.sql","classpath:user-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD) //runs schema and data before each test, ensures we have data to test
@ActiveProfiles("test") // sets the active profile to 'test'
class UserIntegrationTest { 
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper; // exact same object mapper as spring uses to convert objects to and from 
	
	// method address body
	@Test
	void testCreate() throws Exception {
		User requestBody = new User("Bob", "Bobson", 32);
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);
	
		RequestBuilder request = post("/user/create").contentType(MediaType.APPLICATION_JSON).content(requestBodyAsJSON);
		
		User responseBody = requestBody;
		responseBody.setId(2);
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);
		
		ResultMatcher checkStatus = status().isCreated();
		ResultMatcher checkBody = content().json(responseBodyAsJSON);
		
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testGetAll() throws Exception {
		RequestBuilder request = get("/user/getAll");
		
		ResultMatcher checkStatus = status().isOk();
		User found = new User(1, "Bob", "Bobson", 32);
		List<User> users = List.of(found);
		String responseBody = this.mapper.writeValueAsString(users);
		ResultMatcher checkBody = content().json(responseBody);
		
		
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}
	
//	@Test
//	void testGet() throws Exception {
//		RequestBuilder request = get("/user/get/1");
//		
//		ResultMatcher checkStatus = status().isOk();
//		User found = new User(1, "Bob", "Bobson", 32);
//		String responseBody = this.mapper.writeValueAsString(found);
//		ResultMatcher checkBody = content().json(responseBody);
//		
//		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
//	}
	
	@Test		
	void testGet() throws Exception {		//same as previous testGet() but different format
		final String responseBody = this.mapper.writeValueAsString(new User(1, "Bob", "Bobson", 32));
		this.mvc.perform(get("/user/get/1")).andExpect(status().isOk()).andExpect(content().json(responseBody));
	}
	
	@Test
	void testReplace() throws Exception {
		User requestBody = new User("Fred", "Fredson", 24);
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);
	
		RequestBuilder request = put("/user/replace/1").contentType(MediaType.APPLICATION_JSON).content(requestBodyAsJSON);
		
		User responseBody = new User(1, "Fred", "Fredson", 24);
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);
		
		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().json(responseBodyAsJSON);
		
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void testDelete() throws Exception {
		RequestBuilder request = delete("/user/remove/1");
		
		ResultMatcher checkStatus = status().isNoContent();
		
		this.mvc.perform(request).andExpect(checkStatus);
	}
	
	@Test
	void testFailGet() throws Exception {
		this.mvc.perform(get("/user/get/99999")).andExpect(status().isNotFound());
	}
	
	@Test
	void testFailDelete() throws Exception {
		this.mvc.perform(delete("/user/remove/99999")).andExpect(status().isNotFound());
	}
}
	

