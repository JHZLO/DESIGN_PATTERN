package org.network.src.controller;

import java.util.Scanner;
import org.network.src.model.BluetoothConnector;
import org.network.src.model.Connector;
import org.network.src.model.DirectConnector;
import org.network.src.model.WifiConnector;

public class NetworkController {
    private final Scanner sc = new Scanner(System.in);

    public void run() {
        Connector connector;
        final String input = inputConnector();
        connector = checkConnector(input);
        if (connector == null) { // 이상한 connector값 받으면 종료
            System.out.println("잘못된 입력입니다.");
            return;
        }
        outputConnectorDisplay(connector);
        outputAvailalbe(connector);
        outputSignal(connector);
        outputDisconnect(connector);
    }

    private String inputConnector() {
        System.out.print("connector를 선택하십시오 (direct, wifi, bluetooth): ");
        return sc.next();
    }

    private Connector checkConnector(final String input) {
        if (input.equals("direct")) {
            return new DirectConnector();
        }
        if (input.equals("wifi")) {
            return new WifiConnector();
        }
        if (input.equals("bluetooth")) {
            return new BluetoothConnector();
        }
        return null;
    }

    private void outputConnectorDisplay(Connector connector) {
        connector.display();
    }

    private void outputAvailalbe(Connector connector) {
        connector.isAvailable();
        connector.printAvailable();
    }

    private void outputSignal(Connector connector) {
        connector.signal();
    }

    private void outputDisconnect(Connector connector) {
        connector.disconnect();
    }
}
