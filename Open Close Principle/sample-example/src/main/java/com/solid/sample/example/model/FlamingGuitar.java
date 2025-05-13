package com.solid.sample.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
@NoArgsConstructor
public class FlamingGuitar extends Guitar {

  private String flamingColor;
  private String flamingType;


  public void induceFlame(int level) {
    switch (level) {
      case 2:
        flamingType = "medium";
        break;
      case 3:
        flamingType = "high";
        break;
      default:
        flamingType = "low";

    }

    System.out.println("Inducing flame of level " + level + " on " + flamingColor + " guitar");
  }


}
