
public class ListAddItem {
	public static void main(String[] args) {

        List<String> langs = new ArrayList<>();

        langs.add("Java");
        langs.add("Python");
        langs.add(1, "C#");
        langs.add(0, "Ruby");

        for (String lang : langs) {

            System.out.printf("%s ", lang);
        }

        System.out.println();
    }
}
