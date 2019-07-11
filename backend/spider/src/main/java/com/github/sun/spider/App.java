package com.github.sun.spider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.github.sun"})
public class App {
  public static void main(String[] args) {
    new SpringApplicationBuilder(App.class).run(args);
  }
}
