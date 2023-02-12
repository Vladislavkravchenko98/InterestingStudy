package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import services.ButtonFirst;
import services.ButtonSecond;
import services.TwoPhones;
import services.FirstSmartphone;
import services.SecondSmartphone;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public ButtonFirst firstButton(){
        return new ButtonFirst();
    }

    @Bean
    @Scope("singleton")
    public ButtonSecond secondButton(){
        return new ButtonSecond();
    }

    @Bean
    public FirstSmartphone firstSmartphone(ButtonFirst buttonFirst, ButtonSecond buttonSecond){
        return new FirstSmartphone(buttonFirst, buttonSecond);
    }

    @Bean
    public SecondSmartphone secondSmartphone(ButtonFirst buttonFirst, ButtonSecond buttonSecond){
        return new SecondSmartphone(buttonFirst, buttonSecond);
    }

    @Bean
    public TwoPhones twoPhones(FirstSmartphone firstSmartphone, SecondSmartphone secondSmartphone){
        return new TwoPhones(firstSmartphone, secondSmartphone);
    }
}
