package com.ensa.decorator;

public class Inondation extends DecorateurAbstrait{

	public Inondation(Assurance assurance) {
		super(assurance);
		}
		@Override
		public double cout() {
		return assurance.cout()+200;
		}
}
