import java.util.ArrayList;

public class pairSum2 {
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;// breaking point


        //find breaking point
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int left = pivot + 1;// smallest element
        int right = pivot;// largest element

        //main logic(binary) search
        while (left != right) {
            if (list.get(left) + list.get(right) == target) {
                return true;
            } else if (list.get(left) + list.get(right) < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(PairSum2(list, 18));
    }
}
