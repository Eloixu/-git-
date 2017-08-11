package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

/**
 * Created by xuhaocheng on 2017/8/1.
 */
public class Form1DemoAction extends ActionSupport{
    private String username;
    @Override
    public String execute() throws Exception {
        String username = ServletActionContext.getRequest().getParameter("username");
        String password = ServletActionContext.getRequest().getParameter("password");
        String address  = ServletActionContext.getRequest().getParameter("address");

        ValueStack vs = ActionContext.getContext().getValueStack();


        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
