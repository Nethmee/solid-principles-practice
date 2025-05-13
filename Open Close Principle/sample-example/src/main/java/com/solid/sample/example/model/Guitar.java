package com.solid.sample.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Guitar {

  private String make;
  private String model;
  private String color;
  private String volume;

}
