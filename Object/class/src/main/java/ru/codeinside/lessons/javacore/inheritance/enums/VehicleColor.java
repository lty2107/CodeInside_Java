package ru.codeinside.lessons.javacore.inheritance.enums;

/**
 * Перечисление описывает возможные цвета автомобилей.
 */
public enum VehicleColor {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black"),
    LightGreen("lightGreen"),
    WHITE("white"),
    UNDEFINED("undefined");

    private String color;

    VehicleColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    /**
     * Метод возвращает объект {@link VehicleColor} на основе переданного названия цвета.
     *
     * @param color {@link String} название цвета
     * @return {@link VehicleColor}
     */
    public static VehicleColor getColorByName(String color) {
        for (VehicleColor element: VehicleColor.values()) {
            if (element.color.equals(color)) {
                return element;
            }
        }
        return UNDEFINED;
    }
}
