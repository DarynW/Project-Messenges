import java.util.Objects;

public class DatabaseReadFileTest {
    public static void main(String[] args) throws Exception {
        //set database to databaseTestFile.csv file that was previously made
        Database db = new Database("src/Test Cases/databaseTestFile.csv");
        //reads the file
        String expected = "fischer\nandy\ndaryn\nyash\n:)";
        String output = db.readFile();
        //removing UTF BOM marker
        output = output.replace("\uFEFF", "");
//        if (Objects.equals(output, expected)) {
        if (output.equals(expected)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

    }
}
