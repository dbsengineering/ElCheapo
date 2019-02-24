M2 MIAGE - AOC - EXAMEN 2018
============================


EL CHEAPO
=========

# Introduction


Vous venez de rejoindre une société nommée SoESNTM. Cette société maintient le logiciel de l’entreprise
ElCheapoTM qui permet aux internautes de trouver le meilleur prix sur le Net pour un produit donné.

## Partie 1 - Hep, taxer !...

Le système de calcul du meilleur prix est actuellement codé dans une classe nommée GoodOlCheapo,
conforme à l’interface ElCheapo (voir en fin d’énoncé pour le squelette de ces types Java).
Malheureusement, la classe ElCheapo est maintenue par une équipe jalouse de son code et ce code ne
prend pas en compte dans le résultat le calcul de la TVA (retourne le prix HT), ce qui fait que les visiteurs
Internet ont la désagréable surprise de voir le prix final monter lors du paiement. Le taux de TVA à
appliquer est donné par un algorithme spécifique de la catégorie d’un produit. Pour chaque catégorie
l’algorithme est susceptible d’évoluer à tout moment, en raison de décisions du Ministère des Finances.
La catégorie d’un produit est une instance de la classe ProductCategory (voir en fin d’énoncé).

Vous êtes chargé(e) de modifier l’application pour prendre en compte la TVA. L’équipe de GoodOlCheapo
vous dit que vous n’avez qu’à sous-classer GoodOlCheapo et redéfinir des méthodes, mais connaissant le
peu de rigueur de l’équipe de GoodOlCheapo, vous savez que vous avez mieux à faire, sachant que vous
aurez à faire évoluer vos extensions, ainsi que les algorithmes de calcul du prix...


# Diagramme de classe. Design Pattern Decorator et Strategy

<img src="https://user-images.githubusercontent.com/8668325/53290133-48f7b880-37a0-11e9-9be0-8984eaa2780e.PNG" width="1084" height="470">
(Illustration : Diagramme de classe. Design Pattern Decorator et Strategy)


##Partie 2. Et toujours plus vite...

Vous réalisez que le système de calcul des meilleurs prix chez tel ou tel vendeur est en fait stocké dans une
base de donnée de marque DevinTM, lue par GoodOlCheapo. Vous faites remarquer au CTO de GigaESN
qu’une architecture parallèle et distribuée est bien mieux adaptée, les prix étant alors fournis à la volée par
les sites des vendeurs.
Le CTO vous prend au mot : vous avez deux heures maximum pour concevoir une nouvelle
implémentation de GoodOlCheapo qui emploie des requêtes asynchrones vers les différents vendeurs. On
dirait bien qu’il va falloir appliquer un patron supplémentaire...
Par ailleurs, comme les vendeurs sont interrogés en parallèle, la première offre retournée par le vendeur le
plus rapide à répondre servira pour le calcul de la meilleure offre retournée au visiteur. Pour interroger un
vendeur on peut obtenir l’ensemble des vendeurs via l’opération statique Vendors::getVendors, puis
employer l’opération synchrone Vendor::getPrice.

# Diagramme de classe. Ajout du design pattern ActiveObject


<img src="https://user-images.githubusercontent.com/8668325/53298328-82760580-382c-11e9-9383-ef6ce19912ac.png" width="1104" height="555">
(Illustration : Diagramme de classe. Design Pattern Active object)

Avec les librairies Java, certaines classes ont plusieurs rôles dans l'active object.

## Authors

* **Cavron Jérémy** - *Initial work* - [Portfolio](http://www.dbs.bzh/portfolio)


## Acknowledgments

* Project school. [Istic](https://istic.univ-rennes1.fr/) - university - Rennes 1.
