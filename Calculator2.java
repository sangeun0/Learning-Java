package week10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator2 extends JFrame implements ActionListener, KeyListener{
	final int MAX_INPUT_LENGTH = 20; 

	//각 모드별로 index를 부여
	final int INPUT_MODE = 0;
	final int RESULT_MODE = 1;
	final int ERROR_MODE = 2;
	int displayMode;

	boolean clearOnNextDigit;  

	double lastNumber;   //마지막에 기억될 수
	String lastOperator;  // 마지막에 누른 연산자를 기억

	private JLabel output;    //숫자가 표시될 공간
	private JButton buttons[];   
	private JPanel masterPanel, btnPanel, ctrPanel;

	
	public Calculator2(){


		masterPanel = new JPanel();

		output = new JLabel("0", JLabel.RIGHT); // 레이블의 초기 값은 0
		output.setBackground(Color.WHITE);
		output.setOpaque(true);

		buttons = new JButton[25];

		btnPanel = new JPanel();

		
		for (int i=0 ; i<=9 ; i++){
			buttons[i] = new JButton(String.valueOf(i));   
		}

		
		buttons[10] = new JButton("±");
		buttons[11] = new JButton(".");
		buttons[12] = new JButton("=");
		buttons[13] = new JButton("/");
		buttons[14] = new JButton("x");
		buttons[15] = new JButton("-");
		buttons[16] = new JButton("+");
		buttons[17] = new JButton("sqrt");
		buttons[18] = new JButton("1/x");
		buttons[19] = new JButton("%");


		buttons[20] = new JButton("Backspace");
		buttons[21] = new JButton("CE");
		buttons[22] = new JButton("C");
		buttons[23] = new JButton("");
		buttons[24] = new JButton("");


		
		
		

		btnPanel.setLayout(new GridLayout(4,5,3,3));

		for(int i=7; i<=9 ; i++){
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[13]); // /
		btnPanel.add(buttons[17]); // sqrt

		for(int i=4; i<=6 ; i++){
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[14]); // x
		btnPanel.add(buttons[18]); // 1/x

		for(int i=1; i<=3 ; i++){
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[15]); // -
		btnPanel.add(buttons[19]); // %

		btnPanel.add(buttons[0]); // 0
		btnPanel.add(buttons[10]); // ±
		btnPanel.add(buttons[11]); // .
		btnPanel.add(buttons[16]); // +
		btnPanel.add(buttons[12]); // =


		ctrPanel = new JPanel();
		ctrPanel.setLayout(new GridLayout(1,5,3,3));


		ctrPanel.add(buttons[20]);
		ctrPanel.add(buttons[21]);
		ctrPanel.add(buttons[22]);
		ctrPanel.add(buttons[23]);
		ctrPanel.add(buttons[24]);


	
		masterPanel.setLayout(new BorderLayout());
		masterPanel.add(ctrPanel, BorderLayout.NORTH);
		masterPanel.add(btnPanel, BorderLayout.SOUTH);


		getContentPane().add(output, BorderLayout.NORTH);
		getContentPane().add(masterPanel,BorderLayout.SOUTH);
		requestFocus();


		for(int i=0 ; i<buttons.length ; i++){
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(false); //맥디폴트 
			buttons[i].setBackground(Color.YELLOW);
			buttons[i].addActionListener(this);
			buttons[i].addKeyListener(this);
		}

		clearAll(); //모든 값을 초기화

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
				);  
	}



	@Override
	public void actionPerformed(ActionEvent e){

		double result = 0;

		for(int i=0 ; i<buttons.length ; i++){
			if(e.getSource()==buttons[i]){
				if(i<10){
					addToDisplay(i);
					break;
				}else{
					switch(i){
					case 10: // ±
						processSingChange();
						break;
					case 11: // .
						addPoint();
						break;
					case 12: // =
						processEquals();
						break;
					case 13: // /
						processOperator("/");
						break;
					case 14: // x
						processOperator("x");
						break;
					case 15: // -
						processOperator("-");
						break;
					case 16: // +
						processOperator("+");
						break;
					case 17: // sqrt
						if (displayMode != ERROR_MODE)
						{
							try
							{
								if (getDisplayString().indexOf("-") == 0)
									displayError("Invalid input for function!");
								result = Math.sqrt(getNumberInDisplay());
								displayResult(result);
							}
							catch(Exception ex)
							{
								displayError("Invalid input for function!");
								displayMode = ERROR_MODE;
							}
						}
						break;
					case 18: // 1/x
						if (displayMode != ERROR_MODE){
							try
							{
								if (getNumberInDisplay() == 0)
									displayError("영으로 나눌 수 없습니다.");

								result = 1 / getNumberInDisplay();
								displayResult(result);
							}

							catch(Exception ex) {
								displayError("영으로 나눌 수 없습니다.");
								displayMode = ERROR_MODE;
							}
						}
						break;
					case 19: // %
						if (displayMode != ERROR_MODE){
							try {
								result = getNumberInDisplay() / 100;
								displayResult(result);
							}

							catch(Exception ex) {
								displayError("Invalid input for function!");
								displayMode = ERROR_MODE;
							}
						}
						break;
					case 20: // backspace
						backspace();
						break;
					case 21: //CE
						setDisplayString("0");
						clearOnNextDigit = true;
						displayMode = INPUT_MODE;
						break;
					case 22: //C
						clearAll();
						break;       
					}
				} 
			}
		}
	}


	private void clearAll() {
		setDisplayString("0");
		lastOperator = "0";
		lastNumber = 0;
		displayMode = INPUT_MODE;
		clearOnNextDigit = true;
	}

	private void backspace(){
		if (displayMode != ERROR_MODE){
			setDisplayString(getDisplayString().substring(0,
					getDisplayString().length() - 1));

			if (getDisplayString().length() < 1)
				setDisplayString("0");
		}
	}
	private void processOperator(String string) {
		if (displayMode != ERROR_MODE){
			double numberInDisplay = getNumberInDisplay();
			if (!lastOperator.equals("0")){
				try {
					double result = processLastOperator();
					displayResult(result);
					lastNumber = result;
				}catch(Exception e){}

			}else{
				lastNumber = numberInDisplay;
			}

			clearOnNextDigit = true;
			lastOperator = string;
		}
	}

	private double processLastOperator() throws Exception{
		double result = 0;
		double numberInDisplay = getNumberInDisplay();
		if (lastOperator.equals("/")){
			if (numberInDisplay == 0)
				throw (new Exception());
			result = lastNumber / numberInDisplay;
		}

		if (lastOperator.equals("x")){
			result = lastNumber * numberInDisplay;
		}
		if (lastOperator.equals("-")){
			result = lastNumber - numberInDisplay;
		}
		if (lastOperator.equals("+")){
			result = lastNumber + numberInDisplay;
		}

		return result;
	}
	private void processEquals() {
		double result = 0;
		if (displayMode != ERROR_MODE){
			try{
				result = processLastOperator();
				displayResult(result);
			}catch (Exception e){
				displayError("영으로 나눌 수 없습니다.");
			}
			lastOperator = "0";
		}
	}
	private void addPoint() {
		displayMode = INPUT_MODE;
		if (clearOnNextDigit)
			setDisplayString("");
		String inputString = getDisplayString();


		if (inputString.indexOf(".") < 0)
			setDisplayString(new String(inputString + "."));
	}
	private void processSingChange() {
		if (displayMode == INPUT_MODE){
			String input = getDisplayString();
			if (input.length() > 0 && !input.equals("0")){
				if (input.indexOf("-") == 0)
					setDisplayString(input.substring(1));
				else
					setDisplayString("-" + input);
			}
		}else if (displayMode == RESULT_MODE){
			double numberInDisplay = getNumberInDisplay();

			if (numberInDisplay != 0)
				displayResult(-numberInDisplay);
		}
	}
	private void displayResult(double result) {
		setDisplayString(Double.toString(result));
		lastNumber = result;
		displayMode = RESULT_MODE;
		clearOnNextDigit = true;
	}
	private void displayError(String error) {
		setDisplayString(error);
		lastNumber = 0;
		displayMode = ERROR_MODE;
		clearOnNextDigit = true;
	}
	private double getNumberInDisplay() {
		String input = output.getText();
		return Double.parseDouble(input);
	}
	private void addToDisplay(int i) {
		if (clearOnNextDigit)
			setDisplayString("");

		String inputString = getDisplayString();

		if(inputString.indexOf("0") == 0){
			inputString = inputString.substring(1);
		}
		if(( !inputString.equals("0") || i>0 ) && inputString.length() < MAX_INPUT_LENGTH){
			setDisplayString(inputString + i);
		}

		displayMode = INPUT_MODE;
		clearOnNextDigit = false;
	}

	private void setDisplayString(String string) {
		output.setText(string);
	}

	private String getDisplayString() {
		return output.getText();
	}

	
	
	
	
	
	public static void main(String args[]){
		Calculator2 cal = new Calculator2();
		cal.setTitle("Calculator");
		cal.setSize(600,250);
		cal.pack();
		cal.setLocationRelativeTo(null);
		cal.setVisible(true);
		cal.setResizable(false);  
	}
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}



