package com.mainacad.objects;

public class EqualsAndHashOverride extends EqualsOverride {

  public EqualsAndHashOverride(char first, char second, char third, char fourth, char fifth) {
    super(first, second, third, fourth, fifth);
  }

  public EqualsAndHashOverride() {
  }

  @Override
  public boolean equals(Object obj) {
    if (hashCode() != obj.hashCode()) {
      return false;
    }
    EqualsAndHashOverride equalsOverride = (EqualsAndHashOverride) obj;
    return this.getFirst() == equalsOverride.getFirst() &&
        this.getSecond() == equalsOverride.getSecond() &&
        this.getThird() == equalsOverride.getThird() &&
        this.getFourth() == equalsOverride.getFourth() &&
        this.getFifth() == equalsOverride.getFifth();
  }

  @Override
  public int hashCode() {
    int result = 0;
    result += getFirst();
    result += getSecond();
    result += getThird();
    result += getFourth();
    result += getFifth();
    return result;
  }
}
