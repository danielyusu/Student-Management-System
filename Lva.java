package abschluss;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Lva {
    private String code;
    private String name;
    
    public Lva(String code, String name){
        this.code=code;
        this.name=name;
    }
    
    public boolean lvakodkontrol(String code) {
        if (code.length() != 6) {
            return false;
        } else return code.matches("[a-zA-Z]{3}[0-9]{3}");
    }
    
    /*private ArrayList <String> lvawithstudent= new ArrayList<>();
    private ArrayList <String> lvawithdozent= new ArrayList<>();*/
    
    @Override
    public String toString(){

        return code+ " " + name.toUpperCase();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public ArrayList<String> getLvawithstudent() {
        return lvawithstudent;
    }

    public void setLvawithstudent(ArrayList<String> lvawithstudent) {
        this.lvawithstudent = lvawithstudent;
    }

    public ArrayList<String> getLvawithdozent() {
        return lvawithdozent;
    }

    public void setLvawithdozent(ArrayList<String> lvawithdozent) {
        this.lvawithdozent = lvawithdozent;
    }*/

    
    
}
