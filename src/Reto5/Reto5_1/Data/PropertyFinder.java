package Reto5.Reto5_1.Data;

import java.util.ArrayList;

/**
 * This class is responsible for finding nearby properties based on user location.
 */
public class  PropertyFinder {

    /**
     * Adds a property to the list of nearby properties if its coordinates are close to the user's location.
     */
    public void addProperty(ArrayList<Property> nearbyProperties, Property property, reto5.reto5_1.data.User user){
        // Validation to check if property coordinates are near user location
        double userLocation = user.location;
        double propertyCoordinates = property.coordinates;
        nearbyProperties.add(new Property(property.address, property.coordinates, property.status));
    }

    /**
     * Displays the list of nearby properties.
     */
    public void showPropertiesList(ArrayList<Property> nearbyProperties){
        System.out.println(nearbyProperties);
    }
}
