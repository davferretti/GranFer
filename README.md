**Descrizione**

Il nostro programma consiste in un servizio meteo che data una città
permette di visualizzare informazioni attuali relative al vento
(velocità e direzione), una previsione futura ogni 3 ore e alcune
statistiche. Le statistiche comprendono i valori minimi e massimi della
velocità e direzione del vento; la media e la varianza degli stessi.

Il programma utilizza delle API che permetto l'accesso a dati relativi
al meteo di un città inserita dall’utente.

**Diagrammi UML**

Diagramma dei casi d’uso:

![](media/image1.png){width="4.5989654418197725in" height="2.05in"}

Diagramma delle classi:![](media/image2.png){width="6.491666666666666in"
height="3.191666666666667in"}

Diagramma delle sequenze:

![](media/image3.png){width="6.3125in" height="2.453970909886264in"}

![](media/image4.png){width="6.291666666666667in"
height="2.716497156605424in"}

![](media/image5.png){width="6.3in" height="2.59375in"}

**Come funziona**

L'utente da in input il nome di una città, questo viene trascritto in un
file .json presente all'interno del progetto. Il programma prende dal
file il nome della città che viene utilizzato per prendere informazioni
dal server OpenWeather tramite l'API e crea un file formato json
presente all'interno del progetto. Successivamente attraverso l'utilizzo
di oggetti json e strutture dati (map) il programma estrae i dati
relativi al vento in cui ne calcola le statistiche e stampa il tutto con
il metodo Spring Boot GET.

In seguito il programma, con cadenza oraria, salva i dati relativi al
vento su un file presente nelle risorse all’interno del progetto.

**AUTORI**

Ferretti Davide

Granchelli Matteo