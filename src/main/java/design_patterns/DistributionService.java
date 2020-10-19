package design_patterns;

public class DistributionService {
    public void sendMail(){
        int mailCode = DBUtils.getMailCode();
        if(mailCode==1){
            //code
            System.out.println("Welcome to our company");
        }else if(mailCode==2){
            //code
            System.out.println("dont call us, we call you");
        }
    }
}
