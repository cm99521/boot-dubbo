package boot.dubbo.simple.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import boot.dubbo.simple.client.service.RestServiceUsing;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
public class RestTest {
	
	@Autowired
	RestServiceUsing restServiceUsing;
	
	@Test
	public void test() {
		restServiceUsing.test();
	}
}
