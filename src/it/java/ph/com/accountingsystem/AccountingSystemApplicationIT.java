package ph.com.accountingsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@TestPropertySource(locations = "classpath:application-it.properties")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountingSystemApplicationIT {

	@Test
	public void contextLoads() {
	}

}
