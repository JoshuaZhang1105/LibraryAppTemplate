/**
 * Member class
 */
public class Member {
    String name;
    int birthYear;
    Address address;
    
    

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */
    public int getAge() {
        int age = 0;
        age = 2018 - this.birthYear;
        return age;
    }



    /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param book
     *          The book to read.
     */
    public void readBook(Book){
        String b = Book.title;
        System.out.println("I love the book" + b);
        
        
    }


}
