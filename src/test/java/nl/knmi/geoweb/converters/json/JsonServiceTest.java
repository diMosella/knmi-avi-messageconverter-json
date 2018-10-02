package nl.knmi.geoweb.converters.json;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello")
public class JsonServiceTest {

  @Autowired
  private JsonService jsonService;

  @Test
  public void contextLoads() {
    assertThat(jsonService.message()).isNotNull();
  }

  @SpringBootApplication
  static class TestConfiguration {
  }
}