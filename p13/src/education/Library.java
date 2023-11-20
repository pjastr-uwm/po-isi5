package education;

class Library {

    private String name;
    private String location;
    private int books;

    public Library(String  name, String location, int books){
        this.name = (name == null || name.isEmpty()) ? "Biblioteka Miejska" : name;
        this.location = (location == null || location.isEmpty())
                ? "ul. Wiedzy 123, 00-001 Miasteczko" : location;
        this.books = books > 0 ? books : 1000;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty())
            this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= null && !name.isEmpty())
            this.name = name;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        if (books >0)
            this.books = books;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+": Name: "+name+
                ". Location: "+ location +". Number of books: "+books+".";
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Library other = (Library) otherObject;
        return location.equals(other.location);
    }

    @Override
    public int hashCode(){
        return 31* location.hashCode();
    }

    public void addBooks(int arg){
        books += arg;
        if (books > 5000) books = 5000;
    }

    public static void checkBookCapacity(Library arg){
        System.out.println(arg.books);
        System.out.println(5000-arg.books);
    }
}
