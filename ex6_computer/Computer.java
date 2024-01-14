package PracticalWork_06;

public class Computer {
    private Processor processor;
    private RAM ram;
    private DataStorage dataStorage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(Processor processor, RAM ram, DataStorage dataStorage, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.dataStorage = dataStorage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DataStorage getDataStorage() {
        return dataStorage;
    }

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return  "processor=" + processor +
                "\nram:" + ram +
                "\n" + dataStorage +
                "\n" + screen +
                "\nkeyboard:" + keyboard;
    }
}
