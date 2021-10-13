package mthree.library;

import mthree.library.controller.DVDLibraryController;

import java.time.LocalDate;

public class DVDLibrary {

        private DVDLibraryController dvdLibraryController = new DVDLibraryController();

        public static void main(String[] args) {
            DVDLibrary dvdLibrary = new DVDLibrary();

            dvdLibrary.printMenu();

            dvdLibrary.showDVDs();
            //dvdLibrary.useDVDService1();
            //dvdLibrary.useDVDService1();
            //dvdLibrary.useDVDService3();
        }

        public void printMenu(){
            System.out.println("Welcome to the DVD Library!");
        }

        public void showDVDs() {
            DVD dvd1 = new DVD("Playing in the Shadows", LocalDate.of(2011, 9, 4),
                    'G', "Sascha Ettinger-Epstein", "Ministry of Sound", "4 Stars");
            //DVD dvd2 = new DVD("Garfield", "Cat", 5, 'L', true);
            //DVD dvd3 = new DVD("Jaws", "goldfish", 2, 'S', false);

            System.out.println("\nDisplay DVDs");
            System.out.println(dvd1);
            //System.out.println(dvd2);
            //System.out.println(dvd3);
            dvd1.findDVD();
        }

        public void useDVDService1() {
            System.out.println("\nusePetService1");
            DVD dvd1 = new DVD("Playing in the Shadows", LocalDate.of(2011, 9, 4),
                    'G', "Sascha Ettinger-Epstein", "Ministry of Sound", "4 Stars");
            //DVD dvd2 = new DVD();
            //DVD dvd3 = new DVD();
            dvdLibraryController.addDVD(dvd1);
            //dvdLibraryController.addDVD(dvd2);
            //dvdLibraryController.addDVD(dvd3);
        }

        public void useDVDService3() {
            System.out.println("\nusePetService3");
            DVD dvd1 = new DVD("Playing in the Shadows", LocalDate.of(2011, 9, 4),
                    'G', "Sascha Ettinger-Epstein", "Ministry of Sound", "4 Stars");
            //DVD dvd2 = new DVD();
            //DVD dvd3 = new DVD();
            dvdLibraryController.removeDVD(dvd1);
            //dvdLibraryController.removeDVD(dvd2);
            //dvdLibraryController.removeDVD(dvd3);
        }
    }
