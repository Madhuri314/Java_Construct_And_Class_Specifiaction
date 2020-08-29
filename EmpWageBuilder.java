/**
*       Employee wage computation using Instance methods in it
*/
public class EmpWageBuilder {
        //CONSTANTS
        public final int isFullTime = 1;
        public final int isPartTime = 2;

        private final int EMP_RATE_PER_HR;
        private final int NUM_OF_WORKING_DAYS;
        private final int MAX_HRS_PER_MONTH;
        private int totalEmpWage;

        public EmpWageBuilder(int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH){
                this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
                this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
                this.MAX_HRS_PER_MONTH = MAX_HRS_PER_MONTH;
        }

        public void totalEmpWage() {
                //VARIABLES
                int empHrs = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;

                //COMPUTATION
                while (totalEmpHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                        switch (empCheck) {
                                case isFullTime:
                                        empHrs = 8;
                                        break;
                                case isPartTime:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }

                        totalEmpHrs += empHrs;
                        System.out.println("Days: " + totalWorkingDays + " Emp Hours: " + empHrs);
                }

                totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        }

        /**
        * @Override
        */
        public String toString(){
                return "Total employee wage is "+totalEmpWage;
        }

        public static void main(String args[]) {
                EmpWageBuilder empWageBuilder1 = new EmpWageBuilder(20, 20, 100);
                empWageBuilder1.totalEmpWage();
                System.out.println(empWageBuilder1);

                //EmpWageBuilder empWageBuilder2 = new EmpWageBuilder(25, 5, 15);
                //empWageBuilder2.totalEmpWage();
                //System.out.println(empWageBuilder2);
        }
}
