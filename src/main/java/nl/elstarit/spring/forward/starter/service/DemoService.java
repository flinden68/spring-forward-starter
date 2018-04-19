package nl.elstarit.spring.forward.starter.service;

import nl.elstarit.spring.forward.starter.model.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DemoService {

  public List<Demo> generateListOfDemoObjects(int amount){
    List<Demo> demos = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
      Demo demo = new Demo();
      demo.setId(i+1);
      demo.setName("Demo " + i);
      demo.setCreated(LocalDateTime.now());

      demos.add(demo);
    }

    log.info("There are {} demo objects created", amount);

    return demos;
  }
}
