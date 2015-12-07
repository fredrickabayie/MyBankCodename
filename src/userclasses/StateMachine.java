/**
 * Your application code goes here
 */

package userclasses;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.Resources;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     * @param res
     */
    @Override
    protected void initVars(Resources res) {
    }

    @Override
    protected void onMain_SubmitAction(Component c, ActionEvent event) {
        String url = "http://cs.ashesi.edu.gh/~csashesi/class2016/fredrick-abayie/mobileweb/mybank/php/mybank.php";
        String response = "", latitude, longitude, bankName, areaName, type;
        
        latitude = findLatitude().getText();
        longitude = findLongitude().getText();
        areaName = findArea().getText();
        bankName = findBank().getSelectedItem().toString();
        type = findType().getSelectedItem().toString();
        
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.setUrl(url);
        connectionRequest.setPost(false);
        connectionRequest.addArgument("cmd", "add_location");
        connectionRequest.addArgument("latitude", latitude);
        connectionRequest.addArgument("longitude", longitude);
        connectionRequest.addArgument("bankName", bankName);
        connectionRequest.addArgument("areaName", areaName);
        connectionRequest.addArgument("type", type);
        InfiniteProgress infiniteProgress = new InfiniteProgress();
        Dialog dialog = infiniteProgress.showInifiniteBlocking();
        connectionRequest.setDisposeOnCompletion(dialog);
        NetworkManager.getInstance().addToQueueAndWait(connectionRequest);
        response = new String(connectionRequest.getResponseData());
        System.out.println(response);
        c.getComponentForm().revalidate();
    }
    
    
    @Override
    protected boolean initListModelLocations(List cmp) {
        byte[] jsondata = display();
        Vector vector = getResult(jsondata);
        cmp.setModel(new DefaultListModel(vector));
        //cmp.setModel(new com.codename1.ui.list.DefaultListModel(new String[] {"Item 1", "Item 2", "Item 3"}));
        return true;
    }


//    @Override
//    protected void onCreateMain() {
//        byte[] jsondata = display();
//        Vector vector = getResult(jsondata);
//        findLocations().setModel(new DefaultListModel(vector));
//    }
    
    
    private byte[] display() {
        final ArrayList arraylist = null;
        ConnectionRequest connection = new ConnectionRequest();
        connection.setUrl("http://cs.ashesi.edu.gh/~csashesi/class2016/fredrick-abayie/mobileweb/mybank/php/mybank.php");
        connection.setPost(false);
        connection.addArgument("cmd", "view_locations");
        
        NetworkManager.getInstance().addToQueueAndWait(connection);
        
        return connection.getResponseData();
    }
    
    
    private Vector getResult(byte[] jsondata) {
        Vector vector = new Vector();
        InputStream input = new ByteArrayInputStream(jsondata);
        InputStreamReader reader = new InputStreamReader(input);
        JSONParser jsonparser = new JSONParser();
        try{
       Map response = jsonparser.parseJSON(reader);

        ArrayList rows = (ArrayList) response.get("locations");

        LinkedHashMap linkedhashmap;
         
        for(int i = 0; i < rows.size(); i++){
             linkedhashmap = (LinkedHashMap) rows.get(i);
             Hashtable hashtable = new Hashtable();
             hashtable.put("bank_name", linkedhashmap.get("area_name"));
             hashtable.put("lnglat", linkedhashmap.get("latitude")+", "+linkedhashmap.get("longitude"));
             hashtable.put("banktype", linkedhashmap.get("type")+", "+linkedhashmap.get("bank_name"));
             vector.addElement(hashtable);
        }
       }catch(IOException ioe){
           ioe.printStackTrace();
       }
        return vector;
    }
    
}
