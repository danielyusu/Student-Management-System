package abschluss;


public class Student {
    private String name;
    private String nachname;
    private String id;
    private String fakultaet;
    private String programm;
    private String ders;
    private int semester;
    private int note;
    private int alter;
    
    public Student(String name, String nachname, String id, String fakultaet, String programm) {
        this.name= name;
        this.nachname= nachname;
        this.id= id;
        this.fakultaet= fakultaet;
        this.programm= programm; 
    }
    
    public Student(String id, String ders) {
    this.id= id;
    this.ders= ders;
    }
    
    public boolean idkontrol(String abc) {
            if (((abc.charAt(0) == '0') || (abc.length() != 7))) {
                return false;
            }
            else if(abc.matches("[0-9]+")) {
                return true; }
            return false;
    }

    @Override
    public String toString() {
        return name  +" "+ nachname.toUpperCase() + " " + id + " " + fakultaet + " " + programm + " " + ders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }

    public String getProgramm() {
        return programm;
    }

    public void setProgramm(String programm) {
        this.programm = programm;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    

    
    
    
}
