package com.syntax;

public class Main {

//Branching
//Scenario:
//create a basic structure of a solar system and deploy as soon as possible.

    public static void main(String[] args) {
	// write your code here
        SolarSystem factorX = new SolarSystem();
        factorX.sun="1";
        factorX.moon="2";
        factorX.planet="4";
        factorX.stars="1000";

        //adding features to our sun
        FeatureSun xFact = new FeatureSun();
        xFact.color="redish";
        xFact.radius="100000000m";
        xFact.heat = "100000";

        FeatureStars facx = new FeatureStars();
        facx.color = "green";
        facx.radius = "10000KM";
        facx.size = "999999";
        //adding features for planetone
        PlanetOne one = new PlanetOne();
        one.name = "planeOne";
    }
}

