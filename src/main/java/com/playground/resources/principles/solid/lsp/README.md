# Liskov Substitution Principle

## Definiție

Liskov Substitution Principle (LSP) este al treilea principiu din setul SOLID.
Acesta spune că **o clasă derivată trebuie să poată înlocui clasa de bază fără ca programul să își schimbe comportamentul corect**, adică orice cod care folosește clasa de bază trebuie să funcționeze corect și atunci când primește o clasă copil.

Pe scurt:

> LSP înseamnă orice clasă copil trebuie să se comporte ca părintele ei, fără surprize.

## Scopul LSP

LSP are ca scop:

- Construirea unor ierarhii de clase corecte, unde moștenirea reflectă un comportament real, nu doar o asemănare de nume
- Asigurarea faptului că o clasă derivată poate fi folosită oriunde este așteptată clasa de bază
- Prevenirea comportamentelor neașteptate sau a excepțiilor atunci când se folosește polimorfismul
- Evitarea moștenirii forțate, acolo unde o subclasă nu poate respecta întru totul contractul clasei părinte

## Problema identificată

Problema apare atunci când o clasă de bază definește un comportament pe care nu toate clasele derivate îl pot îndeplini. O subclasă este astfel forțată să moștenească o metodă pe care nu o poate implementa corect, fiind nevoită fie să arunce o eroare, fie să ofere un comportament invalid. Codul care folosește clasa de bază presupune că metoda respectivă funcționează pentru orice obiect derivat, însă această presupunere este falsă, iar programul devine instabil atunci când primește o astfel de subclasă.

## Soluția propusă

Soluția constă în refacerea ierarhiei de clase, astfel încât clasa de bază să conțină doar comportamentul cu adevărat comun tuturor claselor derivate. Comportamentele specifice, pe care nu toate subclasele le pot îndeplini, sunt mutate în abstractizări intermediare separate, câte una pentru fiecare categorie de comportament. Astfel, fiecare subclasă moștenește doar ceea ce poate implementa corect, iar codul client folosește metoda generală, comună tuturor, fără să mai presupună un comportament specific care nu este valabil peste tot.

Pe scurt:

> LSP se rezolvă prin restructurarea ierarhiei, astfel încât fiecare clasă să moștenească doar comportamentul pe care îl poate respecta cu adevărat.

## Avantajele LSP

- Ierarhii de clase mai corecte și mai realiste
- Elimină excepțiile și comportamentele neașteptate la substituirea claselor
- Codul client poate folosi clasa de bază fără să cunoască detaliile subclaselor
- Favorizează un polimorfism sigur și predictibil
- Crește stabilitatea și claritatea aplicației

## Dezavantajele LSP

- Poate necesita mai multe clase sau clase abstracte intermediare
- Proiectarea ierarhiei devine mai atentă și mai laborioasă
- Refactorizarea unei ierarhii existente, greșit construite, poate cere efort suplimentar

## Tabel comparativ

| Aspect | Fără LSP | Cu LSP |
|---|---|---|
| Comportament moștenit | Impus tuturor subclaselor, chiar dacă nu se potrivește | Doar comportamentul pe care subclasa îl poate respecta |
| Substituire clasă de bază → derivată | Poate provoca erori sau excepții | Funcționează corect, fără surprize |
| Structura ierarhiei | Simplă, dar incorectă | Mai atent structurată, cu abstractizări intermediare |
| Siguranța codului client | Scăzută, presupuneri greșite | Ridicată, comportament predictibil |
| Extensibilitate | Riscantă pentru cazuri speciale | Sigură, fiecare categorie are propria abstractizare |

## Concluzie

Principiul Liskov Substitution ajută la construirea unor ierarhii de clase corecte, în care o clasă derivată poate înlocui oricând clasa de bază fără să apară comportamente greșite. Varianta bună este corectă deoarece separă comportamentele specifice în abstractizări distincte, iar fiecare subclasă moștenește doar ceea ce poate implementa cu adevărat.
Fără LSP, moștenirea poate forța o subclasă să implementeze un comportament pe care nu îl poate realiza, ceea ce duce la erori și instabilitate. Cu LSP, orice obiect derivat poate fi folosit în locul clasei de bază, iar aplicația devine mai stabilă, mai clară și mai ușor de extins.