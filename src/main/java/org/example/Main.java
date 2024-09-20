package org.example;

import org.example.pojo.car.Car;
import org.example.pojo.car.ElectricCar;
import org.example.pojo.car.GasCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GasCar gasCar = context.getBean("BMW", GasCar.class);
        System.out.println(gasCar);
        System.out.println(gasCar.getEngine());
        ElectricCar electricCar = context.getBean("Tesla", ElectricCar.class);
        System.out.println(electricCar);
        System.out.println(electricCar.getEngine());


    }
}
// 2 Ваш абстрактный класс Car зависит от интерфейса Engine. Создайте несколько
// * реализаций интерфейса Engine (например, GasEngine и ElectricEngine). Аннотируйте их с
// * помощью @Component с названием бинов. Создайте наследников Car (ExrCar и ElectricCar),
// * пометьте их аннотацией @Component. При внедрении бина Engine с помощью @Autowired
// * укажите название подходящего двигателя с помощью @Qualifier, чтобы можно было
// * выбрать тип двигателя во время компиляции. Получите бины обоих видов автомобилей и
// * выведите тип двигателя в консоль.