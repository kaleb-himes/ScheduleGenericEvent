package org.cubrc.example;


import jdk.nashorn.internal.parser.JSONParser;


/**
 * @author Robert Weber
 */
public class Query {

    public void insertEvent(Event event){
        RestClient client = new RestClient();
        client.setServerToQuery();
        String query = "PREFIX ero: <http://www.ontologylibrary.mil/CommonCore/Upper/ExtendedRelationOntology#>" +
                "PREFIX to: <http://www.ontologylibrary.mil/CommonCore/Mid/TimeOntology#>" +
                "PREFIX agent: <http://www.ontologylibrary.mil/CommonCore/Mid/AgentOntology#>" +
                "PREFIX info: <http://www.ontologylibrary.mil/CommonCore/Mid/InformationEntityOntology#>" +
                "INSERT DATA { " +
                "agent:Event ero:bearer_of to:day . " +
                "to:day info:has_text_value " + event.getDay() + " ; } " ;
        String response = client.post("", query);
    }
    public String selectEvent(){
        // TODO: Implement SELECT Query
        return "";
    }

}
