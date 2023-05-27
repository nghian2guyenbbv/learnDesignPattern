package milktea.ingredient;

import milktea.Imilktea;

public class SugerBlack extends AbstractMilkteaDecorator {
  public SugerBlack(Imilktea imilktea) {
    super(imilktea);
  }

  @Override
  public String milkTeaIngre() {
    return "SugerBlack + " + super.milkTeaIngre();
  }

  @Override
  public double countPrice() {
    return 2d + super.countPrice();
  }
}
