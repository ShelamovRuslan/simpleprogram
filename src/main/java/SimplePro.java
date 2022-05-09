import java.util.Random;

public class SimplePro {

    public static void main(String[] args) {
        test ();
    }

    public static void test (){

        float temperature = (float) (Math.floor(Math.random() * (430 - 350)) + 350) / 10;
        /** Создаем переменную температура и присваеваем ей значение в диапазоне от 35 до 42.9 */
        if (temperature >= 35 && temperature <= 37){
            System.out.println("Ваша температура " + temperature + ", обратитесь в поликлинику к семейному врачу.");
        } else if (temperature >= 37 && temperature < 39){
            System.out.println("Ваша температура " + temperature + ", обратитесь в поликлинику по телефону для вызова врача на дом.");
        } else {
            System.out.println("Ваша температура " + temperature + ", срочно обратитесь по телефону вызова экстренной медицинской помощи.");}
        /** Выводим сообщение на экран в зависимости от температуры. */


        final double salary = 14245.33;
        short workTime = 168;
        /** Зарплата за 168 рабочих часов  */
        double salaryPerHours = salary / workTime;
        System.out.println(salaryPerHours);
        /** Высчитываем зарплату в час  */

        int x = 1;
        for (char i = 'А'; i <= 'Я' ; i++, x++){
            if ( i == 'А' || i == 'Я') {
                System.out.println("Буква " + i + " в алфавите под номером " + x);
            }
        }
        /** Узнаем под каким номером А и Я. */

        int notFour = '2' + 2;
        System.out.println(notFour);
        /** Кто бы мог подумать что выйдет не 4. */

        String text = "java очень крутая";
        char[] array = text.toCharArray();
        for (char symbol: array){
            if (symbol == 'j'){
                text = "J";
                continue;
            }
            text += symbol;
        }
        System.out.println(text);
        /** Исправляем ошибку в предложении. */

        Random random = new Random ();
        int number = random.nextInt (999999);
        if (number % 2 == 0){
            System.out.println(number + " число четное");
        } else {
            System.out.println(number + " число не четное");
        }

        long ok = 1L;


    }


}
