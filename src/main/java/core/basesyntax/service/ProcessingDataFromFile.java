package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface ProcessingDataFromFile {
    List<FruitTransaction> processData(List<String> data);
}
