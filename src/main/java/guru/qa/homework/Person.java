package guru.qa.homework;

import java.time.LocalDate;
import java.time.Period;

public class Person {

  private String lastName;
  private String firstName;
  private String middleName;
  private Gender gender;
  private LocalDate birthDate;

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public Gender getGender() {
    return gender;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public int getAge() {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public void printPersonInformation() {
    System.out.println("\nInformation about the person");
    System.out.println("--------------------------");
    System.out.println("LatName: " + lastName);
    System.out.println("FirstName: " + firstName);
    System.out.println("MiddleName: " + middleName);
    System.out.println("Gender: " + gender);
    System.out.println("BirthDate: " + birthDate);
    System.out.println("Age: " + getAge());
  }

}
