/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        // Initialisation des utilisateurs et des ressources
        ListUtilisateur listUtilisateur = new ListUtilisateur();
        Scanner scanner = new Scanner(System.in);

        CompteRenduActivite compteRenduActivite = new CompteRenduActivite("Les activités");
        CompteRenduVisite compteRenduVisite = new CompteRenduVisite("Les informations lors d'une visite");
        Modification modification = new Modification("Les modifications");

        // Connexion de l'utilisateur
        System.out.println("Nouveau utilisateur connecté");
        System.out.print("Veuillez entrer votre login : ");
        String login = scanner.nextLine();

        Utilisateur utilisateur = listUtilisateur.rechercherUtilisateur(login);

        if (utilisateur == null) {
            System.out.println("Utilisateur introuvable !");
            return;
        }

        // Récupération du rôle
        String role = "";
        if (utilisateur instanceof Etudiant) {
            role = ((Etudiant) utilisateur).getRole().getNomRole();
        } else if (utilisateur instanceof TuteurUniversitaire) {
            role = ((TuteurUniversitaire) utilisateur).getRole().getNomRole();
        } else if (utilisateur instanceof TuteurEntreprise) {
            role = ((TuteurEntreprise) utilisateur).getRole().getNomRole();
        }

        System.out.println("Bienvenue, " + utilisateur.getPrenom() + " " + utilisateur.getNom() + " (" + role + ") !");

        // Boucle pour les actions utilisateur
        while (true) {
            System.out.println("\nVeuillez choisir une méthode :");
            if (utilisateur instanceof Etudiant) {
                System.out.println("1. Envoyer un compte rendu des activités");
                System.out.println("2. Consulter le compte rendu des activités");
            } else if (utilisateur instanceof TuteurUniversitaire) {
                System.out.println("1. Consulter le compte rendu des activités");
                System.out.println("2. Envoyer le compte rendu d'une visite");
                System.out.println("3. Ajouter des modifications");
                System.out.println("4. Consulter le compte rendu d'une visite");
            } else if (utilisateur instanceof TuteurEntreprise) {
                System.out.println("1. Consulter le compte rendu d'une visite");
                System.out.println("2. Ajouter des modifications");
            }
            System.out.println("5. Envoyer un message");
            System.out.println("6. Se déconnecter");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    if (utilisateur instanceof Etudiant) {
                        ((Etudiant) utilisateur).envoyerCompteRenduActivite(compteRenduActivite);
                    } else if (utilisateur instanceof TuteurUniversitaire) {
                        ((TuteurUniversitaire) utilisateur).consulterCompteRenduActivite(compteRenduActivite);
                    } else if (utilisateur instanceof TuteurEntreprise) {
                        ((TuteurEntreprise) utilisateur).consulterCompteRenduVisite(compteRenduVisite);
                    }
                    break;

                case "2":
                    if (utilisateur instanceof Etudiant) {
                        ((Etudiant) utilisateur).consulterCompteRenduActivite(compteRenduActivite);
                    } else if (utilisateur instanceof TuteurUniversitaire) {
                        ((TuteurUniversitaire) utilisateur).envoyerCompteRenduVisite(compteRenduVisite);
                    } else if (utilisateur instanceof TuteurEntreprise) {
                        ((TuteurEntreprise) utilisateur).ajouterModification(modification);
                    }
                    break;

                case "3":
                    if (utilisateur instanceof TuteurUniversitaire) {
                        ((TuteurUniversitaire) utilisateur).ajouterModification(modification);
                    } else {
                        System.out.println("Action non implémentée pour ce rôle.");
                    }
                    break;
                
                case "4":
                    if (utilisateur instanceof TuteurUniversitaire) {
                        ((TuteurUniversitaire) utilisateur).consulterCompteRenduVisite(compteRenduVisite);
                    } else {
                        System.out.println("Action non implémentée pour ce rôle.");
                    }
                    break;

                case "5":
                    System.out.print("Entrez le contenu du message : ");
                    String contenu = scanner.nextLine();
                    System.out.print("Entrez le destinataire : ");
                    String destinataire = scanner.nextLine();

                    // Valider le destinataire
                    Utilisateur utilisateurDestinataire = listUtilisateur.rechercherUtilisateur(destinataire);

                    while (utilisateurDestinataire == null) {
                        System.out.println("Destinataire introuvable. Veuillez entrer un login valide :");
                        destinataire = scanner.nextLine();
                        utilisateurDestinataire = listUtilisateur.rechercherUtilisateur(destinataire);
                    }

                    Message message = new Message(contenu, utilisateur.getPrenom() + " " + utilisateur.getNom(), utilisateurDestinataire.getPrenom() + " " + utilisateurDestinataire.getNom());
                    utilisateur.interagir(message.toString());
                    break;

                case "6":
                    System.out.println(role + " " + utilisateur.getNom() + " est déconnecté.");
                    return;

                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
