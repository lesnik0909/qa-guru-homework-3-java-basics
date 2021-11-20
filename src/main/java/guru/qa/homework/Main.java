package guru.qa.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Person ivan = new Person();
    ivan.setLastName("Ivanov");
    ivan.setFirstName("Ivan");
    ivan.setMiddleName("Ivanovich");
    ivan.setGender(Gender.MALE);
    ivan.setBirthDate(LocalDate.parse("1990-05-07"));

    Person anastasia = new Person();
    anastasia.setLastName("Ivanova");
    anastasia.setFirstName("Anastasia");
    anastasia.setMiddleName("Ivanovna");
    anastasia.setGender(Gender.FEMALE);
    anastasia.setBirthDate(LocalDate.parse("1993-04-27"));

    Person ekaterina = new Person();
    ekaterina.setLastName("Ivanova");
    ekaterina.setFirstName("Ekaterina");
    ekaterina.setMiddleName("Ivanovna");
    ekaterina.setGender(Gender.FEMALE);
    ekaterina.setBirthDate(LocalDate.parse("2008-04-27"));

    Person petr = new Person();
    petr.setLastName("Ivanova");
    petr.setFirstName("Petr");
    petr.setMiddleName("Ivanovich");
    petr.setGender(Gender.MALE);
    petr.setBirthDate(LocalDate.parse("2006-04-27"));

    List<Person> children = new ArrayList<>();
    children.add(ekaterina);
    children.add(petr);

    Family ivanovFamily = new Family();
    ivanovFamily.setFather(ivan);
    ivanovFamily.setMother(anastasia);
    ivanovFamily.setChild(children);
    ivanovFamily.getFather().printPersonInformation();
    ivanovFamily.getMother().printPersonInformation();
    for (int i = 0; i < ivanovFamily.getChild().size(); i++) {
      ivanovFamily.getChild().get(i).printPersonInformation();
    }
  }

}
