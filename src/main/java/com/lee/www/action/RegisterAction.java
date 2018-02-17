package com.lee.www.action;

import com.lee.www.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    private Person personBean;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void validate() {
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }
}
