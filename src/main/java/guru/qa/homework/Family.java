package guru.qa.homework;

import java.util.List;

public class Family {

  private Person father;
  private Person mother;
  private List<Person> child;

  public Person getFather() {
    return father;
  }

  public Person getMother() {
    return mother;
  }

  public List<Person> getChild() {
    return child;
  }

  public void setFather(Person father) {
    this.father = father;
  }

  public void setMother(Person mother) {
    this.mother = mother;
  }

  public void setChild(List<Person> child) {
    this.child = child;
  }

}
