package creational.builder;

public class BookInfoBuilderImpl implements BookInfoBuilder {
    private final int defaultEdition = 0;
    private final int defaultIndex = 11;

    private String author;
    private String name;
    private int edition = defaultEdition;
    private int index = defaultIndex;

    @Override
    public BookInfoBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public BookInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BookInfoBuilder setEdition(int edition) {
        this.edition = edition;
        return this;
    }

    @Override
    public BookInfoBuilder setIndex(int index) {
        this.index = index;
        return this;
    }

    @Override
    public BookInfo build() {
        if (author == null) {
            throw new IllegalStateException();
        }
        if (name == null) {
            throw new IllegalStateException();
        }
        return new BookInfo(author, name, edition, index);
    }
}