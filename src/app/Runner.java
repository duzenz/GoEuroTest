package app;

import java.io.FileWriter;
import java.io.IOException;

import model.Position;

import com.google.gson.Gson;

public class Runner {

    // this path should be an accessible folder
    public static String csvFilePath = "D:\\positions.csv";
    public static String apiUrl = "http://api.goeuro.com/api/v2/position/suggest/en/";

    public static void main(String[] args) {
        Runner runner = new Runner();
        Request req = new Request();
        
        try {
            runner.validateArgs(args);
            
            // request to url and get json
            String json = req.readUrl(apiUrl + args[0]);

            // parse json
            Gson gson = new Gson();
            Position[] positions = gson.fromJson(json, Position[].class);

            // print to file
            runner.printToCsvFile(positions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printToCsvFile(Position[] positions) throws Exception {
        try {
            FileWriter writer = new FileWriter(csvFilePath);

            for (Position position : positions) {
                // _id, name, type, latitude, longitude
                String csvline = position.getId() + "," + 
                                 position.getName() + "," + 
                                 position.getType() + "," + 
                                 position.getGeoPosition().getLatitude() + "," + 
                                 position.getGeoPosition().getLongitude() + "\n";
                writer.append(csvline);
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void validateArgs(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Arguments should be added");
        }
        
        if (args[0].length() <= 0) {
            throw new Exception("City name argument should be a word");
        }
    }
}
