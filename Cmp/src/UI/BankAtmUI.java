package UI;

import javax.swing.*;
import java.awt.*;

public class BankAtmUI {
    char uniChar = '₦';
    JFrame Frame = new JFrame("window");
    JLabel Pin = new JLabel(" Enter Your Pin:");
    JTextField PinField = new JTextField();
    JButton Login = new JButton("Enter");

    public void mainUI() {
        Frame.setSize(300, 300);
        Frame.setLayout(new GridLayout(10, 10));
        Frame.setVisible(true);
        Frame.setTitle("Shadow Bank Of Nigeria");

        Frame.add(Pin);
        Frame.add(PinField);
        Frame.add(Login);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Login.addActionListener(e -> {
            float userID = (Float.parseFloat(PinField.getText()));
            if (userID == 5555) {
                accountTypeUI();
            } else {
                JOptionPane.showMessageDialog(null,"Wrong User Pin, Please Try again");
            }
        });

    }

    JFrame Frame2 = new JFrame("window");

    JButton accountTypeSavings = new JButton("Savings Account");
    JButton accountTypeCurrent = new JButton("Current Account");

    public void accountTypeUI() {
        Frame2.setSize(300, 300);
        Frame2.setLayout(new GridLayout(2, 2));
        Frame2.setVisible(true);
        Frame2.setTitle("Select Account");

        Frame2.add(accountTypeSavings);
        Frame2.add(accountTypeCurrent);
        Frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        accountTypeSavings.addActionListener(e -> savingsUI());
       accountTypeCurrent.addActionListener(e -> currentUI());
    }
    JFrame FrameSavings = new JFrame("window");
    JLabel Balance = new JLabel("Available Balance: "+uniChar+"1,000,000");
    JButton depositSavings = new JButton("Deposit");
    JButton withdrawSavings = new JButton("Withdraw");

    public void savingsUI() {
        FrameSavings.setSize(300, 300);
        FrameSavings.setLayout(new GridLayout(3, 1));
        FrameSavings.setVisible(true);
        FrameSavings.setTitle("Shadow | Account: Savings");

        FrameSavings.add(Balance);
        FrameSavings.add(depositSavings);
        FrameSavings.add(withdrawSavings);
        FrameSavings.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        depositSavings.addActionListener(e -> depositSavingsUI());
        withdrawSavings.addActionListener(e -> withdrawSavingsUI());
    }
    JFrame FrameDepositSave = new JFrame("window");
    JButton DepositSave = new JButton("Deposit");
    JLabel AmountDepSave = new JLabel( " Enter Deposit Amount:");
    JTextField AmountFieldDepSave = new JTextField();

    public void depositSavingsUI(){
        FrameDepositSave.setSize(300, 300);
        FrameDepositSave.setLayout(new GridLayout(3, 1));
        FrameDepositSave.setVisible(true);
        FrameDepositSave.setTitle("Shadow | Account : Deposit");

        FrameDepositSave.add(AmountDepSave);
        FrameDepositSave.add(AmountFieldDepSave);
        FrameDepositSave.add(DepositSave);
        FrameDepositSave.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DepositSave.addActionListener(e -> {
            BankAtm assObj = new BankAtm();
            float answer = assObj.balance1(Float.parseFloat(AmountFieldDepSave.getText()));
            JOptionPane.showMessageDialog(null, "You new balance " +uniChar+answer);
        });
    }

    JFrame FrameWithdrawSave = new JFrame("window");
    JButton WithdrawSave = new JButton("Withdraw");
    JLabel AmountWithSave = new JLabel(" Enter Withdrawal Amount:");
    JTextField AmountFieldWithSave = new JTextField();

    public void withdrawSavingsUI() {
        FrameWithdrawSave.setSize(300, 300);
        FrameWithdrawSave.setLayout(new GridLayout(3, 1));
        FrameWithdrawSave.setVisible(true);
        FrameWithdrawSave.setTitle("Shadow | Account:Withdrawal");

        FrameWithdrawSave.add(AmountWithSave);
        FrameWithdrawSave.add(AmountFieldWithSave);
        FrameWithdrawSave.add(WithdrawSave);
        FrameWithdrawSave.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        WithdrawSave.addActionListener(e -> {
            BankAtm assObj = new BankAtm();
            float WithdrawSave = (Float.parseFloat(AmountFieldWithSave.getText()));
            float solution = assObj.withdrawalBalance(Float.parseFloat(AmountFieldWithSave.getText()));
            if (WithdrawSave > 30000) {
                JOptionPane.showMessageDialog(null, "You have Exceeded Your Withdrawal limit, Your limit is:" + uniChar + "10,000");
            } else {
                JOptionPane.showMessageDialog(null, "User Balance " + uniChar + solution + "\nThanks For Using Shadow Bank");
                savingsUI();
            }
        });
    }
    JFrame FrameCurrent = new JFrame("window");
    JLabel BalanceCurrent = new JLabel("Available Balance: "+uniChar+"1,000,000");
    JButton depositCurrent = new JButton("Deposit");
    JButton withdrawCurrent = new JButton("Withdraw");

    public void currentUI() {
        FrameCurrent.setSize(300, 300);
        FrameCurrent.setLayout(new GridLayout(3, 1));
        FrameCurrent.setVisible(true);
        FrameCurrent.setTitle("Shadow | Account: Current");

        FrameCurrent.add(BalanceCurrent);
        FrameCurrent.add(depositCurrent);
        FrameCurrent.add(withdrawCurrent);
        FrameCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        depositCurrent.addActionListener(e -> depositCurrentUI());
        withdrawCurrent.addActionListener(e -> withdrawCurrentUI());
    }
     JFrame FrameDepositCurrent = new JFrame("window");
    JLabel AmountDepCurrent = new JLabel(" Enter Deposit Amount:");
    JTextField AmountFieldDepCurrent = new JTextField();
    JButton DepositCurrent = new JButton("Deposit");

    public void depositCurrentUI(){
        FrameDepositCurrent.setSize(300, 300);
        FrameDepositCurrent.setLayout(new GridLayout(3, 1));
        FrameDepositCurrent.setVisible(true);
        FrameDepositCurrent.setTitle("Shadow | Account : Deposit");

        FrameDepositCurrent.add(AmountDepCurrent);
        FrameDepositCurrent.add(AmountFieldDepCurrent);
        FrameDepositCurrent.add(DepositCurrent);
        FrameDepositCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DepositCurrent.addActionListener(e -> {
            BankAtm assObj = new BankAtm();
            float answer1 = assObj.balance1 (Float.parseFloat(AmountFieldDepCurrent.getText()));
            JOptionPane.showMessageDialog(null, "You current balance is " + uniChar + answer1);
        });
    }
    JFrame FrameWithdrawCurrent = new JFrame("window");
    JLabel AmountWithCurrent = new JLabel(" Enter Withdrawal Amount:");
    JTextField AmountFieldWithCurrent = new JTextField();
    JButton WithdrawCurrent = new JButton("Withdraw");

    public void withdrawCurrentUI() {
        FrameWithdrawCurrent.setSize(300, 300);
        FrameWithdrawCurrent.setLayout(new GridLayout(3, 1));
        FrameWithdrawCurrent.setVisible(true);
        FrameWithdrawCurrent.setTitle("Shadow | Account : Withdrawal");

        FrameWithdrawCurrent.add(AmountWithCurrent);
        FrameWithdrawCurrent.add(AmountFieldWithCurrent);
        FrameWithdrawCurrent.add(WithdrawCurrent);
        FrameWithdrawCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        WithdrawCurrent.addActionListener(e -> {
            BankAtm assObj = new BankAtm();
            float solution1 = assObj.withdrawalBalance(Float.parseFloat(AmountFieldWithCurrent.getText()));
            JOptionPane.showMessageDialog(null, "Withdrawn Amount " +Float.parseFloat(AmountFieldWithCurrent.getText()));
            JOptionPane.showMessageDialog(null, "Available Balance " +uniChar+solution1);
            currentUI();
        });
    }
}

