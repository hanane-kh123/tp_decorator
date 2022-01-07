package com.ensa.decorator;

public class Incendie extends DecorateurAbstrait{

	public Incendie(Assurance assurance) {
		super(assurance);
		}
		@Override
		public double cout() {
		return assurance.cout()+100;
		}
}
