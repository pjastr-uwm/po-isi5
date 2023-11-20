package education;

public class SchoolLibrary extends  Library{

    private String schoolType;
    private int librarians;

    public SchoolLibrary(String  name, String location, int books, String schoolType,
                         int librarians){
        super(name, location, books);
        this.schoolType = (schoolType == null || schoolType.isEmpty())? "średnia" : schoolType;
        this.librarians = librarians >2 ? librarians : 3;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        if (schoolType !=null && ! schoolType.isEmpty())
            this.schoolType = schoolType;
    }

    public int getLibrarians() {
        return librarians;
    }

    public void setLibrarians(int librarians) {
        if (librarians >2)
            this.librarians = librarians;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+
                "School Type: "+schoolType+". Number of librarians: "+librarians+".";
    }

    @Override
    public void addBooks(int arg){
        setBooks(getBooks()+arg);
        if (getBooks() > 3000){
            setBooks(3000);
        }
    }

    @Override
    public  boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        SchoolLibrary other = (SchoolLibrary) otherObject;
        return schoolType.equals(other.schoolType);
    }

    @Override
    public int hashCode(){
        return super.hashCode() * 31 + schoolType.hashCode();
    }
}
