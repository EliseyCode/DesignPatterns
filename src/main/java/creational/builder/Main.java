package creational.builder;

public class Main {
    private static final String TEST_AUTHOR = "Robert Sedgewick";
    private static final String TEST_NAME = "Algorithms (4th Edition)";
    private static final int TEST_EDITION = 4;
    private static final int TEST_INDEX = 7;

    public static void main(String[] args) {
        BookInfoBuilder builder = new BookInfoBuilderImpl();

        BookInfo info = builder
                .setAuthor(TEST_AUTHOR)
                .setName(TEST_NAME)
                .setEdition(TEST_EDITION)
                .setIndex(TEST_INDEX)
                .build();

        System.out.println(info);
    }
}