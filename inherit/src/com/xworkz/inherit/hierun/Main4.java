package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.Book;
import com.xworkz.inherit.hierarchial.TextBook;
import com.xworkz.inherit.hierarchial.Novel;
import com.xworkz.inherit.hierarchial.ComicBook;

public class Main4 { 
    public static void main(String[] args) {
        // Creating objects of subclasses

        // TextBook
        TextBook textBook = new TextBook();
        textBook.read();            // Inherited from Book class
        textBook.study();           // Method of TextBook class

        // Novel
        Novel novel = new Novel();
        novel.read();              // Inherited from Book class
        novel.enjoyStory();        // Method of Novel class

        // ComicBook
        ComicBook comicBook = new ComicBook();
        comicBook.read();          // Inherited from Book class
        comicBook.lookAtIllustrations(); // Method of ComicBook class
    }
}
