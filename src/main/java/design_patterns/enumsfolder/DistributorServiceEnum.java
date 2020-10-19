package design_patterns.enumsfolder;

import design_patterns.service.MailHandler1;
import design_patterns.service.MailHandler2;
import design_patterns.service.inter.MailHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum DistributorServiceEnum {
    FIRST(1, new MailHandler1()), SECOND(2, new MailHandler2());

    private final int mailCode;
    private final MailHandler handler;

     @SneakyThrows
    public static DistributorServiceEnum statusCode(int num){

         return    Arrays.asList(values()).stream()
                .filter(distributor -> distributor.getMailCode()==num)
                .findAny()
                .orElseThrow(()-> new IllegalArgumentException("no Code, try again"));




    }

}
