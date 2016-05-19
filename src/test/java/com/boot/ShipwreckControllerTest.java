package com.boot;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;



public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController ShipwreckController;
	
	@Mock
	private ShipwreckRepository Repository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet(){
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		Mockito.when(Repository.findOne(1L)).thenReturn(sw);
		
		Shipwreck wreck = ShipwreckController.get(1L);
		
		Mockito.verify(Repository).findOne(1L);
		MatcherAssert.assertThat(wreck.getId(), Matchers.is(1L));
	}
	
}
