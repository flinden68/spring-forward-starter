package nl.elstarit.spring.forward.starter.controller;

import nl.elstarit.spring.forward.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

  @Autowired
  private DemoService demoService;

  @RequestMapping(value = "/demo")
  public String getDemosPage(Model model){
    model.addAttribute("demos", demoService.generateListOfDemoObjects(10));
    return "demo";
  }
}
