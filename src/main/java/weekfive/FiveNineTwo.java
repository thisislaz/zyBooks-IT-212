package weekfive;

import java.util.ArrayList;

public class FiveNineTwo {
    public class BaseItem {
        protected String lastName;

        public void setLastName(String providedName) {
            lastName = providedName;
        }

        // FIXME: Define printItem() method
        /* Your solution goes here  */
        public void printItem() {
            System.out.print("Last name: " + lastName);
        }

    }

    public class DerivedItem extends BaseItem {
        private String firstName;

        public void setFirstName(String providedName) {
            firstName = providedName;
        }

        @Override
        public void printItem() {
            System.out.print("First and last name: ");
            System.out.println(firstName + " " + lastName);
        }
    }

    public void main(String[] args) {
        BaseItem baseItemPtr;
        DerivedItem derivedItemPtr;
        ArrayList<BaseItem> itemList = new ArrayList<BaseItem>();
        int i;

        baseItemPtr = new BaseItem();
        baseItemPtr.setLastName("Smith");

        derivedItemPtr = new DerivedItem();
        derivedItemPtr.setLastName("Jones");
        derivedItemPtr.setFirstName("Bill");

        itemList.add(baseItemPtr);
        itemList.add(derivedItemPtr);

        for (i = 0; i < itemList.size(); ++i) {
            itemList.get(i).printItem();
        }

    }
}
