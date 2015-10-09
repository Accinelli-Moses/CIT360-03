import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends Jframe{
	private JTextField firstNumber = new JTextField(10);
	private Jlabel additionLavel = new Jlabel(“+”);
	private JTextField secondNumber = new JTextField(10);
	private Jbutton calculateButton = new Jbutton(“Caculate”);
	private JTextField calcSolution = new JTextField(10);
	CalculatorView(){
		JPanel CalcPanel = new JPanel();
		this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		this.add(calcPanel);
	}
	public int getFirstNumber(){
		return Integer.parseInt(firstNumber.getText());
}
