# Interface Segregation Principle

## Definiție

Interface Segregation Principle (ISP) este al patrulea principiu din setul SOLID.
Acesta spune că **o clasă nu trebuie să fie obligată să implementeze metode pe care nu le folosește**, adică interfețele mari trebuie împărțite în interfețe mai mici și mai specifice.

Pe scurt:

> ISP înseamnă interfețe mici și specifice, nu una singură care face totul.

## Scopul ISP

ISP are ca scop:

- Evitarea dependenței claselor de metode pe care nu le folosesc
- Crearea unor interfețe clare, care reflectă corect comportamentul real al claselor
- Creșterea flexibilității, deoarece o clasă implementează doar ce are nevoie
- Reducerea codului inutil sau a metodelor goale, fără sens funcțional

## Problema identificată

Problema apare atunci când există o interfață mare, care combină mai multe comportamente diferite într-un singur loc. Orice clasă care implementează această interfață este obligată să ofere o implementare pentru toate metodele, chiar dacă unele dintre ele nu au legătură cu funcționalitatea ei reală. Astfel, apar metode inutile, goale sau care doar semnalează că funcționalitatea nu este suportată, iar interfața nu mai reflectă corect capacitățile reale ale claselor care o implementează.

## Soluția propusă

Soluția constă în împărțirea interfeței mari în mai multe interfețe mici și specifice, fiecare descriind un singur comportament. Fiecare clasă implementează doar interfețele care corespund funcționalităților pe care le suportă cu adevărat, iar o clasă mai complexă poate implementa mai multe interfețe mici, dacă suportă toate acele comportamente. Astfel, nicio clasă nu mai este obligată să depindă de metode pe care nu le folosește.

Pe scurt:

> ISP se rezolvă prin împărțirea unei interfețe mari în interfețe mici, fiecare clasă implementând doar ce are nevoie.

## Avantajele ISP

- Clasele nu mai depind de metode inutile
- Interfețele reflectă mai corect comportamentul real al claselor
- Cod mai clar și mai ușor de citit
- Flexibilitate mai mare la adăugarea de noi tipuri de clase
- Reduce riscul metodelor goale sau al erorilor de tip „not supported”

## Dezavantajele ISP

- Numărul de interfețe din proiect crește
- Poate fi necesară o analiză atentă pentru a grupa corect comportamentele
- Pentru proiecte foarte simple, separarea poate părea o organizare excesivă

## Tabel comparativ

| Aspect | Fără ISP | Cu ISP |
|---|---|---|
| Structura interfeței | O singură interfață mare, cu multe metode | Mai multe interfețe mici, specifice |
| Metode neutilizate | Clasele sunt obligate să le implementeze | Clasele implementează doar ce folosesc |
| Claritatea codului | Scăzută, apar metode goale sau inutile | Ridicată, fiecare interfață are un scop clar |
| Flexibilitate | Limitată | Ridicată, se pot combina mai multe interfețe mici |
| Mentenanță | Dificilă, modificările afectează toate clasele | Ușoară, fiecare interfață este independentă |

## Concluzie

Principiul Interface Segregation ajută la crearea unor interfețe mici, clare și ușor de utilizat. Varianta bună este corectă deoarece împarte comportamentele diferite în interfețe separate, iar fiecare clasă implementează doar funcționalitățile de care are nevoie.
Fără ISP, clasele sunt forțate să depindă de metode inutile, ceea ce duce la cod confuz și greu de întreținut. Cu ISP, fiecare clasă rămâne simplă și clară, iar aplicația devine mai flexibilă și mai ușor de extins cu noi tipuri de dispozitive sau comportamente.