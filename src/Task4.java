//Сегодня нас ждет несложная алгоритмическая задачка. Мы напишем функцию, которая на вход будет получать несортированный массив чисел первым параметром, и какой-то число вторым параметром.
//
//        Функция должна вернуть TRUE в случае, если в массиве есть два числа, которые в сумме датю то, которое мы передали вторым параметром.
//
//        Например
//
//        array: [1, 3, 2, 12, 11]
//        N: 5
//
//        result: TRUE // так как 3 и 2 в сумме дают 5


import javax.swing.text.StyledEditorKit;

public class Task4 {
    public static void main(String[] args){
        int[] array = new int[]{1, 3, 2, 12, 11};
        int N = 5;
        isSum(array, N);
        System.out.println(isSum(array, N));
    }

    static Boolean isSum(int[] arr, int N){
        Boolean C = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==N){

                    C = true;              }
            }
        }



        return C;
    }

}
