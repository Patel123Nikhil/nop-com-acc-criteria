package NopCommerce;

//NopCommerce Acceptance criteria-Scenario Outline
public class scenariooutline {
    public static void main(String [] args) {
        System.out.println("Feature: Bookcategory");

        System.out.println("Background: I should be able to see homepage");
        System.out.println("Given   I enter URL www.demo.nopcommerce.com/");
        System.out.println("And     I am on home page");

        System.out.println("Scenario Outline:    I should be able to see top menu tabs on homepage with category");
        System.out.println("When     I am on home page");
        System.out.println("Then     I should be able to see top menu tabs with <categories>");
        System.out.println("Examples:");
        System.out.println("|categories           |");
        System.out.println("|computer             |");
        System.out.println("|electronic           |");
        System.out.println("|apparel              |");
        System.out.println("|digital download     |");
        System.out.println("|books                |");
        System.out.println("|jewellery            |");
        System.out.println("|gift card            | ");

        System.out.println("Scenario outline:   I should be able to see book page with filters");
        System.out.println("When    I select book category from top menu tabs on home page ");
        System.out.println("Then    I should be navigated to book category");
        System.out.println("And     I should be able to see <filters>");
        System.out.println("Examples:");
        System.out.println("|filters       |");
        System.out.println("|short by      |");
        System.out.println("|display       |");
        System.out.println("|the grid      |");
        System.out.println("|list tab      |");

        System.out.println("Scenario outline:  I should be able to see list of terms of each filter");
        System.out.println("Given              I am on book page");
        System.out.println("When               I click on <filter>");
        System.out.println("Then               I should be able to see <list> in dropdown menu");
        System.out.println("Examples:");
        System.out.println("|filter        | list                                                                              |");
        System.out.println("|sort by       | Name: A to Z, name: Z to A, Price: Low to High, Price: High to low, Created on    |");
        System.out.println("display        | 3, 6, 9                                                                           |");

        System.out.println("Scenario Outline:    I should be able to choose any filter option with specific result");
        System.out.println("Given    I am on book page");
        System.out.println("When     I click on <filter>");
        System.out.println("And      I click on any <option>");
        System.out.println("Then     I should be able to choose any filter option from the list");
        System.out.println("And      I should be able to see <result.");
        System.out.println("Examples:");
        System.out.println("|filter     |option            |result                                                              |");
        System.out.println("|Sort by    |Name: A to Z      |sorted product with the product name in alphabetical order A to Z   |");
        System.out.println("|Sort by    |Name: Z to A      |sorted product with the product name in alphabetical order Z to A   |");
        System.out.println("|Sort by    |Price: low to high|sorted product with the price in descending order                   |");
        System.out.println("|Sort by    |Price: High to Low|sorted product with the price in ascending order                    |");
        System.out.println("|Sort by    |Created on        |recently added product should be show first                         |");
        System.out.println("|Display    |3                 | 3 products in a page                                               |");
        System.out.println("|Display    |6                 | 6 products in a page                                               |");
        System.out.println("Display     |9                 | 9 products in a page                                               |");

        System.out.println("Scenario Outline:   I should be able to see product display format according display format type as per given picture in srs document");
        System.out.println("Given     I am on book page");
        System.out.println("When      I click on <display format icon>");
        System.out.println("Then      I should be able to see product display format according display format type as per given picture in SRS document");
        System.out.println("Examples:");
        System.out.println("|display format icon     |");
        System.out.println("|Grid                    |");
        System.out.println("|List                    |")


    }



}

