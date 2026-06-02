package arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
        assertEquals(1, 0);
    }

    @Test
    void testConstructeurParDefaut() {
        Voiture voiture = new Voiture();
        assertNull(voiture.getMarque());
        assertEquals(0, voiture.getPrix());
        assertEquals(0, voiture.getId());
    }

    @Test
    void testConstructeurAvecParametres() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voiture.getMarque());
        assertEquals(20000, voiture.getPrix());
    }

    @Test
    void testSettersEtGetters() {
        Voiture voiture = new Voiture();

        voiture.setMarque("BMW");
        voiture.setPrix(35000);
        voiture.setId(1);

        assertEquals("BMW", voiture.getMarque());
        assertEquals(35000, voiture.getPrix());
        assertEquals(1, voiture.getId());
    }

    @Test
    void testToString() {
        Voiture voiture = new Voiture("Audi", 30000);
        voiture.setId(5);

        String resultat = voiture.toString();

        assertTrue(resultat.contains("Audi"));
        assertTrue(resultat.contains("30000"));
        assertTrue(resultat.contains("5"));
    }

}