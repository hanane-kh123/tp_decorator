package com.ensa.decorator;

public class BrisDeGlace extends DecorateurAbstrait {

	public BrisDeGlace(Assurance assurance) {
		super(assurance);
		}
		@Override
		public double cout() {
		return assurance.cout()+200;
		}
}
