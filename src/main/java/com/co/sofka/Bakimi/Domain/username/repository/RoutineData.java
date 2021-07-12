package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rutinas")
public class RoutineData {
    @Id
    protected String idr;
    protected String routinesName;
    protected String descriptionRoutines;
    protected String typeSkin;

    public RoutineData(String idr, String routinesName, String descriptionRoutines, String typeSkin) {
        this.idr = idr;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.typeSkin = typeSkin;
    }
    public RoutineData(){

    }

    public String getIdr() {
        return idr;
    }

    public void setIdr(String idr) {
        this.idr = idr;
    }

    public String getRoutinesName() {
        return routinesName;
    }

    public void setRoutinesName(String routinesName) {
        this.routinesName = routinesName;
    }

    public String getDescriptionRoutines() {
        return descriptionRoutines;
    }

    public void setDescriptionRoutines(String descriptionRoutines) {
        this.descriptionRoutines = descriptionRoutines;
    }

    public String getTypeSkin() {
        return typeSkin;
    }

    public void setTypeSkin(String typeSkin) {
        this.typeSkin = typeSkin;
    }
}
