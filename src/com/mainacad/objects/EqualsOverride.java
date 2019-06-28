package com.mainacad.objects;

public class EqualsOverride extends Default {

  public EqualsOverride(char first, char second, char third, char fourth, char fifth) {
    super(first, second, third, fourth, fifth);
  }

  public EqualsOverride() {
  }

  @Override
  public boolean equals(Object obj) {

    EqualsOverride equalsOverride = (EqualsOverride) obj;
    return this.getFirst() == equalsOverride.getFirst() &&
        this.getSecond() == equalsOverride.getSecond() &&
        this.getThird() == equalsOverride.getThird() &&
        this.getFourth() == equalsOverride.getFourth() &&
        this.getFifth() == equalsOverride.getFifth();
  }
}
