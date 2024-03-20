
import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class PersonTest {

        @Test
        public void testGetFullName() {
            // Créer une instance de Person
            Person person = new Person("John", "Doe", 30);

            // Appeler la méthode à tester
            String fullName = person.getFullName();

            // Vérifier le résultat
            Assertions.assertEquals("John Doe", fullName);
        }

        @Test
        public void isadultshouldreturntrueifageisgreaterthanorequal18() {
            // Créer des instances de Person avec différents âges
            Person adultPerson = new Person("Jane", "Smith", 25);


            // Vérifier si les personnes sont adultes ou non
            Assertions.assertTrue(adultPerson.isAdult());

        }
        @Test
        public void isadultshouldreturnfalseifageislessthan18() {
            // Créer des instances de Person avec différents âges

            Person minorPerson = new Person("Alice", "Johnson", 25);

            // Vérifier si les personnes sont adultes ou non

            Assertions.assertFalse(minorPerson.isAdult());
        }
    }


