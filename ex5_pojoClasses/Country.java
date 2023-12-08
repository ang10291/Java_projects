public class Country {
    private String name;
    private int populations;
    private int squareKM;
    private String nameCapital;
    private boolean entryToSea;

    public Country(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulations() {
        return populations;
    }

    public void setPopulations(int populations) {
        this.populations = populations;
    }

    public int getSquareKM() {
        return squareKM;
    }

    public void setSquareKM(int squareKM) {
        this.squareKM = squareKM;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isEntryToSea() {
        return entryToSea;
    }

    public void setEntryToSea(boolean entryToSea) {
        this.entryToSea = entryToSea;
    }
}
