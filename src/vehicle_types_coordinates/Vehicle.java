package vehicle_types_coordinates;

public class Vehicle {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int enginePower; //Значение поля должно быть больше 0
    private Integer numberOfWheels; //Поле не может быть null, Значение поля должно быть больше 0
    private Long capacity; //Поле может быть null, Значение поля должно быть больше 0
    private VehicleType type; //Поле может быть null
}

