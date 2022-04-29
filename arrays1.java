import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int [] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min, max;
        min = list[0];
        max = list[list.length - 1];

        int kucukEnyakin = list[1], buyukEnyakin = list[list.length - 2];

        System.out.println("En küçük sayı : " + min);
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayıdan bir büyüğü : " + kucukEnyakin);
        System.out.println("En büyük sayıdan bir küçüğü : " + buyukEnyakin);

    }
}
