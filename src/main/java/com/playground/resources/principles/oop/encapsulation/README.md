# Principiul Încapsulării

## Definiție

Încapsularea este unul dintre cele patru principii fundamentale ale Programării Orientate pe Obiect (OOP).
Încapsularea reprezintă mecanismul prin care datele interne ale unui obiect sunt ascunse față de exterior, iar accesul la acestea este permis doar prin metode controlate.

Un obiect bine încapsulat:
- Își protejează starea internă
- Controlează modul în care este modificată
- Impune reguli și validări
- Nu permite acces direct la implementarea internă

Pe scurt:

> Încapsularea înseamnă protejarea datelor și controlul accesului la acestea.

## Scopul Încapsulării

Scopul principal al încapsulării este:

- Protejarea integrității datelor
- Prevenirea modificărilor necontrolate
- Menținerea consistenței obiectelor
- Impunerea regulilor de business în interiorul clasei
- Separarea clară între interfață și implementare
- Reducerea dependențelor dintre componente

> Încapsularea asigură faptul că un obiect nu poate ajunge într-o stare invalidă.

## Modificatori de acces

Încapsularea este realizată prin utilizarea modificatorilor de acces, care controlează vizibilitatea
atributelor și metodelor.

### public
- Accesibil de oriunde.
- Se folosește pentru a expune comportamentul unui obiect.
- Nu este recomandat pentru câmpuri (atribute).

### protected
- Accesibil în aceeași clasă.
- Accesibil în clase derivate (subclase).
- De obicei utilizat în ierarhii de moștenire.

### default (package-level)
- Accesibil doar în interiorul aceluiași modul sau pachet.
- Oferă protecție la nivel de grup de clase.

### private
- Accesibil doar în interiorul aceleiași clase.
- Cel mai restrictiv modificator.
- Esențial pentru implementarea încapsulării.

## Tabel Comparativ

| Modificator | Aceeași Clasă | Package | Subclasă | Oricine |
|-------------|:-------------:|:-------:|:--------:|:-------:|
| public      | ✓ | ✓ | ✓ | ✓ |
| protected   | ✓ | ✓ | ✓ | ✗ |
| default     | ✓ | ✓ | ✗ | ✗ |
| private     | ✓ | ✗ | ✗ | ✗ |

## Avantajele Încapsulării

✔ Protejează integritatea datelor  
✔ Previne modificările accidentale  
✔ Impune validări și reguli de business  
✔ Reduce riscul de erori  
✔ Permite modificarea implementării fără a afecta codul extern  
✔ Reduce cuplarea (low coupling)  
✔ Îmbunătățește mentenanța și lizibilitatea codului  
✔ Crește securitatea aplicației  
✔ Favorizează un design modular și scalabil

## Dezavantajele Încapsulării

✖ Necesită mai mult cod pentru metode de acces  
✖ Poate crește complexitatea inițială a designului  
✖ Necesită planificare atentă a structurii claselor  
✖ Poate părea restrictivă pentru dezvoltatorii începători

## Sinteză

Încapsularea este fundamentul unui sistem orientat pe obiect stabil și sigur.

Fără încapsulare:
- Datele pot fi modificate direct și necontrolat
- Obiectele pot ajunge în stări invalide
- Sistemul devine dificil de întreținut

Cu încapsulare:
- Starea obiectelor este protejată
- Regulile sunt respectate
- Codul este mai sigur, mai clar și mai ușor de extins

> Încapsularea transformă simple structuri de date în obiecte autonome, sigure și bine definite.