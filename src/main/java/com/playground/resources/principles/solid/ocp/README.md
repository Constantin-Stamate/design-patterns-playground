# Open/Closed Principle

## Definiție

Open/Closed Principle (OCP) este al doilea principiu din setul SOLID.
Acesta spune că **o clasă trebuie să fie deschisă pentru extindere, dar închisă pentru modificare**, adică putem adăuga funcționalități noi fără să schimbăm codul deja existent.

Pe scurt:

> OCP înseamnă adăugăm cod nou, nu modificăm codul vechi.

## Scopul OCP

OCP are ca scop:

- Permiterea adăugării de funcționalități noi fără riscul de a strica codul existent
- Reducerea numărului de modificări asupra claselor deja testate și folosite
- Creșterea flexibilității aplicației atunci când apar cerințe noi
- Favorizarea utilizării interfețelor și a abstractizărilor în locul condițiilor multiple

## Problema identificată

Problema apare atunci când o clasă conține direct toate regulile pentru fiecare caz posibil, de exemplu sub formă de instrucțiuni `if` succesive pentru fiecare tip de client. Dacă apare un caz nou, clasa trebuie modificată și trebuie adăugată o nouă condiție. Astfel, clasa nu este închisă pentru modificare, deoarece trebuie schimbată constant pe măsură ce aplicația se dezvoltă, ceea ce crește riscul de erori și face codul mai greu de întreținut.

## Soluția propusă

Soluția constă în definirea unei interfețe comune pentru comportamentul care variază, iar fiecare caz este implementat într-o clasă separată care respectă acea interfață. Clasa principală nu mai conține condiții pentru fiecare caz, ci doar folosește interfața pentru a delega calculul către implementarea potrivită. Astfel, pentru un caz nou nu se mai modifică nicio clasă existentă — se adaugă doar o clasă nouă care implementează interfața.

Pe scurt:

> OCP se rezolvă prin extragerea comportamentului variabil într-o interfață, iar fiecare caz nou devine o clasă nouă, fără a atinge codul deja existent.

## Avantajele OCP

- Cod mai flexibil, ușor de extins cu funcționalități noi 
- Risc mai mic de a introduce erori în codul deja testat 
- Elimină condițiile multiple și înlănțuite 
- Favorizează utilizarea interfețelor și a design-ului orientat pe abstractizări 
- Mentenanță mai ușoară pe termen lung 

## Dezavantajele OCP

- Numărul de clase din proiect crește
- Poate adăuga complexitate suplimentară pentru cazuri simple, care nu se extind des
- Necesită o proiectare atentă a interfețelor de la început

## Tabel comparativ

| Aspect | Fără OCP | Cu OCP |
|---|---|---|
| Adăugare caz nou | Se modifică clasa existentă | Se adaugă o clasă nouă |
| Risc de erori | Ridicat, codul vechi este atins | Scăzut, codul vechi rămâne neschimbat |
| Structură | Condiții multiple (`if`/`else`) | Interfață comună + implementări separate |
| Extensibilitate | Limitată | Ridicată |
| Mentenanță | Dificilă pe termen lung | Ușoară, fiecare caz e izolat |

## Concluzie

Principiul Open/Closed ajută la extinderea aplicației fără a modifica codul deja existent și testat. Varianta bună este corectă deoarece separă fiecare regulă într-o clasă proprie, iar clasa principală lucrează doar prin intermediul unei interfețe comune.
Fără OCP, orice funcționalitate nouă obligă la modificarea codului existent, ceea ce crește riscul de erori. Cu OCP, aplicația devine deschisă pentru extindere și închisă pentru modificare, iar adăugarea unor reguli noi se face prin cod nou, nu prin schimbarea celui vechi.