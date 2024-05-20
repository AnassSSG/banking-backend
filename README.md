# Projet Spring Angular JWT
## Introduction
Digital Banking est une application destinée à la gestion des comptes bancaires. Chaque compte est rattaché à un client et peut effectuer plusieurs types d'opérations, telles que des débits et des crédits. L'application supporte deux catégories de comptes : les comptes courants et les comptes d'épargne.
Le projet est structuré en deux segments principaux : un backend développé avec Spring Boot et un frontend créé avec Angular.
## Backend 
### Couche DAO :
La couche DAO implique la création des entités JPA telles que Customer, BankAccount, SavingAccount, CurrentAccount, et AccountOperation. Elle inclut également la définition des interfaces JPA Repository basées sur Spring Data. <br> <br>
![Screenshot 2024-05-20 004734](https://github.com/AnassSSG/banking-backend/assets/133109998/eca0b38b-8707-4bdf-9ba3-3c5b6cc8aa45)
![Screenshot 2024-05-20 004813](https://github.com/AnassSSG/banking-backend/assets/133109998/0b9900fc-ffdb-4de7-b6e2-31c955aaaf42)
### Couche service et Web :
La mise en place de la couche service comprend la création des DTOs , des Mappers et les classes services. En parallèle, des RestController sont créés pour fournir des services web RESTful.<br> <br>
![Screenshot 2024-05-20 005346](https://github.com/AnassSSG/banking-backend/assets/133109998/fd0dd3b1-a530-4310-b529-68e2225de401)
![Screenshot 2024-05-20 005443](https://github.com/AnassSSG/banking-backend/assets/133109998/664c6f04-8859-4736-b7fb-205d35edee57)
![Screenshot 2024-05-20 005422](https://github.com/AnassSSG/banking-backend/assets/133109998/6f164562-2935-45af-bfe8-df5ca597b5af)
### Gestion des exceptions :
Mise en place des exceptions pour les cas suivants :
- Balance insuffisante
- Compte bancaire non trouvé
- Client non trouvé <br> <br>
![Screenshot 2024-05-20 005913](https://github.com/AnassSSG/banking-backend/assets/133109998/975cc3e4-6b92-4a8c-a2dc-305048ca3a18)
### Documentation des API REST :
Intégration de Swagger pour documenter les API REST. <br> <br>
![Screenshot 2024-05-20 010802](https://github.com/AnassSSG/banking-backend/assets/133109998/f7f36209-b70c-4581-adf0-e9b4ea6e0ff6)

### Sécurité :
Mise en place d'un système d'authentification utilisant Spring Security et JSON Web Token (JWT).<br> <br>
![Screenshot 2024-05-20 011104](https://github.com/AnassSSG/banking-backend/assets/133109998/d22e3203-d021-48cd-9356-e81c3f04e965)

## Frontend
### Fonctionnalités :
- Authentification et déconnexion
- Gestion des clients : ajout, suppression, édition, recherche
- Gestion des comptes : recherche, gestion des opérations
- Gestion des rôles et des accès 
- Gestion des exceptions
### Exemples des interfaces :

#### 1- Page d'authentification :
<br> <br>
![Screenshot 2024-05-20 012341](https://github.com/AnassSSG/banking-backend/assets/133109998/34514457-977d-4110-a807-8b99c4ef1603)
<br> <br>
#### 2- Liste des clients : 
<br> <br>
#####  a- Admin:
<br> <br>
![Screenshot 2024-05-20 012436](https://github.com/AnassSSG/banking-backend/assets/133109998/da4580ce-64af-4ace-9bd2-3fc71306d1ae)
<br> <br>
#####  b- User: 
<br> <br>
![Screenshot 2024-05-20 012528](https://github.com/AnassSSG/banking-backend/assets/133109998/823c682b-b65c-4b86-8cd2-8620a9db4f59)
<br> <br>

#### 3- Liste des comptes d'un client : 
<br> <br>
![Screenshot 2024-05-20 012658](https://github.com/AnassSSG/banking-backend/assets/133109998/68ec5d82-33fc-4f2a-bf29-b5f0753e9d00)
<br> <br>
#### 4- Addition d'un client : 
<br> <br>
![Screenshot 2024-05-20 012835](https://github.com/AnassSSG/banking-backend/assets/133109998/b0d48670-afe0-4d70-a447-c578c01b779b)
<br> <br>
#### 5- Suppresion d'un client : 
<br> <br>
![Screenshot 2024-05-20 012910](https://github.com/AnassSSG/banking-backend/assets/133109998/b092e1e5-afbe-4d6f-955e-8136315f796e)
<br> <br>
#### 6- Modification d'un client : 
<br> <br>
![Screenshot 2024-05-20 012946](https://github.com/AnassSSG/banking-backend/assets/133109998/7e86708c-b7c0-423a-adae-846acef34cb6)
<br> <br>
#### 7- Recherche d'un compte et gestion des opérations : 
<br> <br>
![Screenshot 2024-05-20 013045](https://github.com/AnassSSG/banking-backend/assets/133109998/57011398-052b-4e8e-b488-606f85630b81)

## Conclusion
Le projet Digital Banking offre une solution moderne et sécurisée pour la gestion des comptes bancaires. Avec son architecture solide basée sur Spring Boot et Angular, il fournit une expérience utilisateur fluide et réactive. Grâce à des fonctionnalités avancées telles que la gestion des clients et des comptes, ainsi que la sécurité renforcée par Spring Security et JWT, l'application répond aux besoins actuels du secteur bancaire. En résumé, Digital Banking représente une solution complète et efficace pour la gestion bancaire en ligne.







