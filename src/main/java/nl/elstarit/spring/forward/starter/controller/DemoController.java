package nl.elstarit.spring.forward.starter.controller;

import lombok.extern.slf4j.Slf4j;
import nl.elstarit.spring.forward.starter.model.Demo;
import nl.elstarit.spring.forward.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@Controller
@RequestMapping("/api")
public class DemoController {

  @Autowired
  private DemoService demoService;

  @RequestMapping(method = GET, value="/demos", produces = "application/json")
  public ResponseEntity<?> getDemos(@RequestParam(value = "amount") int amount){
    List<Demo> todos = demoService.generateListOfDemoObjects(amount);
    return new ResponseEntity<>(todos, HttpStatus.OK);
  }

}
