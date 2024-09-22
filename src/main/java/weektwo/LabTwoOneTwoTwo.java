package weektwo;

public class LabTwoOneTwoTwo {

    public static class CarRecord {
        private int yearMade;
        private int vehicleIdNum;

        // FIXME: Write constructor, initialize year to 0, vehicle ID num to -1.
        /* Your solution goes here  */

        public CarRecord(){
            this.yearMade = 0;
            this.vehicleIdNum = -1;
        }

        public void setYearMade(int originalYear) {
            yearMade = originalYear;
        }

        public void setVehicleIdNum(int vehIdNum) {
            vehicleIdNum = vehIdNum;
        }

        public void print() {
            System.out.println("Year: " + yearMade + ", VIN: " + vehicleIdNum);
        }
    }

    public class CallCarRecord {
        public static void main(String [] args) {
            CarRecord familyCar = new CarRecord();

            familyCar.print();
            familyCar.setYearMade(2009);
            familyCar.setVehicleIdNum(444555666);
            familyCar.print();

        }
    }

}
