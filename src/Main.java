/**
 * Created by Dariya on 18.10.2015.
 * Напишите программу, печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
 * второй — с предпоследним и т.д.), и вновь печатает.
 */
public class Main {
    public static void main(String[] args) {
        int array[] = new int[7];
        int centre;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        if(array.length/2==0){
            centre=array.length/2;
        }else{
            centre=(array.length/2)-1;
        }
        System.out.println("\nCentre="+centre);
        for (int i = 0; i <=centre ; i++) {
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.println("New array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
