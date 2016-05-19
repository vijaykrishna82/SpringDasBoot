package com.boot;

import  org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;



public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController SC;
	
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
		
		Shipwreck wreck = SC.get(1L);
		
		Mockito.verify(Repository).findOne(1L);
		Assert.assertEquals(1L, wreck.getId().longValue());
	}
	
}
