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


# Diagramme de classe. Pattern Decorator et Strategy

<img src="https://user-images.githubusercontent.com/8668325/53290133-48f7b880-37a0-11e9-9be0-8984eaa2780e.PNG" width="1084" height="470">
(Illustration : Diagramme de classe. Pattern Decorator et Strategy)

## Authors

* **Cavron Jérémy** - *Initial work* - [Portfolio](http://www.dbs.bzh/portfolio)


## Acknowledgments

* Project school. [Istic](https://istic.univ-rennes1.fr/) - university - Rennes 1.
