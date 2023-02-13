import java.util.Arrays;

/**
 *
 * @author adinashby
 */
public class CopyExample {

    private int[] data;

    public CopyExample(int[] values) {
        // Shallow Copy
        //this.data = values;

        // Deep Copy
        data = new int[values.length];
        
        for(int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}