import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Уникальный список")
class MainTest {

    @Nested
    @DisplayName("Тесты метода equals")
    class PersonEqualsAndHashCodeTests {

        @Test
        @DisplayName("Равные объекты должны быть равны")
        void testEqualPersons() {
            Person p1 = new Person("Ivan", "Ivanov", "Branch 1");
            Person p2 = new Person("Ivan", "Ivanov", "Branch 2");
            assertEquals(p1, p2, "Объекты с одинаковыми именем и фамилией должны быть равны");
        }

        @Test
        @DisplayName("Объекты с разными именами не должны быть равны")
        void testDifferentPersons() {
            Person p1 = new Person("Ivan", "Ivanov", "Branch 1");
            Person p2 = new Person("Petr", "Ivanov", "Branch 1");
            assertNotEquals(p1, p2, "Объекты с разными именами не должны быть равны");
        }

    }

    @Nested
    @DisplayName("Set с Person")
    class PersonSetTests {

        @Test
        @DisplayName("только уникальные Person по имени и фамилии")
        void testSetUniqueness() {
            Set<Person> persons = new HashSet<>();
            persons.add(new Person("Ivan", "Ivanov", "Branch 1"));
            persons.add(new Person("Petr", "Petrov", "Branch 1"));
            persons.add(new Person("Ivan", "Ivanov", "Branch 2"));

            assertEquals(2, persons.size(), "Set должен содержать только 2 уникальных объекта");
        }
    }
}
