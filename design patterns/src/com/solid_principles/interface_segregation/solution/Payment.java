package com.solid_principles.interface_segregation.solution;

import java.util.List;

public interface Payment {

    Object status();
    List<Object> getPayments();

}
