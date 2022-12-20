import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class main {


    public static float division(int a, int b){//исключение деления на 0
        try {
            return a/b;
        }catch (Exception e){
            System.out.println("Призошло исключение деление на 0");
        }
        return 0;
    }
    public static void arrayNew(int[] arr){//выход за пределы массива
        try {
            if (arr.length > 2) throw new Exception("массив должен быть меньше 3");
            for (int i = 0; i < 3; i++){
                arr[i] = i;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readFromFile(String name) {//не существует файл
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (Exception e){
            System.out.println("Файл не найден");
        }
    }

    public static void arraySub(int [] arr1, int [] arr2) {
        int[] arr = new int[arr1.length];
        try {
            if (arr1.length != arr2.length) throw new Exception("Массивы не равны, операция недоступна");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr1[i] - arr2[i];
                System.out.print(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

//        float result = division(10,0);//деление на 0
//        System.out.println(result);
//
//        int [] arr = new int [3];
//        arrayNew(arr); //за пределы массива

 //       readFromFile("pom1.xml"); //нет файла

          int [] arr1 = {5, 6, 4};
          int [] arr2 = {5, 6, 4, 4};
          arraySub(arr1, arr2);

    }

}
