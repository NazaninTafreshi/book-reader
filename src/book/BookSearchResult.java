/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.ArrayList;

/**
 *
 * @author Nazanin
 */
public class BookSearchResult {

    private final String title;
    private final String bookID;
    private final String authorName;
    private final String cover;
    private final String rating;
    private String description;
    private String num_pages;
    private String publication_year;
    private String language_code;
    private ArrayList<String> quotes;

    /**
     * @return the bookID
     */
    public String getBookID() {
        return bookID;
    }

    @Override
    public String toString() {
        return getTitle() + " By " + getAuthorName();
    }

    BookSearchResult(String title, String bookID, String authorName, String cover, String rating) {
        this.title = title;
        this.bookID = bookID;
        this.authorName = authorName;
        this.cover = cover;
        this.rating = rating;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the num_pages
     */
    public String getNum_pages() {
        return num_pages;
    }

    /**
     * @param num_pages the num_pages to set
     */
    public void setNum_pages(String num_pages) {
        this.num_pages = num_pages;
    }

    /**
     * @return the publication_year
     */
    public String getPublication_year() {
        return publication_year;
    }

    /**
     * @param publication_year the publication_year to set
     */
    public void setPublication_year(String publication_year) {
        this.publication_year = publication_year;
    }

    /**
     * @return the language_code
     */
    public String getLanguage_code() {
        return language_code;
    }

    /**
     * @param language_code the language_code to set
     */
    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    /**
     * @return the quotes
     */
    public ArrayList<String> getQuotes() {
        return quotes;
    }

    /**
     * @param quotes the quotes to set
     */
    public void setQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }

}
