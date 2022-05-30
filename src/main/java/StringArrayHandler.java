import java.util.*;

public class StringArrayHandler {

    private final String[] inputArray;

    public StringArrayHandler(String[] inputArray) {
        this.inputArray = inputArray;
    }

    public void printAnagramsIndexes() {
        Map<String,String> map = new TreeMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            char [] stringContent = inputArray[i].toCharArray();
            Arrays.sort(stringContent);
            String s = new String(stringContent);
            if (!map.containsKey(s)) {
                map.put(s, "" + i);
            } else {
                map.put(s, map.get(s) + ", " + i);
            }
        }
        for (Map.Entry<String,String> pair: map.entrySet()) {
            if (pair.getValue().contains(",")) {
                System.out.println("" + pair.getKey() + " = " + pair.getValue());
            }
        }
    }
}
