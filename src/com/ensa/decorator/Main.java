package com.ensa.decorator;

public class Main {

	public static void main(String[] args) {
		Assurance assurance = new AssuranceAvecGarantie();
        System.out.println(assurance.cout());
        assurance = new BrisDeGlace(assurance);
        System.out.println(assurance.cout());
        assurance = new DommageEtCollision(assurance);
        System.out.println(assurance.cout());
        assurance = new Incendie(assurance);
        System.out.println(assurance.cout());
        assurance = new Inondation(assurance);
        System.out.println(assurance.cout());
        assurance = new Vol(assurance);
        System.out.println(assurance.cout());
}

}
