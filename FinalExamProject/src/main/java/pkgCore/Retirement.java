package pkgCore;

import org.apache.poi.ss.formula.functions.*;


public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement() 
	
	{
		
	}
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI) {
		super();
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}

	
	//TODO: Build the constructor, getters and setters for the attributes above.
	
	

	public int getiYearsToWork() {
		return iYearsToWork;
	}


	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	
	public int getiYearsRetired() {
		return iYearsRetired;
	}


	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}


	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}


	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}


	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}


	public double getdRequiredIncome() {
		return dRequiredIncome;
	}


	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}


	public double getdMonthlySSI() {
		return dMonthlySSI;
	}


	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}


	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		/*
		double r =  dAnnualReturnWorking / 12;
		int n = iYearsToWork * 12;
		double p = TotalAmountSaved;
		double f = 0;
		boolean t = false;
		*/
		
		//Retirement rtm = new Retirement();
		
		
		//double iTotalSaved = rtm.TotalAmountSaved();
		
		
		
		double PMT = (int)(FinanceLib.pmt(dAnnualReturnWorking / 12, iYearsToWork * 12, 0, TotalAmountSaved(), false) * 100);

		//System.out.println(PMT);
		
		return -1 * PMT / 100;
	}
	
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		
		//Retirement rtm = new Retirement();
		//double iPayment = rtm.AmountToSave();
		
		
		double PV = (int)(FinanceLib.pv(dAnnualReturnRetired / 12, iYearsRetired * 12 , dMonthlySSI - dRequiredIncome, 0, false) * 100);

		//System.out.println(PV);

		return (double) PV / 100;
	}
	
}
