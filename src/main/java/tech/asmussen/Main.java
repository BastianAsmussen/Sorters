package tech.asmussen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sorter sorter = new Sorter();

        int[] numbers = sorter.generateNumbers((args.length > 0) ? Integer.parseInt(args[0]) : 100);

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        final long START_TIME = System.currentTimeMillis();

        sorter.quickSort(numbers);

        final double END_TIME = (System.currentTimeMillis() - START_TIME) / 1_000D;
        final String[] TIME = String.valueOf(END_TIME).split("\\.");

        System.out.println("After:");
        System.out.println(Arrays.toString(numbers));

        System.out.printf("Time: %s second(s) and %s millisecond(s).%n", TIME[0], TIME[1]);
    }
}
