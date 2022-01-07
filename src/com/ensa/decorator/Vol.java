package com.ensa.decorator;

public class Vol extends DecorateurAbstrait{

	public Vol(Assurance assurance) {
		super(assurance);
		}
		@Override
		public double cout() {
		return assurance.cout()+170;
		}
}
