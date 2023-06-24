import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/2309
 */
public class Problem_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> dwarfs = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int height = Integer.parseInt(reader.readLine());
            dwarfs.add(height);
            sum += height;
        }
        dwarfs.sort(Comparator.naturalOrder());

        for (int i = 0; i < dwarfs.size(); i++) {
            for (int j = i + 1; j < dwarfs.size(); j++) {
                Integer dwarfA = dwarfs.get(i);
                Integer dwarfB = dwarfs.get(j);

                if ((sum - (dwarfA + dwarfB)) == 100) {
                    dwarfs.remove(dwarfA);
                    dwarfs.remove(dwarfB);

                    for (Integer dwarf : dwarfs) {
                        writer.write(dwarf + "\n");
                    }
                    writer.flush();

                    writer.close();
                    reader.close();
                    System.exit(0);
                }
            }
        }
    }
}
