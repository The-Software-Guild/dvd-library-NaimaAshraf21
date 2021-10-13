package mthree.library.controller;

import mthree.library.DVD;

import java.util.ArrayList;
import java.util.List;

public class DVDLibraryController {

  private List<DVD> dvds = new ArrayList<>();

  public boolean addDVD(DVD dvd) {
    boolean canAdd = !dvds.contains(dvd);
    if (canAdd) {
      dvds.add(dvd);
    }
    System.out.println("mthree.library.PetCentre: accepting " + dvd.getTitle() + ": " +
            (canAdd ? "success" : "fail"));
    return canAdd;
  }

  public boolean removeDVD(DVD dvd) {
    boolean removedOk = dvds.remove(dvd);
    System.out.println("mthree.library.PetCentre: returning " + dvd.getTitle() + ": " +
            (removedOk ? "success" : "fail"));
    return removedOk;
  }
}