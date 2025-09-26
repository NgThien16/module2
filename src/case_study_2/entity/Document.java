package case_study_2.entity;

public abstract class Document {
    private String documentId;
    private String name;
    private String since;
    private String author;

    public Document(){

    }
    public Document(String documentId, String name, String since, String author) {
        this.documentId = documentId;
        this.name = name;
        this.since = since;
        this.author = author;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", since='" + since + '\'' +
                ", author='" + author + '\'' ;
    }
}
