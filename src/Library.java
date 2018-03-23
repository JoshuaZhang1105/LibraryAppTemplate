public class Library {
    String name;
    Address location;
    Book[] books;
    Member[] members;

     /**
      * addBook(Book) : void
      *creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
      * @param book
      *          A new book object to add to the books list
      */


       
       public void addBook (book) {
           String[] newBooks = new String[this.books.length + 1]
           for (int i = 0; i < this.books.length; i ++) {
            newBooks[i] = this.books[i];
           }
           
           newBooks[i] = book;
           
       }
 
 
     /* @param member
      *          A new member object to add to the members list
      */
     public void addMember (member) {
           String[] newMember = new String[this.members.length + 1]
           for (int i = 0; i < this.members.length; i ++) {
            newMember[i] = this.members[i];
           }
      
           newMember[i] = member;
           
 }
 
 
