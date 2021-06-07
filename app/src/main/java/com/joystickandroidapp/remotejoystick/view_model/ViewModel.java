package com.joystickandroidapp.remotejoystick.view_model;

import com.joystickandroidapp.remotejoystick.model.FGPlayer;

public class ViewModel {
    public String ip;
    public int port;
    public FGPlayer FGPlayerModel;

    public ViewModel(String ip, int port, FGPlayer FGPlayerModel) {
        this.ip = ip;
        this.port = port;
        this.FGPlayerModel = FGPlayerModel;
    }
}
