package Enum_06;

public enum NameOperations {
    ADDITION("Сложение"),
    SUBTRACTION("Вычитание"),
    MULTIPLICATION("Произведение");

    private final String title;

    NameOperations(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Computing: " +
                "title=" + title;
    }
}
