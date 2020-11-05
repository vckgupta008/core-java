package com.Assignment;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url       String that represents an URL that the user has visited
     * @param numVisits An int that represents the number of times that the user has
     *                  visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     * the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     *
     * @param an int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class SolutionB {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        // WRITE CODE HERE
        sortQueueMaxVisitedWebsite(sites);// Sorting queue in descending order of max visited website
        while (n > 0) { // printing the top n visited websites
            System.out.print(sites.peek() + " ");
            sites.remove();
            n--;
        }
    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        // WRITE CODE HERE
        // Storing the websites  with updated visited count on the basis of recently visited websites
        SiteStats newSite = null;
        boolean siteExist = false;
        int counter = 1;
        for (SiteStats site : sites) {
            if (site.getUrl() == url) {
                siteExist = true;
                newSite = new SiteStats(url, site.getNumVisits() + 1);
                break;
            }
        }
        if (!siteExist) {
            newSite = new SiteStats(url, 1);
        }
        while (counter <= sites.size()) {//Removing the website with old visited count if exist
            if (sites.peek().getUrl() == url) {
                sites.remove();
                counter--;
            } else {
                sites.add(sites.remove());
            }
            counter++;
        }
        sites.add(newSite);
        counter = 1;
        while (counter < sites.size()) {//Moving the recently visited url at the front of the queue to maintain the precision
            sites.add(sites.remove());
            counter++;
        }
    }

    public static void main(String[] args) {
        String[] visitedSites = {"www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com"};

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);
    }

    public static void sortQueueMaxVisitedWebsite(Queue<SiteStats> sites) { //Sort the website in descending order of visited numbers
        if (sites.isEmpty()) {
            System.out.println(sites); //If no browsing history found, print the empty queue
        }
        for (int i = 1; i <= sites.size(); i++) {
            int maxIndex = indexMaxVisitedWebsite(sites, sites.size() - i);//Finding the maximum index of the mostly visited website
            insertMaxToFront(sites, maxIndex);//Inserting the max visited website to the front end of the queue
        }
    }

    public static int indexMaxVisitedWebsite(Queue<SiteStats> sites, int sortIndex) {//Returns the index in the queue for the max visited website
        int maxIndex = -1;
        int maxValue = 0;
        SiteStats currentElement;
        for (int i = 0; i < sites.size(); i++) {
            currentElement = sites.peek();
            sites.remove();
            if (currentElement.getNumVisits() > maxValue && i <= sortIndex) {
                maxIndex = i;
                maxValue = currentElement.getNumVisits();
            }
            sites.add(currentElement);
        }
        return maxIndex;
    }

    public static void insertMaxToFront(Queue<SiteStats> sites, int max_index) {//Inserting the max visited website to the front of the queue
        int sites_size = sites.size();
        SiteStats current_element, max_element = null;
        for (int i = 0; i < sites_size; i++) {
            current_element = sites.peek();
            sites.remove();
            if (i != max_index) {
                sites.add(current_element);
            } else {
                max_element = current_element;
            }
        }
        sites.add(max_element); // adding max visited website at the end of the queue
    }


}

