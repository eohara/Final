package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private Label lblSaveEachMonth;
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnWorking;
	
	@FXML
	private Label lblTotalAmountSaved;
	
	
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	@FXML
	private TextField txtAnnualReturnRetired;
	
	

	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		
		System.out.println("Clear pressed");
		
		lblSaveEachMonth.setText("$");
		txtAnnualReturnWorking.setText("");
		txtYearsRetired.setText("");
		
		lblTotalAmountSaved.setText("$");
		
		txtYearsToWork.setText("");
		txtAnnualReturnRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		
	
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
		//Retirement rtm = new Retirement();
		
		//String sAmountToSave = Double.toString(rtm.AmountToSave());
		//lblSaveEachMonth.setText(Double.toString(rtm.AmountToSave()));
		
		//String sTotalAmountSaved = Double.toString(rtm.TotalAmountSaved());
		//lblTotalAmountSaved.setText( Double.toString(rtm.TotalAmountSaved()));
		
		Retirement rtm = new Retirement(Integer.parseInt(txtYearsToWork.getText()),Double.parseDouble(txtAnnualReturnWorking.getText()),Integer.parseInt(txtYearsRetired.getText()),Double.parseDouble(txtAnnualReturnRetired.getText()),Double.parseDouble(txtRequiredIncome.getText()),Double.parseDouble(txtMonthlySSI.getText()));

		lblSaveEachMonth.setText("$"+Double.toString(rtm.AmountToSave()));
		lblTotalAmountSaved.setText("$"+Double.toString(rtm.TotalAmountSaved()));
		
		
	}
	
}
