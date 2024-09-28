package weekthree;

public class WeekThreeRandom {
    public static void main(String[] args) {
        int userAge = 0;
        int itemDiscount = 0;
        if(userAge == 62) {
            itemDiscount = 15;
        } else {
            itemDiscount = 0;
        }
        int numPlayers = 0;
        int numPeople = 0;
        int teamSize = 0;
        int groupSize = 0;
        if(numPlayers != 11) {
            teamSize = 11;
        } else {
            teamSize = numPlayers;
        }
        teamSize = 2 * teamSize;

        if(numPeople == 10 ){
            groupSize = 2;
        } else {
            groupSize = 3 * groupSize;
            numPeople = numPeople - 1;
        }
    }
}
