//place binary numbers into string of size n where should be no consecutive one

public class placeBinary {
    public static void binary(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // logic

        if (lastPlace == 0) {// agr last place 0 h to kisi ko bhi place kr skta hu
            binary(n - 1, 0, str + "0");
            binary(n - 1, 1, str + "1");
        } else {// agr last place pr 0 nhi h, it means 1 h to last place pr 0 hi aaygea
            binary(n - 1, 0, str + "0");
        }

        // or --- it can be written as

        // if last place is 0 or 1 then we have to place 0
        // binary(n-1, 0, str+"0");
        // and if last place is 0 then we can also place 1
        // if(lastPlace==0){
        // binary(n-1, 1, str+"1");
        // }

    }

    public static void main(String[] args) {
        binary(3, 0, "");
    }
}
