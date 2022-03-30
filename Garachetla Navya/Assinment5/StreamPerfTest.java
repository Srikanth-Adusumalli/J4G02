
public class StreamPerfTest {
	int iterations = 100;
    List<Integer> list = Arrays.asList(1, 10, 3, 7, 5);


    public void stream() {

        for (int i = 0; i < iterations; i++) {
            Optional<Integer> result = list.stream()
                    .filter(x -> x > 5)
                    .findFirst();

            System.out.println(result.orElse(null));
        }
    }

    public void loop() {

        for (int i = 0; i < iterations; i++) {
            Integer result = null;
            for (Integer walk : list) {
                if (walk > 5) {
                    result = walk;
                    break;
                }
            }
            System.out.println(result);
        }
    }

}
