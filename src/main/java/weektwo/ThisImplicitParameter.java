package weektwo;

import java.util.Scanner;

public class ThisImplicitParameter {

    public static class CablePlan {
        private int numDays;

        // FIXME: Define setNumDays() method, using "this" implicit parameter.
        public void setNumDays(int numDays) {

            /* Your solution goes here  */
            this.numDays = numDays;
        }

        public int getNumDays() {
            return numDays;
        }
    }

    public class CallCablePlan {
        public static void main(String [] args) {
            Scanner scnr = new Scanner(System.in);
            CablePlan house1Plan = new CablePlan();
            int userNum;

            userNum = scnr.nextInt();
            house1Plan.setNumDays(userNum);
            System.out.println(house1Plan.getNumDays());
        }
    }

}
