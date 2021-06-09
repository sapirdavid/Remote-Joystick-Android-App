package com.joystickandroidapp.remotejoystick.view_model;

import com.joystickandroidapp.remotejoystick.model.FGPlayer;

public class ViewModel {
    public String ip;
    public int port;
    public FGPlayer FGPlayerModel;

    public ViewModel(FGPlayer FGPlayerModel) {
        this.FGPlayerModel = FGPlayerModel;
    }
    /* sending the new aileron value to server */
    public void setAileron(double aileronVal) {
        FGPlayerModel.sendAileronValue(String.valueOf(aileronVal));
    }
    /* sending the new elevator value to server */
    public void setElevator(double elevatorVal) {
        FGPlayerModel.sendElevatorValue(String.valueOf(elevatorVal));
    }
}
