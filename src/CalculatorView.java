import java.awt.event.ActionListener;
import javax.swing.*;
public final class CalculatorView extends JFrame{
	private final JTextField firstNumber = new JTextField(10);
	private final JLabel additionLabel = new JLabel(“+”);
	private final JTextField secondNumber = new JTextField(10);
	private final JButton calculateButton = new JButton(“Calculate”);
	private final JTextField calcSolution = new JTextField(10);
    private Object calcPanel;
	CalculatorView(){
		JPanel CalcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        public int getCalcSolution(){
               return Integer.parseInt(secondNumber.getText());
        }
        public int getCalcSolution(){
            return Integer.parseInt(calcSolution.getText());
        }
        public void setCalcSolution(intSolution){
            calcSolution.setText(Integer.toString(solution));
        }
        void addCalculationListerner(ActionListener listenForCalcButton){
            calculateButton.addActionListener(listenerForCalcButton);
        }
        //if calculation button is pressed without entering a number
        void displayErrorMessage(String errorMessage){
                JOptionPane.showMessageDialog(this, errorMessage);
        }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(Object calcPanel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}