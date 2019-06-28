package com.mainacad;

import com.mainacad.objects.AllOverride;
import com.mainacad.objects.Default;
import com.mainacad.objects.EqualsAndHashOverride;
import com.mainacad.objects.EqualsOverride;

public class EntryPoint {

  public static void main(String[] args) {

    // ---------- .equals() and .hashCode() override practice with a bit of theory ------------

    // Objects in Java are accessed by the reference. That means that by default when comparing
    // two objects we compare the references of these objects.
    Default default1 = new Default('m', 'a', 'r', 'c', 'h');
    Default default2 = new Default('m', 'a', 'r', 'c', 'h');
    System.out.println("Not overridden .equals() -> compares references of the objects:");
    System.out.println(default1.equals(default2)); // false

    // Though the objects seem to be equal, their references are not, so code above returns false.
    // By default it will return true only when references are equal (pointing to the same object):
    default1 = default2;
    System.out.println("Comparing objects' references to one object -> .equals returns:");
    System.out.println(default1.equals(default2)); // true

    // The default ".equals()" method can be interpreted as "isExactlyThat" or "hasSameReference".

    // For some reason we may want to compare objects not by the reference, but by their content,
    // saying "if these objects' fields are equal then the objects are equal too". To do this we
    // just need to override .equals() method as done in EqualsOverride class.
    EqualsOverride equalsOverride1 = new EqualsOverride('m', 'a', 'r', 'c', 'h');
    EqualsOverride equalsOverride2 = new EqualsOverride('m', 'a', 'r', 'c', 'h');
    System.out.println("Overridden .equals() compares objects' content -> returns:");
    System.out.println(equalsOverride1.equals(equalsOverride2)); // true

    // NOTE that "==" operator for objects is always interpreted as default .equals() method. So:
    System.out.println("Using '==' operator -> returns:");
    System.out.println(equalsOverride1 == equalsOverride2); // false

    // Though it seems to work fine, but it's still not proper until hashCode() is overridden too.

    // The value returned by hashCode() is the object's hash code, which is the object's memory
    // address in hexadecimal. By definition, if two objects are equal, their hash code must
    // also be equal. If you override the equals() method, you change the way two objects are
    // equated and Object's implementation of hashCode() is no longer valid. Therefore,
    // if you override the equals() method, you must also override the hashCode() method as well.

    // So hashes of two equal objects should be equal too:

    // Here hashCode() is default. By definition it must return true, because these objects are
    // equal. But it doesnt and that is WRONG:
    System.out.println(".hashCode() is default -> returns: ");
    System.out.println(equalsOverride1.hashCode() == equalsOverride2.hashCode()); // false

    // These objects override both .equals() and .hashCode() methods:
    EqualsAndHashOverride equalsAndHashOverride1 = new EqualsAndHashOverride('m', 'a', 'r', 'c',
        'h');
    EqualsAndHashOverride equalsAndHashOverride2 = new EqualsAndHashOverride('m', 'a', 'r', 'c',
        'h');
    EqualsAndHashOverride equalsAndHashOverride3 = new EqualsAndHashOverride('c', 'h', 'a', 'r',
        'm');

    // Obviously first two are equal to each other and not to the third one.
    System.out.println("Equal objects are equal:");
    System.out.println(equalsAndHashOverride1.equals(equalsAndHashOverride2)); // true
    System.out.println("Unequal objects are equal:");
    System.out.println(equalsAndHashOverride2.equals(equalsAndHashOverride3)); // false
    System.out.println(equalsAndHashOverride1.equals(equalsAndHashOverride3)); // false

    // When take a look at hashes of three objects above we'll notice that they are equal:
    System.out.println("Comparing hashes of objects -> hashes are equal:");
    System.out.println(equalsAndHashOverride1.hashCode() == equalsAndHashOverride2.hashCode() &&
        equalsAndHashOverride2.hashCode() == equalsAndHashOverride3.hashCode()); // true

    // So hashes of unequal objects might be equal, but equal objects' hashes MUST be equal.
    // That does mean that:
    // 1. IF HASHES OF COMPARABLE OBJECTS ARE NOT EQUAL - THESE OBJECTS ARE NOT EQUAL TOO.
    // 2. IF HASHES ARE EQUAL - WE HAVE TO CONFIRM IT BY COMPARING OBJECTS FIELDS.

    // ----------               exploring .toString() method                       -----------

    // .toString() method is used for representation of an object in a form of a text string.
    // It is automatically triggered when writing to console via System.out.println(), and by default
    // it returns a string representing object's class and hexademical hash divided by '@' symbol.
    System.out.println("Default toString() on an object: ");
    System.out.println(equalsAndHashOverride1); // com.mainacad.objects.EqualsAndHashOverride@20b

    // When overriding toString() we set what that string will look like. So for example we can make
    // it return all chars from our AllOverride class objects, where toString() is overridden:
    AllOverride allOverride = new AllOverride('c', 'a', 'n', 'd', 'y');
    System.out
        .println("allOverride object gives You a " + allOverride + "! How generous it is!!! :3");
  }

}
