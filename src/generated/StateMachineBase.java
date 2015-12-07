/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.TextField findArea(Component root) {
        return (com.codename1.ui.TextField)findByName("area", root);
    }

    public com.codename1.ui.TextField findArea() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("area", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("area", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findBank(Component root) {
        return (com.codename1.ui.ComboBox)findByName("bank", root);
    }

    public com.codename1.ui.ComboBox findBank() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("bank", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("bank", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmit(Component root) {
        return (com.codename1.ui.Button)findByName("submit", root);
    }

    public com.codename1.ui.Button findSubmit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findLatitude(Component root) {
        return (com.codename1.ui.TextField)findByName("latitude", root);
    }

    public com.codename1.ui.TextField findLatitude() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("latitude", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("latitude", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findLocations(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("locations", root);
    }

    public com.codename1.ui.list.MultiList findLocations() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("locations", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("locations", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLocation(Component root) {
        return (com.codename1.ui.Container)findByName("location", root);
    }

    public com.codename1.ui.Container findLocation() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("location", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("location", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findType(Component root) {
        return (com.codename1.ui.ComboBox)findByName("type", root);
    }

    public com.codename1.ui.ComboBox findType() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("type", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("type", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findLongitude(Component root) {
        return (com.codename1.ui.TextField)findByName("longitude", root);
    }

    public com.codename1.ui.TextField findLongitude() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("longitude", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("longitude", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("bank".equals(listName)) {
            return initListModelBank(cmp);
        }
        if("locations".equals(listName)) {
            return initListModelLocations(cmp);
        }
        if("type".equals(listName)) {
            return initListModelType(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelBank(List cmp) {
        return false;
    }

    protected boolean initListModelLocations(List cmp) {
        return false;
    }

    protected boolean initListModelType(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("latitude".equals(c.getName())) {
                onMain_LatitudeAction(c, event);
                return;
            }
            if("longitude".equals(c.getName())) {
                onMain_LongitudeAction(c, event);
                return;
            }
            if("area".equals(c.getName())) {
                onMain_AreaAction(c, event);
                return;
            }
            if("type".equals(c.getName())) {
                onMain_TypeAction(c, event);
                return;
            }
            if("bank".equals(c.getName())) {
                onMain_BankAction(c, event);
                return;
            }
            if("submit".equals(c.getName())) {
                onMain_SubmitAction(c, event);
                return;
            }
            if("locations".equals(c.getName())) {
                onMain_LocationsAction(c, event);
                return;
            }
        }
    }

      protected void onMain_LatitudeAction(Component c, ActionEvent event) {
      }

      protected void onMain_LongitudeAction(Component c, ActionEvent event) {
      }

      protected void onMain_AreaAction(Component c, ActionEvent event) {
      }

      protected void onMain_TypeAction(Component c, ActionEvent event) {
      }

      protected void onMain_BankAction(Component c, ActionEvent event) {
      }

      protected void onMain_SubmitAction(Component c, ActionEvent event) {
      }

      protected void onMain_LocationsAction(Component c, ActionEvent event) {
      }

}
