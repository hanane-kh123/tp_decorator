package com.ensa.decorator;

public abstract class DecorateurAbstrait  extends Assurance {
	
	protected Assurance assurance;
	public DecorateurAbstrait(Assurance assurance) {
	super();
	this.assurance = assurance;
}
}

