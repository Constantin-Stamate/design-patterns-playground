# Single Responsibility Principle

## Definiție

Single Responsibility Principle (SRP) este primul dintre cele cinci principii SOLID din Programarea Orientată pe Obiect (OOP).
Acesta spune că **o clasă trebuie să aibă o singură responsabilitate principală** în aplicație, adică **un singur motiv de modificare**.
Dacă o clasă combină mai multe funcționalități diferite (de exemplu validare, salvare date, trimitere email), atunci codul devine mai greu de modificat, testat și întreținut.

Pe scurt:

> SRP înseamnă o clasă, o singură responsabilitate, un singur motiv de schimbare.

## Scopul SRP

SRP are ca scop:

- Separarea clară a responsabilităților în clase distincte
- Reducerea numărului de motive pentru care o clasă se poate modifica
- Creșterea testabilității și a mentenabilității codului
- Facilitarea reutilizării componentelor
- Reducerea impactului modificărilor asupra restului aplicației

## Problema identificată

Problema apare atunci când o singură clasă implementează direct mai multe operații diferite: validare, persistență și trimitere de email. Astfel, clasa are mai multe motive de modificare — dacă se schimbă regula de validare, dacă se schimbă modul de salvare în baza de date, sau dacă se schimbă conținutul emailului, în toate cazurile se modifică aceeași clasă. Aceste responsabilități diferite fiind concentrate într-un singur loc, codul devine mai greu de testat, mai greu de extins și mai expus la erori.

## Soluția propusă

Soluția constă în separarea responsabilităților în clase specializate, fiecare cu un singur rol și un singur motiv de modificare: o clasă pentru validare, o clasă pentru persistență și o clasă pentru trimiterea emailului. O clasă de coordonare doar folosește aceste componente pentru a realiza procesul complet, fără a implementa direct logica lor. Astfel, fiecare modificare afectează o singură clasă, iar componentele pot fi testate și reutilizate independent.

Pe scurt:

> SRP se rezolvă prin împărțirea unei clase supraîncărcate în mai multe clase mici, fiecare cu o singură responsabilitate.

## Avantajele SRP

- Cod mai clar și mai ușor de citit
- Testare mai simplă, deoarece fiecare clasă are un rol unic
- Modificări mai sigure — schimbarea unei reguli afectează o singură clasă
- Reutilizare mai bună a componentelor
- Extindere mai ușoară a aplicației

## Dezavantajele SRP

- Numărul de clase din proiect crește
- Poate părea, la început, o supra-fragmentare a codului
- Necesită o proiectare atentă pentru a stabili corect granițele responsabilităților

## Tabel comparativ

| Aspect | Fără SRP | Cu SRP |
|---|---|---|
| Responsabilități | Mai multe funcționalități în aceeași clasă | Fiecare responsabilitate într-o clasă dedicată |
| Motive de modificare | Multiple, în aceeași clasă | Un singur motiv per clasă |
| Testabilitate | Dificilă, greu de izolat logica | Ușoară, fiecare clasă se testează separat |
| Mentenanță | Riscantă, modificările se propagă | Sigură, impact limitat la o singură clasă |
| Reutilizare | Redusă | Ridicată |

## Concluzie

Principiul Single Responsibility Principle ajută la organizarea codului în clase mici, clare și ușor de întreținut. Varianta bună este corectă deoarece separă validarea, salvarea și trimiterea emailului în clase diferite, fiecare având un singur motiv de modificare.
Fără SRP, codul devine rigid, greu de testat și expus la erori atunci când mai multe funcționalități se schimbă simultan într-o singură clasă. Cu SRP, fiecare clasă are un rol bine definit, iar aplicația devine modulară, flexibilă și ușor de extins.