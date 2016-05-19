package com.boot;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.boot.repository.ShipwreckRepository;
import com.boot.model.Shipwreck;

 import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	private ShipwreckRepository ShipwreckRepository;
	
	@Test
	public void testFindAll(){
		List<Shipwreck> wrecks = ShipwreckRepository.findAll();
		MatcherAssert.assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
	}
	
}
