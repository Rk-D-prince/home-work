/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 */
class LibraryItem{
    String lang;
    String name;
    String magazine;
    int issue;
    LibraryItem(String lang, String name, String magazine, int issue){
     this.lang = lang;
     this.name = name;
     this.magazine = magazine;
     this.issue = issue;
    }
     
     void showInfo(){
    }
}

class Book extends LibraryItem{
    Book(String lang, String name){
        super(lang, name, null, 0);
    }
    void showInfo(){
        System.out.println("Book: "+lang+" by "+name);
    }
    
}

class Magazine extends LibraryItem{
    Magazine(String magazine, int issue){
        super(null, null, magazine, issue);
    }
    void showInfo(){
        System.out.println("Magazine: "+magazine+" - Issue "+issue);
    }
    
}


public class libraryMain {
    public static void main(String[] args){
        Book b = new Book("java", "james gosling");
        b.showInfo();
        
        Magazine m = new Magazine("Science weekly", 42);
        m.showInfo();
    }
}
