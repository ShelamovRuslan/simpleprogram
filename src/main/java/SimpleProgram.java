import java.util.Locale;
import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {

        System.out.println(addDriver());

    }
    public static Driver addDriver(){
        String  firstName = console("Как к вам можно обращаться?");
        long    phoneNumber = Long.parseLong(console("Укажите номер по которому с вами можно будет связаться"));
        String[] dateOfBirth = console(firstName + ", введите дату вашего рождения").split("\\.");
        byte    dayOfBirth = Byte.parseByte(dateOfBirth[0]);
        short   monthOfBirth = Short.parseShort(dateOfBirth[1]);
        int     yearOfBirth = Integer.parseInt(dateOfBirth[2]);
        float   experience = Byte.parseByte(console(firstName + ", какой у вас опыт вождения?"));
        char    driverslicense = console("Какая у вас категория вождения?").charAt(0);
        double  salary = 0;
        salary += switch (driverslicense){
            case 'А', 'A' , 'Б', 'B' , 'С' , 'C' , 'Д' , 'D':
                System.out.println("Для трудоустройства необходима водительская категория \"E\".");
                yield 0;
            case 'E' , 'Е':
                yield 15000.0;
            default:
                throw new IllegalStateException("Вы указали категорию " + driverslicense + ", необходимо будет уточнить возможность трудоустройства.");
        };
        if (salary != 0 && experience >= 0) {
            salary = salary + switch ((int) experience) {
                case 0 -> 0;
                case 1, 2, 3 -> 3000.68;
                case 4, 5, 6, 7, 8, 9 -> 5000.43;
                default -> 10000.24d;
            };
        }
        boolean medicalСonditions;
        if (console("У вас нет медицинских противопоказаний?").toLowerCase().contains("нет")){
            medicalСonditions = false;
        } else {
            medicalСonditions = true;
            System.out.println("Предоставьте справку о состоянии здоровья.");
            salary = 0;
        }
        Driver driver = new Driver(dayOfBirth,
        monthOfBirth,
        yearOfBirth,
        phoneNumber,
        salary,
        experience,
        firstName,
        driverslicense,
        medicalСonditions);
        if (driver.salary() <= 0){
            System.out.println(driver.firstName() + ", свяжитесь с HR менеджером для выяснения деталей трудоустройства.");
        } else {
            System.out.println("Ожидайте, в ближайшее время с вами свяжутся по номеру " + driver.phoneNumber() + ", спасибо!");
        }
        return driver;
    }
    public static String console (String massage) {
        Scanner console = new Scanner(System.in);
        System.out.println(massage);
        return console.nextLine();
    }

}
