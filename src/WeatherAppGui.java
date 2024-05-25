package weatherapp.src;

import javax.swing.*;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui(){
        // setup gui and add a title
        super("Weather App");

        // configure gui to end the program's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the size of the gui (in pixels)
        setSize(450, 650);

        // load the gui at the center of the screen
        setLocationRelativeTo(null);

        // make the layout manager null to manually position the components within the gui
        setLayout(null);

        // prevent any resize of the gui
        setResizable(false);
    }

}
