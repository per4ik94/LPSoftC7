package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/***
 * Kontrolle fuer die GUI interaktionen.
 *
 * @author Sergej Cerkasin m17574
 * @version HA_E1.2
 * @since 2019/12/31
 */

public class SampleController {

    public Label helloWorld;

    /**
     * Setzt dem Label ein Text.
     * @param actionEvent wird erwartet.
     */
    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
}
