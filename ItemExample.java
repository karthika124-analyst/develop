import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemExample {

    public static void main(String[] args) {
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items(101, "Easy to wear", 1000, "Louie Philip"));
        itemsList.add(new Items(102, "soft", 340, "70mm"));
        itemsList.add(new Items(103, "cotton", 700, "Trends"));
        itemsList.add(new Items(104, "fit and comfortable", 789, "Taylor stich"));
        itemsList.add(new Items(105, "Fast to run", 870, "Toms Shoes"));
        itemsList.add(new Items(106, "Ankle fit", 1200, "Allen and solly"));
        itemsList.add(new Items(107, "excellence of quality", 1800, "Nike"));
        itemsList.add(new Items(108, "Affordabler", 670, "Active"));
        itemsList.add(new Items(109, "Top brand", 2400, "Ralphen"));
        itemsList.add(new Items(110, "Top notch", 780, "Khadims"));

		/*
		 * List<Items> itemsFilter = itemsList.stream() .filter(tbrand ->
		 * tbrand.getBrand().startsWith("T")) .collect(Collectors.toList());
		 * System.out.println(itemsFilter);
		 */
        
        List<Items> itemsFilter = itemsList.stream()
                .filter(tbrand -> tbrand.getBrand().startsWith("T"))
                .sorted(Comparator.comparing(Items::getPrice, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println(itemsFilter);
    }
    
    static class PriceComparator implements Comparator<Items> {
        @Override
        public int compare(Items item1, Items item2) {
            return Double.compare(item2.getPrice(), item1.getPrice());
        }
    }
       
}
