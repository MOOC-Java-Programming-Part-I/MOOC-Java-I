public class Book {
    
    private String title;
    private int numPages;
    private int pubYear;

    public Book(String title, int numPages, int pubYear){
        this.title = title;
        this.numPages = numPages;
        this.pubYear = pubYear;
    }

    public String getTitle(){
        return this.title;
    }

    public int getNumPages(){
        return this.numPages;
    }

    public int getPubYear(){
        return this.pubYear;
    }

    @Override
    public String toString(){
        return this.title + ", " + this.numPages + " pages, " + this.pubYear;
    }
}
