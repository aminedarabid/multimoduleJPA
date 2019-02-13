# MultimoduleJPA

Les instructions suivantes ont pour but d'expliquer les étapes de déploiement de notre application.

Les étapes:
- importer la bdd
- generer le war
- déployer le war dans tomcat

Celle-ci a pour finalité de mettre en exergue les concepts suivant : maven, multimodule, jpa, transaction base de données.

Environnement:
- tomcat V7.0.56 (port defaut: 8080)
- Java V1.8
- maven V3.6
- mySQL v10.1.8

Récuperer le projet:
- git clone https://github.com/aminedarabid/multimoduleJPA

***********************************************************************************************************************************
Etape 1 : Importer la bdd
***********************************************************************************************************************************
Importer la base de données dans mysql "bdd.sql" qui se trouve dans le repertoire "bdd"

***********************************************************************************************************************************
Etape 2 : Generer le war
***********************************************************************************************************************************
Pour générer le war:
- exécute la  commande : mvn clean install

***********************************************************************************************************************************
Etape 3 : déployer le war dans tomcat
***********************************************************************************************************************************
Pour déployer l'application multimoduleJPA: 
- demarrer tomcat 
- récuperer le war dans le projet : "monappli-web\target\monappli-web.war"
- deposer le war "monappli-web.war" dans le repertoire "webapps" de tomcat
- acceder a l'application via l'url "http://localhost:8080/monappli-web"
