# Programmation fonctionnelle


## Programmation fonctionnelle - Définition

- Programmer avec des fonctions
  - assigner une fonction à une variable
  - passer une fonction comme paramètre
  - retourner une fonction
  - Lexical Closure (une fonction B dans une fonction A a accès aux variables de la fonction A)
    - concept apparu pour la 1ère fois en ... JavaScript
    - 👋 cf. 01-lexical-closure.js`
  - ... 
- Programmation fonctionnelle "pure" (le concept est mathématique)
  - chaque fonction, pour la même entrée, retournera toujours la même sortie (c'est différent de nos "fonctions en code")
    - 👋 cf. `02-pure-function.js`
  - on diminue les effets de bord
  - donc on fait disparaître pas mal de cas d'erreur (ce n'est pas toujours possible)
  
  
Il est tout à fait possible d'approcher la pureté en JavaScript (#troll ?)

Le principe central de la programmation fonctionnelle est l'immutabilité


## Monades

- Popularisée par la communauté Haskell
- La monade est maudite: une fois que vous avez cette révélation "ah mais oui c'est bien sûr", vous perdez la faculté de l'expliquer (Douglas Crockford - le meilleur "JavaScripteur" du monde)
  - https://www.youtube.com/watch?v=dkZFtimgAcM
 

## Exemples: je fais des monades en JavaScript 

à parcourir ensemble:

- `03-monades.js`
- `04-monades.js`
- `05-monades.js`

## Exercices Java - Partie 1

- Ecrire une fonction addition (s'inspirer de `src/package00`)
- Ecrire une monade en Java (utiliser les génériques)
  - compléter la classe `Monad` du package `functional` pour que:
    - `package01/Main` s'exécute
    - `package02/Main` s'exécute
    
## Une monade utile en Java: `Optional`

> ou comment éviter les null pointer exceptions

à parcourir ensemble:

- `package03`
- `package04`
   
    
## Exercices Kotlin - Partie 2

### Pré-requis

- Installer Kotlin (normalement il est "embarqué avec Intellij)
- Si vous n'utilisez pas Intellij:
  - https://kotlinlang.org/docs/tutorials/command-line.html

### Kotlin?

- Langage pour la JVM
- Créé par JetBrain
  -  https://kotlinlang.org/
- Kotlin == Java en mieux (troll?)
- Retenu par Google comme langage pour les applications Android
- ...


>- Java ce n'est pas que Java

à parcourir ensemble:

- `01-functions.kt`
- `02-when.kt`
- `03-classes.kt`
- `04-data-classes-collections.kt`

### Exercice : un Kebab (rapide)

Compléter `03-kotlin-sandbox/src/05-kebab.kt`

- faire une data class `Ingredient` avec 3 propriétés:
  - `val name: String`
  - `var price: Int =0`
  - `val vegetarian: Boolean`
 
- créer une `List` d'`Ingredient` appelée `kebabPlateBase` qui contiendra:
  - du `"pain"` avec un prix `=1` (précisez si c'est végétarien ou pas)
  - de la `"salade"` avec un prix `=1`
  - des `"tomates"` avec un prix `=2`
  - des `"oignons"` avec un prix `=1`

- créer une 2ème `List` (`kebabPlateCmd1`) à partir de `kebabPlateBase` en ajoutant:
  - du `"veau"` avec un prix `=4`
  - du `"riz"` avec un prix `=1`
  - des `"frites"` avec un prix `=2`
  
- En 1 seule commande (plusieurs commandes chaînées) donnez le prix du Kebab
- En 1 seule commande dites si le Kebab est végétarien (ou pas)
  


## Gestion des erreurs

à parcourir ensemble: le code du module `04-arrow`

> la lib utilisée est https://arrow-kt.io/

### Exercice 1

- Utilisez `Try` pout lire un fichier
- Ulilisez la lib https://www.vavr.io/ pour faire pareil mais en Java (en utilisant `Try.of`)


