package com.ensa.decorator;

public class DommageEtCollision extends DecorateurAbstrait {

	public DommageEtCollision(Assurance assurance) {
		super(assurance);
		}
		@Override
		public double cout() {
		return assurance.cout()+300;
		}

}
