public class NewTask {

        public static void main(String[] args) {
            String[] arr1={"a","foo","bar","foo","bla"};
            String s="a";
            System.out.println(count_appearance(arr1,s));

        }
        public static int count_appearance(String[] arr, String t) {



            int count = 0;
            for (String each : arr) {
                if (each.equalsIgnoreCase(t)) {
                    count++;
                }

            }
            return count;
        }


    }

