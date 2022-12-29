import java.util.ArrayList;

public class BasketStand {

    public static void main(String[] args) {
        ArrayList<Fruits> singleBowl = new ArrayList<>();
        ArrayList<ArrayList<Fruits>> fruitBasket = new ArrayList<>();
        singleBowl.add(new Fruits("Apple", 1,"ripe","Red"));
        singleBowl.add(new Fruits("Orange",1,"ripe" ,"Orange"));
        singleBowl.add(new Fruits("Strawberry", 1,"ripe","Red"));
        singleBowl.add(new Fruits("Banana", 1,"ripe","Yellow"));
        singleBowl.add(new Fruits("Mango", 1,"not ripe","green"));
        singleBowl.add(new Fruits("Grape", 1,"ripe", "Purple"));
//TODO:1.CREATE ONE MORE CLASS THAT BRIDEGES BETWEEN FRUITS AND BASKET STAND CLASS
        //TODO: add git.ignore file, readme file, root folder structure

       for (Fruits fruit : singleBowl) {
            boolean added = false;
            for (ArrayList<Fruits> layer : fruitBasket) {
                if (layer.get(0).getColor().equals(fruit.getColor())) {
                    layer.add(fruit);
                    added = true;


                    break;
                }
            }
            if (!added) {
                ArrayList<Fruits> newLayer = new ArrayList<>();
                newLayer.add(fruit);
                fruitBasket.add(newLayer);


            }

        }
        for (int i = 0; i < fruitBasket.size(); i++) {
    ArrayList<Fruits>      layer=  fruitBasket.get(i);
            System.out.println("Layer " + (i + 1) + ":");
            for (Fruits fruit : layer) {
                System.out.println("  - " + fruit.getName());
            }
        }
    }
}



