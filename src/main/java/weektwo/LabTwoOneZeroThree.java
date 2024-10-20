package weektwo;

import java.util.Scanner;

public class LabTwoOneZeroThree {

    public static class DogLicense {
        private int licenseYear;
        private int licenseNum;

        public void setYear(int yearRegistered) {
            licenseYear = yearRegistered;
        }

        public int createLicenseNum(int customId) {
            licenseNum = 100000 * customId + licenseYear;
            return licenseNum;
        }

        public int getLicenseNum() {
            return licenseNum;
        }
    }

    public class CallDogLicense {
        public static void main(String [] args) {
            Scanner scnr = new Scanner(System.in);
            DogLicense dog1 = new DogLicense();
            int userYear;
            int userId;

            userYear = scnr.nextInt();
            userId = scnr.nextInt();

            dog1.setYear(userYear);
            dog1.createLicenseNum(userId);
            System.out.println("projecttwo.Dog license: " + dog1.getLicenseNum());

        }
    }

}
