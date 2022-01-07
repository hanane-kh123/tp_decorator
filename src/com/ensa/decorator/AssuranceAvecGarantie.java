package com.ensa.decorator;

public class AssuranceAvecGarantie extends Assurance{

	public AssuranceAvecGarantie(){
		description = "AssuranceAvecGarantie";
		}
		@Override
		public double cout() {
		return 500;
		}

}
