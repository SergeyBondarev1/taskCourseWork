import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        String arr[] = new String[]{"aa", "bb", "cc", "aa", "bb", "cc"};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == null) continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])){

                    arr[j] = null;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        String result = " ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                result += arr[i]+ " ";
            }
        }
        System.out.println(result);

    }
}