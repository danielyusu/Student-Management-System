package abschluss;

/**
 *
 * @author daniel
 */
public class Dozent {
    private String name;
    private String nachname;
    private String titel;
    private String tcno;
    private String ders;
    
     public Dozent(String name, String nachname, String titel, String tcno) {
        this.name= name;
        this.nachname= nachname;
        this.titel= titel;
        this.tcno= tcno;
     }
     public Dozent(String tcno, String ders){
     this.tcno=tcno;
     this.ders=ders;
     }
    
     public boolean tckontrol(String tcno) {
        return ((tcno.length()==11) && (tcno.matches("[0-9]+")));
    }
     
    @Override
     public String toString() {
        return name  +" "+ nachname.toUpperCase() + " " + titel + " " + tcno + " " + ders;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }
    
    
     
     
}
