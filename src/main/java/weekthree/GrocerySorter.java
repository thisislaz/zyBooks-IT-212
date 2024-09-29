package weekthree;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER}

    public static void main (String[] args) {
        GroceryItem userItem;

        /* Your code will be tested with GR_APPLES and other values for userItem */
        userItem = GroceryItem.GR_APPLES;

        /* Your solution goes here  */
        if (userItem == GroceryItem.GR_APPLES || userItem == GroceryItem.GR_BANANAS) {
            System.out.println("Fruit");
        } else  {
            System.out.println("Drink");
        }
    }
}
