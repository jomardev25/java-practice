package com.howtodoinjava.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

	AccountStatement accStatement;

	protected List<Component> list = new ArrayList<>();

    public void add(Component g) {
        list.add(g);
    }

    public void remove(Component g) {
        list.remove(g);
    }

    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    public abstract AccountStatement getStatement();

    public abstract float getBalance();

}
