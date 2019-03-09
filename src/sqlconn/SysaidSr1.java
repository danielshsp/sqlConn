/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconn;

import com.ilient.api.ApiServiceRequest;
import com.ilient.api.SysaidApiService;
import com.ilient.api.SysaidApiServiceService;

 
public class SysaidSr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String userName="sysaid";
        String password="changeit";
        String accountId="consist_trial";
        SysaidApiService service =new SysaidApiServiceService().getSysaidApiServicePort();
        long session=service.login(accountId, userName, password);
        System.out.println(session);
        ApiServiceRequest sr=new ApiServiceRequest();
        sr.setTitle("bbbbbsss");
        sr.setCategory("bbssss");
        service.save(session, sr);
        // TODO code application logic here
    }
    
}
