/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconn;
import java.util.*;
import com.ilient.api.*;

public class loaduseranpc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userName="sysaid";
        String password="changeit";
        String accountId="consist_trial";
        SysaidApiService service=new SysaidApiServiceService().getSysaidApiServicePort();
        long session=service.login(accountId, userName, password);
        String userId = "123456";
      // try{
      ArrayList arr  = (ArrayList) service.executeSelectQuery(session, new ApiSysAidUser() , "user_cust_idusernum = " + userId);
        String returnedUserName = "";
        if(arr.size() > 0) {
            for(int i = 0; i < arr.size(); i++)
                returnedUserName = arr.get(i).toString();
             
        } 
        System.err.println(returnedUserName);
       
     
        /* String req_user = "sysaid";
        ApiSysAidUser user =(ApiSysAidUser)service.loadByStringId(session,new ApiSysAidUser(),req_user);
        System.out.println(session);
        ApiComputer computer=new ApiComputer();
        computer.setComputerName("test");
        computer.setSerial("123456");
        System.out.print(user.getDepartment()); 
        service.save(session, computer); */

        // TODO code application logic here
    }
    
}
