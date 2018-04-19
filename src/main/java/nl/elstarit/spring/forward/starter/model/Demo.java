package nl.elstarit.spring.forward.starter.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Demo {

  private int id;
  private String name;
  private LocalDateTime created;
}
