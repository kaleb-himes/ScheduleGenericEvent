package org.cubrc.example;


import jdk.nashorn.internal.parser.JSONParser;


/**
 * @author Robert Weber
 */
public class Query {

    public void insertEvent(Event event){
        RestClient client = new RestClient();
        client.setServerToUpdate();
        String query = "PREFIX ero: <http://www.ontologylibrary.mil/CommonCore/Upper/ExtendedRelationOntology#>" +
                "PREFIX to: <http://www.ontologylibrary.mil/CommonCore/Mid/TimeOntology#>" +
                "PREFIX agent: <http://www.ontologylibrary.mil/CommonCore/Mid/AgentOntology#>" +
                "PREFIX info: <http://www.ontologylibrary.mil/CommonCore/Mid/InformationEntityOntology#>" +
                "INSERT DATA { " +
                "agent:Event ero:bearer_of to:Day . " +
                "to:Day info:has_text_value " + event.getDay() + " . } " +
                "agent:Event ero:bearer_of to:Month . " +
                "to:Month info:has_text_value " + event.getMonth() + " . } " +
                "agent:Event ero:bearer_of to:Year . " +
                "to:Year info:has_text_value " + event.getYear() + " . } ";
        client.post("", query);
    }
    public String selectEvent(){
        RestClient client = new RestClient();
        client.setServerToQuery();
        String query = "SELECT ?subject ?predicate ?object" +
        " WHERE { ?subject ?predicate ?object } ";
        return client.post("", query);
    }

}
