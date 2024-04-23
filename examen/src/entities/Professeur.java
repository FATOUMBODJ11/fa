package entities;

public class Professeur {
    private String nomComplet;
    private int nci;
    private Grade grade;
    public Professeur() {
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public int getNci() {
        return nci;
    }
    public void setNci(int nci) {
        this.nci = nci;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
}
