import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入利率：");
        double annualInterestRate = input.nextDouble();

        System.out.println("输入一个整数年份：");
        int numberOfYears = input.nextInt();

        System.out.println("输入贷款金额：");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("贷款的建立%s\n" + "月付款是%.2f\n",
                loan.getLoanDate().toString(),
                loan.getMonthlyPayment(), loan.getTotalPayment());
    }

}
