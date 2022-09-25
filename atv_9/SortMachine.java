package atv_9;

public class SortMachine {
    private int[] items;

    public SortMachine(int[] items) {
        this.items = items;
    }

    public int[] runSort() {
        QuickSort sort = new QuickSort();
        sort.ordenarVetorDeInteiros(items);
        return items;
  }
}
