# Principiul Moștenirii

## Definiție

Moștenirea este unul dintre cele patru principii fundamentale ale Programării Orientate pe Obiect (OOP). 
Moștenirea reprezintă mecanismul prin care o clasă nouă (subclasă) poate prelua atributele și metodele unei clase existente (superclasă). 
Acest lucru permite reutilizarea codului și extinderea comportamentului fără a modifica clasa de bază.

Pe scurt:

> Moștenirea înseamnă reutilizarea și extinderea comportamentului unei clase existente.

## Scopul Moștenirii

Scopul principal al moștenirii este:

- Reutilizarea codului existent
- Reducerea duplicării codului
- Extinderea funcționalităților fără modificarea clasei de bază
- Crearea unor relații clare între clase (IS-A)
- Organizarea logică a ierarhiilor de clase

> Moștenirea ajută la construirea unui sistem bine structurat și ușor de extins.

## Tipurile de Moștenire

În Programarea Orientată pe Obiect există mai multe tipuri de moștenire:

### 1. Moștenire simplă
- O subclasă moștenește o singură superclasă.
- Este cel mai frecvent tip de moștenire.
- Java suportă direct acest tip.

### 2. Moștenire pe mai multe niveluri
- O clasă moștenește o clasă care la rândul ei moștenește altă clasă.
- Se formează o ierarhie pe mai multe niveluri.

### 3. Moștenire ierarhică
- Mai multe subclase moștenesc aceeași superclasă.
- Permite specializarea aceluiași comportament de bază.

### 4. Moștenire multiplă
- O clasă moștenește mai multe superclase.
- Java nu permite moștenirea multiplă prin clase, dar o permite prin interfețe.

## Tabel Comparativ

| Tip de Moștenire | Descriere | Structură | Suport în Java |
|------------------|-----------|-----------|----------------|
| Simplă (Single) | O subclasă moștenește o singură superclasă | A → B | ✓ Da |
| Pe mai multe niveluri (Multilevel) | Moștenire în lanț | A → B → C | ✓ Da |
| Ierarhică (Hierarchical) | Mai multe clase derivă din aceeași clasă | A → B<br>A → C | ✓ Da |
| Multiplă (Multiple) | O clasă moștenește mai multe clase | A, B → C | ✗ Nu prin clase<br>✓ Da prin interfețe |

## Avantajele Moștenirii

✔ Reutilizarea codului  
✔ Reducerea duplicării  
✔ Extensibilitate ridicată  
✔ Organizare clară a ierarhiei claselor  
✔ Permite specializarea comportamentului  
✔ Îmbunătățește mentenanța aplicației

## Dezavantajele Moștenirii

✖ Poate crea dependențe puternice între clase  
✖ Ierarhii prea complexe pot deveni greu de întreținut  
✖ Modificările în superclasă pot afecta subclasele  
✖ Utilizarea incorectă poate duce la design rigid

## Sinteză

Fără moștenire:

- Cod duplicat în mai multe clase
- Modificările trebuie făcute în mai multe locuri
- Design rigid și greu de extins

Cu moștenire:

- Cod reutilizabil și organizat
- Relații clare între clase
- Extindere ușoară a funcționalităților
- Reducerea duplicării codului

> Moștenirea transformă clasele individuale într-un sistem ierarhic coerent, flexibil și ușor de extins.