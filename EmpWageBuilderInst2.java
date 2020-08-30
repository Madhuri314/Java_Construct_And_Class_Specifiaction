public class EmpWageBuilderInst2 {
        private int empRate;
        private int numofWorkingDays;
        private int maxHrsInMonth;

        public EmpWageBuilderInst2(final int empRate,final int numofWorkingDays,final int maxHrsInMonth) {
                this.empRate=empRate;
                this.numofWorkingDays=numofWorkingDays;
                this.maxHrsInMonth=maxHrsInMonth;
        }
         public static void main(String[] args ) {
                final EmpWageBuilderInst2 ewbi=new EmpWageBuilderInst2(20,20,100);
                ewbi.calDailyEmpWage();
        }

        /**
        *calculated daily employee wages
        */
        public void calDailyEmpWage() {
                 int totalWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<maxHrsInMonth && totalWorkingDays<numofWorkingDays) {

                        totalWorkingDays++;
                        final int empHrs=getEmpHrs();
                        final int empWage=empHrs*empRate;
                        totalEmpHrs+=empHrs;
                        totalWage+=empWage;
                        System.out.println("Day: "+totalWorkingDays+" wages: "+empWage);
                }

                System.out.println("Total Emp Wage: "+totalWage);

        }

        /**
        *Get employee hrs
        */
        public int getEmpHrs() {
                final int isFullTime=1;
                final int isPartTime=2;
                int empHrs = 0;

                //get random value
                final double randomValue = Math.floor(Math.random()*10)%3;

                switch((int)randomValue) {

                        case isFullTime:
                                empHrs = 8;
                                System.out.println("Emp is present for full time.");
                                break;
                        case isPartTime:
                                empHrs = 4;
                                System.out.println("Emp is present for part time.");
                                break;
                        default:
                                System.out.println("Emp is absent");
                                break;
                }
                return empHrs;
        }
}
