public class LibraryApp {
    private Library library = new Library();

    public static void main(String[] args) {
        for(int i = 0;i < Library.members.length;i ++) {
            System.out.println("member " + i + " : " + Library.members[i]);
        }
    
        for(int i = 0;i < Libray.books.length;i ++) {
            System.out.println("book " + i + " : " + Libray.books[i]
        }   
                               
        System.out.println(library.location);
    }
    
}
