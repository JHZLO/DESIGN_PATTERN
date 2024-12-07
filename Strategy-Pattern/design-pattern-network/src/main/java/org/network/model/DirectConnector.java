package org.network.src.model;

import java.util.ArrayList;
import java.util.List;
import org.network.src.model.strategies.availability.Available;
import org.network.src.model.strategies.availability.UnAvailable;
import org.network.src.model.strategies.connect.NormalSignal;

public class DirectConnector extends Connector {
    private final List<DirectLine> lines = new ArrayList<>();
    private DirectLine currentLine;

    public DirectConnector() {
        connectSignal = new NormalSignal(); // 신호 세기는 중간으로 설정
        lines.add(new DirectLine("First Direct Line", new UnAvailable()));  // 첫 번째 라인 추가 (불가능 상태)
        lines.add(new DirectLine("Second Direct Line", new Available()));  // 두 번째 라인 추가 (가능 상태)
        currentLine = lines.get(0); // 기본적으로 첫 번째 라인을 설정
    }

    public void display() {
        System.out.println("Direct Connector 입니다.");
    }

    private void checkDirectLine() {
        if (currentLine.isAvailable() == false) {
            System.out.println(currentLine.getName() + "은 이용이 불가능합니다.");
            for (DirectLine line : lines) {
                if (line.isAvailable()) {
                    System.out.println(line.getName() + "은 이용 가능하여 변경되었습니다.");
                    currentLine = line;
                    break;
                }
            }
        }
    }

    public boolean isAvailable() {
        checkDirectLine();
        return currentLine.isAvailable();
    }

    public void printAvailable(){
        currentLine.printAvailable();
    }
}
