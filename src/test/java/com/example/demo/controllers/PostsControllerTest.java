package com.example.demo.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import com.example.demo.models.Post;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class PostsControllerTest {
    
    @Autowired
	private MockMvc mockMvc;

	@Autowired
	private PostsController controller;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

	@Test
	void shouldAddandViewPost() throws Exception {
		Post newObjectInstance = new Post("my blog post", "my content");
        final ObjectMapper mapper = new ObjectMapper();
		final String jsonContent = mapper.writeValueAsString(newObjectInstance);
		this.mockMvc.perform(post("/addPost")
			.content(jsonContent)
			.contentType(MediaType.APPLICATION_JSON))
			
			.andExpect(status().isCreated())
			.andExpect(content().json("{\"title\":\"my blog post\",\"content\":\"my content\"}"));
		this.mockMvc.perform(get("/viewPosts"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().json("[{\"title\":\"my blog post\",\"content\":\"my content\"}]"));
	}

 
}
