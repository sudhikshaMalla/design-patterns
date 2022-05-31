package structuralPatterns.adapterPattern;

import structuralPatterns.adapterPattern.laptops.Laptop;
import structuralPatterns.adapterPattern.memoryCards.MemoryCard;

public class CardReader implements Laptop {

    MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void writeData(String content) {
        memoryCard.addDataToCard(content);
    }

    @Override
    public void readData() {
        memoryCard.showDataInCard();
    }

    @Override
    public void deleteData() {
        memoryCard.deleteDataFromCard();
    }
}