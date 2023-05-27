package milktea.ingredient;

import milktea.Imilktea;

public abstract class AbstractMilkteaDecorator implements Imilktea {
  protected Imilktea imilktea;

  public AbstractMilkteaDecorator(Imilktea imilktea){
    this.imilktea = imilktea;
  }

  @Override
  public double countPrice() {
    return this.imilktea.countPrice();
  }

  @Override
  public String milkTeaIngre() {
    return this.imilktea.milkTeaIngre();
  }
}
