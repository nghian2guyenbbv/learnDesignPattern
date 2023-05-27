package milktea.ingredient;

import milktea.Imilktea;

public class Bubble extends AbstractMilkteaDecorator {
  public Bubble(Imilktea imilktea) {
    super(imilktea);
  }

  @Override
  public String milkTeaIngre() {
    return "Bubble + " + super.milkTeaIngre();
  }

  @Override
  public double countPrice() {
    return 1d + super.countPrice();
  }

}
