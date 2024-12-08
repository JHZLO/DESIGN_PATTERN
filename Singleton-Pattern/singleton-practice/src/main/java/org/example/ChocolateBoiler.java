package org.example;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("비어있어서 채움");
            empty = false;
            boiled = false;
        } else {
            System.out.println("비어있지 않음");
        }
    }

    public void drain() {
        if (isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("물 끓이는 중");
            boiled = true;
        } else {
            System.out.println("물이 끓는 중");
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
