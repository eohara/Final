package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest{
	
	@Test
	public void RetirementPMT() {
		
		Retirement rtm = new Retirement();
		
		/*double r =  0.07;
		int n = 40;
		double y = rtm.TotalAmountSaved();
		double f = 0;
		boolean t = false;
		
		//double ExpectedSaved = 1454485.55;
		
		*/
		//Need values for PV too
		
		rtm.setiYearsToWork(40);
		rtm.setdAnnualReturnRetired(0.02);
		rtm.setdAnnualReturnWorking(0.07);
		rtm.setdRequiredIncome(10000);
		rtm.setdMonthlySSI(2642);
	    rtm.setiYearsRetired(20);	
		
		System.out.println(Math.abs(rtm.AmountToSave()));

		
		assertEquals(rtm.AmountToSave(),554.13,0.01);
	}
	
	@Test
	public void RetirementPV() {
		
		Retirement rtm = new Retirement();
		
		rtm.setdAnnualReturnRetired(0.02);
		rtm.setdRequiredIncome(10000);
		rtm.setdMonthlySSI(2642);
		rtm.setiYearsRetired(20);
		
		System.out.println(Math.abs(rtm.TotalAmountSaved()));
		
		assertEquals(rtm.TotalAmountSaved(),1454485.55,0.03);
	}
	
	
	
	
	
}