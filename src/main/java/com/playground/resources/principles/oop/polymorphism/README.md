# Principiul Polimorfismului

## Definiție

Polimorfismul este unul dintre cele patru principii fundamentale ale Programării Orientate pe Obiect (OOP). 
Acesta reprezintă **capacitatea unui obiect de a lua mai multe forme**, permițând apelarea aceleiași metode pe obiecte diferite, dar cu comportamente diferite, specifice fiecărei clase.

Polimorfismul permite:

- Tratarea obiectelor diferite printr-o **interfață comună**
- Definirea de metode generale care se comportă diferit în funcție de tipul obiectului
- Suprascrierea metodelor (`overriding`) în subclase pentru a personaliza comportamentul

Pe scurt:

> Polimorfismul înseamnă aceeași interfață, comportamente diferite.

## Scopul Polimorfismului

Polimorfismul are ca scop:

- Tratarea uniformă a obiectelor diferite
- Extinderea comportamentului fără modificarea codului existent
- Crearea de aplicații modulare, scalabile și ușor de întreținut
- Separarea interfeței de implementarea concretă

> Polimorfismul permite utilizarea aceleiași interfețe pentru comportamente diferite, făcând aplicațiile mai modulare și scalabile.

## Tipuri de Polimorfism

### 1. Polimorfism la timp de compilare (static)
- Se realizează prin **supraincarcarea metodelor** (`overloading`).
- Metoda apelată este determinată **în funcție de semnătura acesteia**.
- Exemple: mai multe metode `calculateFee(double)` și `calculateFee(double, int)` într-o clasă.

### 2. Polimorfism la timp de execuție (dinamic)
- Se realizează prin **suprascrierea metodelor** (`overriding`).
- Metoda apelată este determinată **în funcție de tipul real al obiectului la rulare**.
- Exemple: o interfață `BankService` cu metoda `processTransaction()`, implementată diferit de `CheckingService` și `CreditService`.

## Avantajele Polimorfismului

✔ Cod mai flexibil și reutilizabil  
✔ Permite tratarea obiectelor diferite prin aceeași interfață  
✔ Facilitează extensibilitatea aplicațiilor  
✔ Reduce duplicarea codului  
✔ Îmbunătățește mentenanța și scalabilitatea  
✔ Favorizează designul modular și orientat pe obiect

## Dezavantajele Polimorfismului

✖ Poate fi mai greu de înțeles pentru începători  
✖ Necesită planificare atentă a ierarhiilor de clase  
✖ Suprascrierea greșită poate cauza comportamente neașteptate  
✖ Polimorfismul static (overloading) poate duce la ambiguități dacă nu este bine proiectat

## Tabel Comparativ

| Tip Polimorfism | Momentul deciziei | Cum se aplică | Exemplu |
|-----------------|-----------------|---------------|---------|
| Static (compile-time) | La compilare | Supraincarcare metode (`overloading`) | `calculateFee(double)` vs `calculateFee(double, int)` |
| Dinamic (runtime)  | La execuție | Suprascriere metode (`overriding`) | `processTransaction()` diferit în `CheckingService` și `CreditService` |

## Sinteză

Fără polimorfism:

- Codul devine rigid și duplicat
- Modificările afectează mai multe clase
- Dificil de întreținut și extins

Cu polimorfism:

- Apeluri uniforme prin interfață
- Comportament specific fiecărui tip de obiect
- Cod modular, flexibil și clar

> Polimorfismul transformă clasele și obiectele într-un sistem coerent, flexibil și ușor de extins.