package case_study_2.entity;

public class Magazine extends Document{
    private String issueNumber;
    private String issueMonth;

    public Magazine() {}



    public Magazine(String documentId, String name, String since, String author, String issueNumber, String issueMonth) {
        super(documentId, name, since, author);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +super.toString()+
                "issueNumber='" + issueNumber + '\'' +
                ", issueMonth='" + issueMonth + '\'' + '}';
    }
    @Override
    public String getInfoToCSV() {
        return this.getDocumentId()+","+this.getName()+","+this.getSince()+","+this.getAuthor()+","+this.getIssueNumber()+","+this.getIssueMonth();
    }
}