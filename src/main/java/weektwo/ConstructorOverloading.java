package weektwo;

public class ConstructorOverloading {

    public static class PhonePlan {
        private int freeMinutes;
        private int freeMessages;

        public PhonePlan() {
            freeMinutes  = 0;
            freeMessages = 0;
        }

        // FIXME: Create a second constructor with numMinutes and numMessages parameters.
        /* Your solution goes here  */
        public PhonePlan(int numMinutes, int numMessages) {
            this.freeMinutes = numMinutes;
            this.freeMessages = numMessages;
        }

        public void print() {
            System.out.println("Minutes: " + freeMinutes + ", Messages: " + freeMessages);
        }
    }

    public class CallPhonePlan {
        public static void main(String [] args) {
            PhonePlan user1Plan = new PhonePlan(); // Calls default constructor
            PhonePlan user2Plan = new PhonePlan(1000, 5000); // Calls newly-created constructor

            System.out.print("User1: ");
            user1Plan.print();

            System.out.print("User2: ");
            user2Plan.print();
        }
    }

}
