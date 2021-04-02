import java.util.Arrays;
import java.util.List;

/*
1 Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть
 новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
 Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
 Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
2 Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false
3 * Добавить на серверную сторону сетевого чата логирование событий (сервер запущен, произошла ошибка,
клиент подключился, клиент прислал сообщение/команду).

*/
public class ArrayHandler {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {0,2,5,6,3,5,6,8};
        int[] arr3 = {1,4,1,4,1,4};
        int[] arr4 = {2,3,5};
        System.out.println(Arrays.toString(checkArray(arr)));

    }


    public static int[] checkArray(int[] arr) {
        int x = 0;
        int [] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) continue;
                    result[k] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;
    }

    public  boolean findFourOrOneNumberInArray(int[] array){
        boolean hasFour = false;
        boolean hasOne = false;

        for (int value: array) {
            if(value ==4) {
                hasFour = true;
            } else if (value == 1) {
                hasOne = true;
            } else {
                return false;
            }

        }
        return hasFour && hasOne;

    }
}
