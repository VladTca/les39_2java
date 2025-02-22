import java.util.*;

public class Main {
    public static final String BRANCH1="Branch 1";
    public static final String BRANCH2="Branch 2";
    public static final String BRANCH3="Branch 3";

        public static void main(String[] args) {
            List<Person> team1 = Arrays.asList(
                    new Person("Ivan", "Ivanov", BRANCH1),
                    new Person("Petr", "Petrov", BRANCH1),
                    new Person("Sergey", "Sidorov", BRANCH1),
                    new Person("Dmitry", "Novikov", BRANCH1),
                    new Person("Mikhail", "Smirnov", BRANCH1)
            );

            List<Person> team2 = Arrays.asList(
                    new Person("Andrey", "Voronin", BRANCH2),
                    new Person("Vladimir", "Fedorov", BRANCH2),
                    new Person("Alexey", "Galkin", BRANCH2),
                    new Person("Dmitry", "Novikov", BRANCH2),
                    new Person("Yuri", "Orlov", BRANCH2)
            );

            List<Person> team3 = Arrays.asList(
                    new Person("Boris", "Petushkov", BRANCH3),
                    new Person("Victor", "Zaitsev", BRANCH3),
                    new Person("Roman", "Makarov", BRANCH3),
                    new Person("Dmitry", "Novikov", BRANCH3),
                    new Person("Andrey", "Voronin", BRANCH3)
            );

            Set<Person> personSetList = new HashSet<>(team1);
            personSetList.addAll(team2);
            personSetList.addAll(team3);
            List<Person> toPrint = new ArrayList<>(personSetList);
            toPrint.sort(Comparator.comparing(Person::lastName));
            System.out.println(toPrint);
        }

    }
