package structuralPatterns.adapterPattern;

import structuralPatterns.adapterPattern.laptops.Laptop;
import structuralPatterns.adapterPattern.laptops.Lenovo;
import structuralPatterns.adapterPattern.memoryCards.MemoryCard;
import structuralPatterns.adapterPattern.memoryCards.SanDisk;

public class Main {

    public static void main(String[] args) {

        Laptop ideaPad = new Lenovo();

        ideaPad.readData();
        ideaPad.writeData("Hello ");
        ideaPad.readData();
        ideaPad.writeData("World!!");
        ideaPad.readData();

        System.out.println("***************************");

        MemoryCard sandisk = new SanDisk();

        Laptop thinkBook = new CardReader(sandisk);

        thinkBook.readData();
        thinkBook.writeData("Hello ");
        thinkBook.readData();
        thinkBook.writeData("World!!");
        thinkBook.readData();

    }
}