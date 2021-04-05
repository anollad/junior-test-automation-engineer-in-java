package aircompany.test;

import epam.com.aircompany.Airport;
import epam.com.aircompany.planes.PassengerPlane;
import epam.com.aircompany.planes.ExperimentalPlane;
import epam.com.aircompany.models.ClassificationLevel;
import epam.com.aircompany.models.ExperimentalTypes;
import epam.com.aircompany.models.MilitaryType;
import org.junit.Test;
import org.junit.Assert;
import epam.com.aircompany.planes.MilitaryPlane;
import epam.com.aircompany.planes.Plane;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirportTest {
    private final static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );

    private final static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlane() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        boolean getTransportMilitaryPlane = false;
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getMilitaryType() == MilitaryType.TRANSPORT)) {
                getTransportMilitaryPlane = true;
                break;
            }
        }
        assertTrue(getTransportMilitaryPlane);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);
        PassengerPlane actualPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        assertEquals(planeWithMaxPassengerCapacity, actualPlaneWithMaxPassengersCapacity);
    }

    @Test
    public void testPlanesSortedByMaxLoadCapacity() {
        Airport airport = new Airport(planes).sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();

        boolean actualResult = true;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
                actualResult = false;
                break;
            }
        }
        assertTrue(actualResult);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if (!(militaryPlane.getMilitaryType() == MilitaryType.BOMBER)) {
                Assert.fail("Test failed!");
            }
        }
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        boolean actualResult = false;
        for(ExperimentalPlane experimentalPlane : experimentalPlanes){
            if(experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED){
                actualResult = true;
                break;
            }
        }
        Assert.assertFalse(actualResult);
    }
}
