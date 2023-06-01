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
