package services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SecondSmartphone {

    @Autowired
    private ButtonFirst buttonFirst;

    @Autowired
    private ButtonSecond buttonSecond;

    public Integer upAndGetFirst() {
        buttonFirst.upValue();
        return buttonFirst.getValue();
    }

    public Integer upAndGetSecond() {
        buttonSecond.upValue();
        return buttonSecond.getValue();
    }
}
