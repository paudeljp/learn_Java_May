import java.util.*;
public class stringBuilder_02_Set {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        sb.setCharAt(0, 'S');
        System.out.print(sb); // The output is Sony
    }
}
