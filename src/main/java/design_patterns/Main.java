package design_patterns;

import design_patterns.enumsfolder.DistributorServiceEnum;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {


        while(true){
            int mailCode = DBUtils.getMailCode();
            DistributorServiceEnum ds = DistributorServiceEnum.statusCode(mailCode);
            ds.getHandler().sendMail();

            Thread.sleep(500);
        }
    }
}
