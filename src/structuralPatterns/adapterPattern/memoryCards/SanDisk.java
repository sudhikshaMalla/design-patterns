package structuralPatterns.adapterPattern.memoryCards;

public class SanDisk implements MemoryCard{

    private String data;

    public SanDisk() {
        data = "";
    }

    @Override
    public void addDataToCard(String content) {
        data += content;
    }

    @Override
    public void deleteDataFromCard() {
        data = "";
    }

    @Override
    public void showDataInCard() {
        System.out.println("SanDisk :: " + data);
    }


}