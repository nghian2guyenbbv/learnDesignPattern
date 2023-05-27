package milktea.ingredient;

import milktea.Imilktea;

public class Milktea implements Imilktea {
  @Override
  public double countPrice() {
    return 5d;
  }

  @Override
  public String milkTeaIngre() {
    return "milk tea";
  }
}
