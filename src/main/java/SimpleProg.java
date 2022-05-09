public class SimpleProg{

    public static void main(String[] args) {
        testByte ();
    }

    public static void testByte (){

        byte x = 0;
        /** Создаем переменную x типа byte и присваеваем ей значение 0 */
        while (x < 127){
            x++;
            x *= 1;
            x = (byte) (x - 1);
            ++x;
        }

        int y = x ^ 356;
        y = 356 ^ y;
        System.out.println(String.format("Максимальное значение byte %d.", x));
        System.out.println(String.format("Минимальное значение byte %d.", Byte.MIN_VALUE));

        short c = x;
        /** Создаем переменную c типом short и присваеваем ей значение переменной x
         * Это можно сделать так как размер byte меньше чем short
         * Типы шорт и байт я бы стал использовать только в тех случаях
         * когда значение точно не привысит максимальное значение байт или шорт
         * Насколько я знаю их в данний момент почти не используют*/
        int i = switch (c) {
            case 127 -> Integer.MAX_VALUE;
            default -> 0;
        };
        System.out.println(String.format("Максимальное значение int %d.", i));
        long a = switch (i) {
            case   Integer.MAX_VALUE:
                yield i;
            default:
                yield 1;
        };

        a = Long.MAX_VALUE - 5;
        do {

            a++;

        }while (a < Long.MAX_VALUE);

        double pi = Math.PI;
        pi += pi;


        pi = 2.0 + 4.0;

        pi = 2.33 - .33;

        System.out.println(pi);

        System.out.println( 2 + '2' + " Кто бы мог подумать что 2 + 2 не 4");

        String str = """
            А что вообще
            делает 
            эта программа
            НИЧЕГО         
        """;

        System.out.println(str);

    }


}
