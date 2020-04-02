package com.nephrologists.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nephrologists.demo.controller.NephrologistController;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes =  {NephrologistController.class})
public class NephrologistControllerTest {
	
	/** The mock mvc. */
	private MockMvc mockMvc;
	
	@Mock
	private NephrologistController nephrologistController;
	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(nephrologistController).build();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void verifyNephrologistList() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/nephrologist/consultar/nefrologos")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(print());
	}
	

}
