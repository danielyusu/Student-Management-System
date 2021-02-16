/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abschluss;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Universitaet {
    private static final ArrayList<Student> STUDENTLIST= new ArrayList();

    public ArrayList<Student> getStudentlist() {
        return STUDENTLIST;
    }
    
    private static final ArrayList<Dozent> DOZENTLIST= new ArrayList();

    public ArrayList<Dozent> getDozentlist() {
        return DOZENTLIST;
    }
    
    private static final ArrayList<Lva> LVALIST= new ArrayList();

    public ArrayList<Lva> getLvalist() {
        return LVALIST;
    }
    
    private static final ArrayList<Student> LVAWITHSTUDENT= new ArrayList();

    public ArrayList<Student> getLvawithstudent() {
        return LVAWITHSTUDENT;
    }
    
    private static final ArrayList<Dozent> LVAWITHDOZENT= new ArrayList();

    public  ArrayList<Dozent> getLvawithdozent() {
        return LVAWITHDOZENT;
    }
    
}
