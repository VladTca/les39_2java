public record Person(String firstName, String lastName,String branch) {
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return lastName().equals(person.lastName()) && firstName().equals(person.firstName());
    }

    @Override
    public int hashCode() {
        int result = firstName().hashCode();
        result = 31 * result + lastName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s%n", firstName, lastName, branch);
    }
}
