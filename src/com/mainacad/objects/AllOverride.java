package com.mainacad.objects;

public class AllOverride extends EqualsAndHashOverride {

  public AllOverride(char first, char second, char third, char fourth, char fifth) {
    super(first, second, third, fourth, fifth);
  }

  public AllOverride() {
  }

  @Override
  public String toString() {
    return String.valueOf(getFirst()) + getSecond() + getThird() + getFourth() + getFifth();
  }
}
