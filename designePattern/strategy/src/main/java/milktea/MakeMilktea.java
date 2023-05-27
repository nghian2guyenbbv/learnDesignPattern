package milktea;

import milktea.ingredient.Bubble;
import milktea.ingredient.Milktea;
import milktea.ingredient.SugerBlack;

public class MakeMilktea {
  public static void main(String[] args) {
    Imilktea myMilktea = new Bubble(new SugerBlack(new Milktea()));
    System.out.println("you total bill is: " +myMilktea.countPrice());
    System.out.println("ingredients are: "+myMilktea.milkTeaIngre());
  }
}
