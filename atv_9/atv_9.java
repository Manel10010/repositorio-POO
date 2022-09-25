package atv_9;

public class atv_9 {
    public static void main(String[] args) {
        int[] items = {24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5,
         12, 53, 42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67,
         92, 22, 33, 27, 19};

        SortMachine machine = new SortMachine(items);
        for(int num : machine.runSort()) {
            System.out.print(num + ", ");
          }
      
        }
    }
    
