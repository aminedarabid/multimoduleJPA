# MultimoduleJPA

Les instructions suivantes ont pour but d'expliquer les étapes de déploiement de notre application.

Etape:
- importer la bdd
- generer le war
- déployer le war dans tomcat

Celle-ci a pour finalité de mettre en exergue les concepts suivant : maven, multimodule, jpa, transaction base de données.

Environnement:
- tomcat V7.0.56 (port defaut: 8080)
- Java V1.8
- maven V3.6
- mySQL v10.1.8

Lien Github: https://github.com/aminedarabid/multimoduleJPA

Récuperer le livrable:
- git clone https://github.com/aminedarabid/multimoduleJPA

Importer la base de données dans mysql "bdd.sql" qui se trouve dans le repertoire "livrable"

Pour générer le war:
- importer le projet dans eclipse
- excecute la  commande : mvn clen install

Pour déployer l'application multimoduleJPA: 
- demarrer tomcat 
- récuperer le war dans le projet : "monappli-web\target\monappli-web.war"
- deposer le war "monappli-web.war" dans le repertoire "webapps" de tomcat
- acceder a l'application via l'url "http://localhost:8080/monappli-web"
