package com.nephrologists.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nephrologists.demo.controller.CityController;
import com.nephrologists.demo.controller.ClinicController;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes =  {CityController.class})
public class ClinicControllerTest {
	
	/** The mock mvc. */
	private MockMvc mockMvc;
	
	@Mock
	private ClinicController clinicController;
	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(clinicController).build();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void verifyClinicList() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/clinic/consultar/clinicas")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(print());
	}
	

}
