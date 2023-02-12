package services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class TwoPhones {
    @Autowired
    private FirstSmartphone firstSmartphone;

    @Autowired
    private SecondSmartphone secondSmartphone;

    public Integer firstButtonPhoneFirst(){
        return firstSmartphone.upAndGetFirst();
    }

    public Integer secondtButtonPhoneFirst(){
        return firstSmartphone.upAndGetSecond();
    }

    public Integer firstButtonPhoneSecond(){
        return secondSmartphone.upAndGetFirst();
    }

    public Integer secondButtonPhoneSecond(){
        return secondSmartphone.upAndGetSecond();
    }
}
