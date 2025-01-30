package com.tkr.tnsif;

public class TaxCalculation {
	
	public void calTax(Person p) {
		if(p.getIncome() <=10000) {
			p.setTax(0);
		}
		else if(p.getIncome()>10000 && p.getIncome() < 100000) {
			p.setTax(100);
			
			}
			else {
				p.setTax(200);
		}
	}
}
	


