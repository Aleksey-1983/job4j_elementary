package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int in = 0; in < data.length; in++) {
            if (data[in] == el) {
                rst = in;
                break;
            }
        }
        return rst;
    }
}
