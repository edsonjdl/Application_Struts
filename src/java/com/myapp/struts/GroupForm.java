/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author edson
 */
public class GroupForm extends org.apache.struts.action.ActionForm {
    
    
    private String groupe;
       
    /**
     * @return
     */
    public String getGroupe() {
        return groupe;
    }

    /**
     * @param string
     */
    public void setGroupe(String string) {
        groupe = string;
    }

    /**
     *
     */
    public GroupForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getGroupe() == null || getGroupe().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.groupe.required' key to your resources
        }
        return errors;
    }
}
