package timus;
import java.io.*;
public class Task_2100 {
    public static void main(String[] args) {
        String inputFileName = "src/timus/input_2100.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAngLilly = 2;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFriends = 0;
            int numberOfPairs = 0;
            while ((readLine = bufferedReader.readLine()) != null) {
                if (numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfPairs++;
                }
            }
            int result;
            int guests = (marshalAngLilly + numberOfFriends + numberOfPairs);
            if (guests == 13){
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }
            System.out.println(result);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
