package ie.atu;


public class Main {
    public static void main(String[] args) {
        // Create an array or list of menu objects
        MenuItem[] menuItems = new MenuItem[]{
                // add menu lists
                new Burger("classic Burger ",8,"Beef patty , lettuce , cheese"),
                new Pizza ("Peperoni pizza",10,"peperoni, cheese , pineapple  "),
                new Salad ("Caesar salad",15.99,"lettuce, croutons, Caesar dressing "),
                new Brownie("Chocolate Brownie",9,"chocolate sauce, ice creams")
        };

        for (MenuItem menuItem : menuItems){
            // print out the name , Descrption and price foreach item
            System.out.println("names: "+ menuItem.getName());
            System.out.println("Description: "+menuItem.getDescription());
            System.out.println("price: " + menuItem.getPrice());
            System.out.println();
        }

        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            // totalCost of all menuitem prices in an order
            totalCost += menuItem.getPrice();

        }

        System.out.println("Total Cost € " + totalCost);

    }
}