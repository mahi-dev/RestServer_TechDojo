# RestServer - TechDojo

Cette application permet de gérer un stock de voiture via une api REST.


## ENDPOINT:

| ENDPOINT | Methode | Parametre | retour | Utilisation | Exemple |
|:--------:|:-------:|:---------:|:------:|:-----------:|:-------:|
|**/api/car** | POST | JSON | boolean | Ajoute une voiture au stock | curl -X POST -H "Content-Type: application/json" -d '{"brand":"honda","model":"nsx","inStock":false}' http://localhost:9090/api/car
|
|**/api/car** | GET | **brand**<*String*> : la marque </br> **model**<*String*> : le modèle </br> **inStock**<*boolean*> : en stock ou non | boolean | Ajoute une voiture au stock |http://localhost:9090/api/car?brand=honda&model=nsx&inStock=false |
|**/api/car/list**|GET | 0 | Collection<*CarDTO*>|  liste toutes les voitures | http://localhost:9090/api/car/list
|**/api/car/list/{brand}**|GET | 0 | Collection<*CarDTO*> |  liste les voitures filtrées par marque | http://localhost:9090/api/car/list/honda
|**/api/car/stock/list**|GET | 0 | Collection<*CarDTO*> |  liste les voitures en stock | http://localhost:9090/api/car/stock/list
