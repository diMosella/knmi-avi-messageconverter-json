package nl.knmi.geoweb.converters.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

  @Autowired
  public JsonService() {
  }

  public String message() {
    return "Greetings from JsonService!";
  }
}