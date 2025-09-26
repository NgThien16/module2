package case_study_2.entity;

public class Book extends Document{
    private String pages;
    private String type;

    public Book(){}


    public Book(String documentId, String name, String since, String author, String pages, String type) {
        super(documentId, name, since, author);
        this.pages = pages;
        this.type = type;
    }

    public String getPages() {
        return pages;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{"+ super.toString()+
                "pages='" + pages + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return this.getDocumentId()+","+this.getName()+","+this.getSince()+","+this.getAuthor()+","+this.getPages()+","+this.getType();
    }
}
