/*
5.2 Employés
- Une compagnie a un nom et une liste d’employés
- Chaque employé a un nom, un prénom
- Parmi les employés, il y’a :
o Les employés temporaires : ils ont un nombre d’heures travaillées et un salaire
horaire;
o Les employés permanents : ils ont un salaire annuel et un nombre d’heures
travaillées en extra qui sont payées à un taux horaire double (pour obtenir le
taux horaire, divisez le salaire annuel par 2000);
o Les gestionnaires : qui sont des employés permanents mais ont des employés à
leur charge. En plus de leur salaire annuel, ils gagnent annuellement 1% du
salaire de chacun des employés à leur charge. Les heures travaillées en extra
sont comptabilisées mais ne sont pas payées.
Questions :
    - Créez la classe Employe
    - Créez la classe EmployeTemporaire et EmployePermanent
    - Créez la méthode salaireMensuel() pour ces deux classes qui renvoie le montant dû par
    l’entreprise pour le mois en cours;
    - Vérifiez le fonctionnement de vos deux classes et de la méthode salaireMensuel, en
    créant des objets dans votre main.
    - Créez la classe Gestionnaire. Un de ses attributs doit être un tableau d’employés;
    - Créez la méthode salaireMensuel() de Gestionnaire qui renvoie le montant dû par
    l’entreprise pour le mois en cours;
    - Créez la classe Compagnie. Celle-ci doit avoir une liste d’employés;
    - Créer la méthode salaireDu() de Compagnie, qui calcule le salaire que l’entreprise doit
    payer à tous ses employés.
 */
package exercice_5_2;

/**
 *
 * @author 1795545
 */
public class Exercise_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployePermanent ep1 = new EmployePermanent("Snow", "John");
        ep1.setSalaireAnnuel(50000);
        ep1.setNbHeurersExtra(15);
        
        System.out.println("Le salaire munsuel employe permanat est: "+ep1.calculerSalaireMensuel());
        
        EmployeTemporaire et1 = new EmployeTemporaire();
        et1.setNom("Lanster");
        et1.setPrenom("Sercie");
        et1.setNombreTravailles(120);
        et1.setTauxHeurers(20.5);
        
        System.out.println(et1.calculerSalaireMensuel());
        
        Gestionnaire g1 = new Gestionnaire("John Hu", "Kim");
        
        g1.setSalaireAnnuel(800000);
        g1.setNbHeurersExtra(15);
        g1.ajouterEmploye(ep1);
        g1.ajouterEmploye(et1);
        
        System.out.println("Gestionaire"+g1.getPrenom()+" "+g1.getNom()+" est : "+g1.calculerSalaireMensuel());
        System.out.println(g1);
        
        Compagnie comp1 = new Compagnie();
        
        comp1.setNomDeCompany("Company 1");
        comp1.ajouterEmploye(ep1);
        comp1.ajouterEmploye(et1);
        comp1.ajouterEmploye(g1);
        
        System.out.println("Le total salaire de "+comp1.getNomDeCompany()+" est : "+comp1.calculerSalaireDu());
        
    }
    
}
