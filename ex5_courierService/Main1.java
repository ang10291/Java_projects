package Encapsulation;

public class Main1 {
    public static void main(String[] args) {
        Dimensions dimensionsOrig = new Dimensions(30,200, 40);
        Cargo cargoList = new Cargo(dimensionsOrig, 85,"ул.Минская 12, к.2, кв: 57",
                false, "8H345", true);

        System.out.println("Информация о грузе:\nЗАВКА 1\n"
                + "Габариты: " + cargoList.getDimensions() + "\n"
                + "Вес: " + cargoList.getWeight() + " кг.\n"
                + "Адрес доставки: " + cargoList.getAddressDelivery() + "\n"
                + "Можно ли переворачивать? " + cargoList.getTurn() + "\n"
                + "Регистрационный номер: " + cargoList.getRegNumber() + "\n"
                + "Груз хрупкий? " + cargoList.getFragile() + "\n"
                + "Объем груза: " + dimensionsOrig.volume() + " куб.см."
        );

        Dimensions dimensions = dimensionsOrig.setHeight(12);
        Cargo cargo = cargoList.setAddressDelivery("г. С-Петербург, ул. Мойка 34").setWeight(34)
                .setDimensions(new Dimensions(1, 3, 5));

        System.out.println("\nИзменились некоторые данные о грузе:\nЗАВКА 1\n"
                + "Габариты: высота = " + dimensions.getHeight() + "\n"
                + "Адрес доставки: " + cargo.getAddressDelivery() + "\n"
                + "Вес: " + cargo.getWeight() + "\n"
                + "Объем груза: " + dimensions.volume() + " см3"

                + "\n\nдин-дон..\n" +
                "Новые габариты груза: " + cargo.getDimensions() + "\n\n"
                + "Объем груза 1 заявки: " + cargo.getDimensions().volume() + " см3"
        );
    }
}
