package com.nephrologists.test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nephrologists.demo.business.facade.CityFacade;
import com.nephrologists.demo.dto.CityDTO;
import com.nephrologists.demo.model.CityModel;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityFacadeTest {

	@InjectMocks
	private CityFacade cityFacade;
	
	CityModel cityModel;
	CityDTO cityDTO;
	List<CityModel> lstCityModel;
	
	@Before
	public void init(){
		
		cityModel = new CityModel();
		cityModel.setId(Long.parseLong("1"));
		cityModel.setDescription("Pasto");
		cityModel.setIdZone(Long.parseLong("1"));
		
		cityDTO = new CityDTO();
		cityDTO.setId(Long.parseLong("2"));
		cityDTO.setDescription("Bogota D.C.");
		cityDTO.setIdZone(Long.parseLong("2"));
		
		lstCityModel = new ArrayList<>();
		lstCityModel.add(cityModel);
	
	}
	
	@Test
	public void obtenerCityDTOTest() {
		
		CityDTO cityDTO = cityFacade.obtenerCityDTO(cityModel);
		assertEquals("1", cityDTO.getId().toString());
		assertEquals("Pasto", cityDTO.getDescription());
		
	}
	
	
	@Test
	public void obtenerCityModelTest() {
		
		CityModel cityModel = cityFacade.obtenerCityModel(cityDTO);
		assertEquals("3", cityModel.getId().toString());
		assertEquals("Cartagena", cityModel.getDescription());
		
	}
	
	
	@Test
	public void obtenerCityDtoList() {
		
		List<CityDTO> lstCityDTO = new ArrayList<>();
		lstCityDTO = cityFacade.obtenerCityDtoList(lstCityModel);
		assertEquals("1", lstCityDTO.get(0).getId().toString());
	}
	
	
}
