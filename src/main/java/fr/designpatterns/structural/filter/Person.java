package fr.designpatterns.structural.filter;

public class Person {
  private String name;
  private String gender;
  private String maritalStatus;

  public Person(String name, String gender, String maritalStatus) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (name != null ? !name.equals(person.name) : person.name != null) return false;
    if (gender != null ? !gender.equals(person.gender) : person.gender != null) return false;
    return maritalStatus != null ? maritalStatus.equals(person.maritalStatus) : person.maritalStatus == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (gender != null ? gender.hashCode() : 0);
    result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", maritalStatus='" + maritalStatus + '\'' +
            '}';
  }
}
