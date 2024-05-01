package mon.pfe;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import mon.pfe.controlle.Ressource_Humaine_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MonPfeApplication.class)
@WebAppConfiguration
public class MonPfeApplicationTests {

	  @Autowired
	    private Ressource_Humaine_Controller ressourceHumaineController;

	    @Test
	    public void contextLoads() {
	       
	    }
}