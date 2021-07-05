package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rutinas")
public class RoutineData {
    @Id
    protected String idRoutines;
    protected String routinesName;
    protected String descriptionRoutines;
    protected String idUsuario;
    protected String typeSkin;

    public RoutineData(String idRoutines, String routinesName, String descriptionRoutines, String idUsuario, String typeSkin) {
        this.idRoutines = idRoutines;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;
    }

    public RoutineData(){

    }

    public String getIdRoutines() {
        return idRoutines;
    }

    public void setIdRoutines(String idRoutines) {
        this.idRoutines = idRoutines;
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

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTypeSkin() {
        return typeSkin;
    }

    public void setTypeSkin(String typeSkin) {
        this.typeSkin = typeSkin;
    }
}
