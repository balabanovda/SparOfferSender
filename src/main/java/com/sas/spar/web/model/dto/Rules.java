package com.sas.spar.web.model.dto;



import java.util.ArrayList;
import java.util.List;

public class Rules
{
    private List<Events> events;

    public void setEvents(List<Events> events){
        this.events = events;
    }
    public List<Events> getEvents(){
        return this.events;
    }

    @Override
    public String toString() {
        return "Rules{" +
                "events=" + events +
                '}';
    }
}