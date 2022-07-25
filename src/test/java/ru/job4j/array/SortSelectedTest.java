package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortArrayLength5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSortArrayLength3() {
        int[] data = new int[] {7, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 7};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSortArrayLength7() {
        int[] data = new int[] {9, 6, 8, 7, 5, 77, 999};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7, 8, 9, 77, 999};
        assertThat(result).isEqualTo(expected);
    }
}
