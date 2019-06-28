package com.mainacad.objects;

public class Default {

  private char first;
  private char second;
  private char third;
  private char fourth;
  private char fifth;

  public Default(char first, char second, char third, char fourth, char fifth) {
    this.first = first;
    this.second = second;
    this.third = third;
    this.fourth = fourth;
    this.fifth = fifth;
  }

  public Default() {
  }

  public void setFirst(char first) {
    this.first = first;
  }

  public void setSecond(char second) {
    this.second = second;
  }

  public void setThird(char third) {
    this.third = third;
  }

  public void setFourth(char fourth) {
    this.fourth = fourth;
  }

  public void setFifth(char fifth) {
    this.fifth = fifth;
  }

  public char getFirst() {
    return first;
  }

  public char getSecond() {
    return second;
  }

  public char getThird() {
    return third;
  }

  public char getFourth() {
    return fourth;
  }

  public char getFifth() {
    return fifth;
  }
}
