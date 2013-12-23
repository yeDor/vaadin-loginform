package com.ejt.vaadin.loginform.shared;

import com.vaadin.shared.AbstractComponentState;
import com.vaadin.shared.Connector;

public class LoginFormContainerState extends AbstractComponentState {
    public Connector userNameFieldConnector;
    public Connector passwordFieldConnector;
    public Connector loginButtonConnector;
}