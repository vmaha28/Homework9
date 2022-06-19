package ExtraMile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = randomNumberList();

        System.out.println(listOfLists);

        System.out.println(min(max(listOfLists)));
    }

    public static List<List<Integer>> randomNumberList() {
        Random random = new Random();
        int ran = random.nextInt(50);
        List<List<Integer>> list = new ArrayList<>();
        List <Integer> sublist = new ArrayList<>();

        for (int counter = 0; counter < random.nextInt(5) + 1; counter++) {
            for (int index = 0; index < random.nextInt(9) + 1; index++) {
                sublist.add(index, ran);
                ran = random.nextInt(50);
            }
            list.add(counter, sublist);
            sublist = new ArrayList<>();
        }
        return list;
    }

    public static List<Integer> max(List<List<Integer>> list) {
        int max = 0;
        List<Integer> listOfMax = new ArrayList<>();

        for (int counter = 0; counter < list.size(); counter++) {
            for (int index = 0; index < list.get(counter).size(); index++) {
                if (list.get(counter).get(index) > max) {
                    max = list.get(counter).get(index);
                }
            }
            listOfMax.add(max);
            max = 0;
        }

        return listOfMax;
    }

    public static Integer min(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int index = 0; index < list.size(); index++) {
            if (min > list.get(index)) {
                min = list.get(index);
            }
        }
        return min;
    }
}
