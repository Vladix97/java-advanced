import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06_validUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");

        String input = in.readLine();
        while (!"END".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find())
                System.out.println("valid");
            else
                System.out.println("invalid");

            input = in.readLine();
        }
    }
}
