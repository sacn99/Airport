package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextField;
import model.Airport;

public class AirportGUI {
	private Airport airport;
    @FXML
    private Pagination pageIndicator;

    @FXML
    private TextField flightsQuantity;

    @FXML
    void changeOrientation(ActionEvent event) {

    }

    @FXML
    void createFlights(ActionEvent event) {
    	if(flightsQuantity.getPromptText() != null && Integer.parseInt(flightsQuantity.getPromptText()) >= 0){
    		for (int i = 0; i < Integer.parseInt(flightsQuantity.getPromptText()); i++) {
				airport.addFlight(airport.randomHour(), airport.randomDayPart(), airport.randomAirline(), airport.randomId(), airport.randomDestination(), airport.randomTerminal(), airport.randomGate(), airport.randomRemark());
			}
    		
    		/*AirportThread apt = new AirportThread(this);
        	apt.setDaemon(true);
        	apt.start();
        	*/
    	}
    }

    @FXML
    void orderByAirline(ActionEvent event) {

    }

    @FXML
    void orderByDestination(ActionEvent event) {

    }

    @FXML
    void orderByFlight(ActionEvent event) {

    }

    @FXML
    void orderByGate(ActionEvent event) {

    }

    @FXML
    void orderByHour(ActionEvent event) {

    }

    @FXML
    void orderByRemark(ActionEvent event) {

    }

    @FXML
    void orderByTerminal(ActionEvent event) {

    }

    @FXML
    void reset(ActionEvent event) {

    }

}
