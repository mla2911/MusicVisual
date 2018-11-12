// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose, Saunders Cox
package prj5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Class that creates the Window representation
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.02
 */
public class GUIMusicWindow {

    /**
     * The GUI window to hold the buttons and shapes
     */
    private Window window;
    /**
     * the DLList of people to
     */
    private DLList<Person> people;
    /**
     * the representation of how many readers heard a song
     */
    private Shape magentaHeard;
    /**
     * the representation of how many readers liked a song
     */
    private Shape magentaLiked;
    /**
     * the representation of how many artists heard a song
     */
    private Shape blueHeard;
    /**
     * the representation of how many artists liked a song
     */
    private Shape blueLiked;
    /**
     * the representation of how many musicians heard a song
     */
    private Shape greenHeard;
    /**
     * the representation of how many musicians liked a song
     */
    private Shape greenLiked;
    /**
     * the representation of how many athletes heard a song
     */
    private Shape orangeHeard;
    /**
     * the representation of how many athletes liked a song
     */
    private Shape orangeLiked;
    /**
     * the indicator of the scale
     */
    private Shape bar;
    /**
     * displays the title of the song
     */
    private TextShape songTitle;
    /**
     * displays the artist of the song
     */
    private TextShape artistName;


    /**
     * Constructor. Creates a window and initializes all shapes.
     * Creates the buttons for the window GUI and adds all shapes and buttons
     * to the window.
     */
    public GUIMusicWindow() {
        // creates a new window with title "Project 5"
        window = new Window("                       "
            + "                                                Project 5");
        window.setSize(300, 600);

        // buttons initialized with their labels
        Button prevButton = new Button("Previous");
        Button artistButton = new Button("Sort by Artist Name");
        Button songButton = new Button("Sort by Song Title");
        Button yearButton = new Button("Sort by Release Year");
        Button genreButton = new Button("Sort by Genre");
        Button nextButton = new Button("Next");
        Button hobbyButton = new Button("Represent Hobby");
        Button majorButton = new Button("Represent Major");
        Button regionButton = new Button("Represent Region");
        Button quitButton = new Button("Quit");

        // array of buttons for the top row in the window
        Button[] topButtons = { prevButton, artistButton, songButton,
            yearButton, genreButton, nextButton };
        // array of buttons for the bottom row in the window
        Button[] bottomButtons = { hobbyButton, majorButton, regionButton,
            quitButton };

        // for loop to add the top row buttons to the North side of the window
        for (int i = 0; i < topButtons.length; i++) {
            window.addButton(topButtons[i], WindowSide.NORTH);
        }

        // for loop to add the bottom row buttons to the South side of the
        // window
        for (int i = 0; i < bottomButtons.length; i++) {
            window.addButton(bottomButtons[i], WindowSide.SOUTH);
        }

        // Legend shapes that will not change.
        
        //black base shape to create a border
        Shape legendBorder = new Shape(568, 280, 107, 180, Color.BLACK);
        //white shape placed on top of black shape to create a border
        Shape legendInside = new Shape(569, 281, 105, 178, Color.WHITE);
        // text shape to give a title to the legend
        TextShape legendTitle = new TextShape(572, 283, "Hobby Legend");
        //make the background white
        legendTitle.setBackgroundColor(Color.WHITE);
        //the different aspects of the legend for hobbies, each corresponding 
        // to a color: 
        // Read = Magenta, Art = Blue, Sports = Orange, Music = Green
        // all set with a white background
        TextShape legendRead = new TextShape(572, 303, "Read", Color.MAGENTA);
        legendRead.setBackgroundColor(Color.WHITE);
        TextShape legendArt = new TextShape(572, 323, "Art", Color.BLUE);
        legendArt.setBackgroundColor(Color.WHITE);
        TextShape legendSports = new TextShape(572, 343, "Sports",
            Color.ORANGE);
        legendSports.setBackgroundColor(Color.WHITE);
        TextShape legendMusic = new TextShape(572, 363, "Music", Color.GREEN);
        legendMusic.setBackgroundColor(Color.WHITE);
        TextShape legendSong = new TextShape(587, 383, "Song Title");
        legendSong.setBackgroundColor(Color.WHITE);
        TextShape legendHeard = new TextShape(572, 413, "Heard");
        legendHeard.setBackgroundColor(Color.WHITE);
        TextShape legendLikes = new TextShape(625, 413, "Likes");
        legendLikes.setBackgroundColor(Color.WHITE);
        Shape legendBar = new Shape(618, 408, 5, 40, Color.BLACK);
        Shape[] legend = { legendLikes, legendBar, legendHeard, legendSong,
            legendMusic, legendSports, legendArt, legendRead, legendTitle,
            legendInside, legendBorder };
        for (int i = 0; i < legend.length; i++) {
            window.addShape(legend[i]);
        }
        /*
         * all shapes are hard coded in for intermediate testing purposes.
         * when the back-end is connected we will link everything together.
         */

        /*
         * ***************************************************/
        // TextShapes to hold the song title and artist name
        songTitle = new TextShape(90, 30, "Let It Be");
        artistName = new TextShape(80, 50, "by The Beatles");

        // the heard and liked indicators of readers
        magentaHeard = new Shape(50, 70, 100, 10, Color.MAGENTA);
        magentaLiked = new Shape(100, 70, 100, 10, Color.MAGENTA);
        // the heard and liked indicators of artists
        blueHeard = new Shape(70, 80, 100, 10, Color.BLUE);
        blueLiked = new Shape(100, 80, 100, 10, Color.BLUE);
        // the heard and liked indicators of athletes
        orangeHeard = new Shape(85, 90, 100, 10, Color.ORANGE);
        orangeLiked = new Shape(85, 90, 100, 10, Color.ORANGE);
        // the heard and liked indicators of musicians
        greenHeard = new Shape(65, 100, 100, 10, Color.GREEN);
        greenLiked = new Shape(65, 100, 100, 10, Color.GREEN);
        // indicator of where heard ended and liked begins
        bar = new Shape(120, 70, 5, 40, Color.BLACK);

        // array of shapes to add all shapes to the window
        Shape[] glyph = { bar, magentaHeard, magentaLiked, blueHeard, blueLiked,
            orangeHeard, orangeLiked, greenHeard, greenLiked };
        // for loop to add all shapes to the window
        for (int i = 0; i < glyph.length; i++) {
            window.addShape(glyph[i]);
        }

        // set the background of the text shapes to white
        songTitle.setBackgroundColor(Color.WHITE);
        artistName.setBackgroundColor(Color.WHITE);
        // add them to the window
        window.addShape(songTitle);
        window.addShape(artistName);
        /*
         * **********************************************
         */
        quitButton.onClick(this, "clickedQuitButton");
        prevButton.onClick(this, "clickedPrevButton");
        artistButton.onClick(this, "clickedArtistButton");
        songButton.onClick(this, "clickedSongButton");
        yearButton.onClick(this, "clickedYearButton");
        genreButton.onClick(this, "clickedGenreButton");
        nextButton.onClick(this, "clickedNextButton");
        hobbyButton.onClick(this, "clickedHobbyButton");
        majorButton.onClick(this, "clickedMajorButton");
        regionButton.onClick(this, "clickedRegionButton");

    }


    /**
     * sets the song title of the glyph
     * 
     * @param title
     *            the title of the song
     */
    public void setSongTitle(String title) {
        songTitle.setText(title);
        window.addShape(songTitle);
    }


    /**
     * sets the artist name of the glyph
     * 
     * @param artist
     *            the artist name
     */
    public void setArtistName(String artist) {
        artistName.setText("by " + artist);
        window.addShape(artistName);

    }


    /**
     * sets the magenta reader bar to the current heard and liked
     * 
     * @param heard
     *            the number of readers heard the song
     * @param liked
     *            the number of readers who liked the song
     */
    public void setMagenta(int heard, int liked) {
        int xHeard = magentaHeard.getX();
        int yHeard = magentaHeard.getY();
        int xLiked = magentaLiked.getX();
        int yLiked = magentaLiked.getY();
        magentaHeard = new Shape(xHeard, yHeard, heard, 10, Color.MAGENTA);
        magentaLiked = new Shape(xLiked, yLiked, liked, 10, Color.MAGENTA);
        window.addShape(magentaHeard);
        window.addShape(magentaLiked);
    }


    /**
     * sets the blue artist bar to the current heard and liked
     * 
     * @param heard
     *            the number of artists heard the song
     * @param liked
     *            the number of artists who liked the song
     */
    public void setBlue(int heard, int liked) {
        int xHeard = blueHeard.getX();
        int yHeard = blueHeard.getY();
        int xLiked = blueLiked.getX();
        int yLiked = blueLiked.getY();
        blueHeard = new Shape(xHeard, yHeard, heard, 10, Color.BLUE);
        blueLiked = new Shape(xLiked, yLiked, liked, 10, Color.BLUE);
        window.addShape(blueHeard);
        window.addShape(blueLiked);
    }


    /**
     * sets the orange sports bar to the current heard and liked
     * 
     * @param heard
     *            the number of athletes heard the song
     * @param liked
     *            the number of athletes who liked the song
     */
    public void setOrange(int heard, int liked) {
        int xHeard = orangeHeard.getX();
        int yHeard = orangeHeard.getY();
        int xLiked = orangeLiked.getX();
        int yLiked = orangeLiked.getY();
        orangeHeard = new Shape(xHeard, yHeard, heard, 10, Color.ORANGE);
        orangeLiked = new Shape(xLiked, yLiked, liked, 10, Color.ORANGE);
        window.addShape(orangeHeard);
        window.addShape(orangeLiked);
    }


    /**
     * sets the green music bar to the current heard and liked
     * 
     * @param heard
     *            the number of musicians heard the song
     * @param liked
     *            the number of musicians who liked the song
     */
    public void setGreen(int heard, int liked) {
        int xHeard = greenHeard.getX();
        int yHeard = greenHeard.getY();
        int xLiked = greenLiked.getX();
        int yLiked = greenLiked.getY();
        greenHeard = new Shape(xHeard, yHeard, heard, 10, Color.GREEN);
        greenLiked = new Shape(xLiked, yLiked, liked, 10, Color.GREEN);
        window.addShape(greenHeard);
        window.addShape(greenLiked);
    }


    /**
     * if the previous button is clicked, go to previous page
     * 
     * @param previous
     *            previous button
     */
    public void clickedPrevButton(Button previous) {

    }


    /**
     * if the sort by artist button is clicked, sort the list by artist
     * 
     * @param artist
     *            sort by artist button
     */
    public void clickedArtistButton(Button artist) {

    }


    /**
     * if sort by song title button is clicked, sort the list by song title
     * 
     * @param song
     *            sort by song button
     */
    public void clickedSongButton(Button song) {

    }


    /**
     * if the sort by release year button is clicked, sort the list by release
     * year
     * 
     * @param year
     *            sort by release year button
     */
    public void clickedYearButton(Button year) {

    }


    /**
     * if the sort by genre button is clicked, sort the list by genre
     * 
     * @param genre
     *            sort by genre button
     */
    public void clickedGenreButton(Button genre) {

    }


    /**
     * if the next button is clicked, go to the next page
     * 
     * @param next
     *            next button
     */
    public void clickedNextButton(Button next) {

    }


    /**
     * if the represent hobby button is clicked, sort the list by hobbies
     * 
     * @param hobby
     *            represent hobby
     */
    public void clickedHobbyButton(Button hobby) {

    }


    /**
     * if the represent major button is clicked, sort the list by majors
     * 
     * @param major
     *            represent major button
     */
    public void clickedMajorButton(Button major) {

    }


    /**
     * if the represent region button is clicked, sort the list by region
     * 
     * @param region
     *            represent region
     */
    public void clickedRegionButton(Button region) {

    }


    /**
     * if the quit button is clicked, quit the program,
     * 
     * @param quit
     *            quit button
     */
    public void clickedQuitButton(Button quit) {

        System.exit(0);

    }

}
