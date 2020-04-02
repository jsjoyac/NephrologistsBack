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

import com.nephrologists.demo.controller.NephrologistBaseClinicController;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes =  {NephrologistBaseClinicController.class})
public class NephrologistBaseClinicControllerTest {
	
	/** The mock mvc. */
	private MockMvc mockMvc;
	
	@Mock
	private NephrologistBaseClinicController nephrologistBaseClinicController;
	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(nephrologistBaseClinicController).build();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void verifyNephrologistBaseClinicList() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get(
				"/nephrologistbaseclinic/consultar/nefrologosBaseClinica")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(print());
	}
	

}
