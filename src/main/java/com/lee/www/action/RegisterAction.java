package com.lee.www.action;

import com.lee.www.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private ArrayList<String> sports;


    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    public ArrayList<String> getSports() {
        return sports;
    }

    private Person personBean;

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    public String input() throws Exception {
        sports = new ArrayList<String>();
        sports.add("a");
        sports.add("b");
        sports.add("c");
        return INPUT;
    }
//
//    public void validate() {
//        if (personBean.getFirstName().length() == 0) {
//            addFieldError("personBean.firstName", "First name is required.");
//        }
//
//        if (personBean.getEmail().length() == 0) {
//            addFieldError("personBean.email", "Email is required.");
//        }
//
//        if (personBean.getAge() < 18) {
//            addFieldError("personBean.age", "Age is required and must be 18 or older");
//        }
//    }
}
