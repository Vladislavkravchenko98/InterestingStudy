package services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ButtonFirst {

    private Integer value = 0;

    public Integer getValue() {
        return value;
    }

    public Integer upValue() {
        return value++;
    }
}
