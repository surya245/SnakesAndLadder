package io.suryap.services;

import java.io.IOException;
import java.util.List;

public abstract class InputParser {
    abstract public List<String> getNames() throws IOException;
    abstract public List<String> getSnakes();
    abstract public List<String> getLadders();
}
