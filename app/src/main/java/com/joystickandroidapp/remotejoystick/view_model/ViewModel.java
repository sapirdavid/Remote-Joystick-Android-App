package com.joystickandroidapp.remotejoystick.view_model;

import com.joystickandroidapp.remotejoystick.model.FGPlayer;

public class ViewModel {
    public String ip;
    public int port;
    public FGPlayer FGPlayerModel;

    public ViewModel(FGPlayer FGPlayerModel) {
        this.FGPlayerModel = FGPlayerModel;
    }
}
