# Demo Version 5
Demo con implementacion de patrones Abstract factory, Builder, Decorador, Strategy, State, Prototype, Chain of responasibility.

Este es un juego de peleas, en deonde cada golpe que se le de a un personaje, se le ira bajando la vida y la velocidad con que se puede mover, existen diferentes iconos,(En los diagramas los llamamos poderes), que dan diferentes habilidades aplicando los patrones, para activar los "poderes solo es necesario pasar por el icono".Y son los siguientes:

1 Sacar un clone: Aplicando el patron Prototype se le asigna un clone al jugador que primero adquiera este poder, este clone podra coger los iconos para activar los otros iconos.

2 Subir vida: Si el jugador se le a bajado la vida, podra recuperarla aca, en este caso se aplica el patron chain of responsability, que es el encargado de esta parte, mas adelnate se explicara mas acerca de esto.

3 Teletransportartarse: Al tocar este icono se cambia el estado del personaje haciendo que pueda teletransportarse, esto para poder dirigirse mas rapido, para esto se utiliza el patron state, el cual cambia el estado del personaje.

4 Agrandar: Con este poder se agrandara el tamaño del personaje y podra hacer mas daño con cada golpe, para esto se utlizo el patron Decorador para ponerle una envoltura al personaje y modificar su tamaño, y el patron Chain of responsability para poder lograr que asi baje mas vida.

El control de la vida se maneja con el patron chain of responsability que tiene 3 opciones, bajar vida, cuando se recibe un golpe, bajar el doble de vida, cuando se recibe un golpe con el poder de agrandar y subir vida, cuando se coge el icono de subir vida.

El patron strategy se utiliza cuando se coge alguna opcion en el mapa, (exceptuando el cambio de estado y sacar clone) para identificarque estrategia se tiene que aplicar al coger estos iconos.

El patron memento no se utilizo debido a que no hay necesidad de un check point en un juego de peleas, dado que si se muere alguno se puede volver a reiniciar.

Andres Felipe Wilches Torres - 20172020114
Juan David Montes Martinez - 20172020141
Nicolas Andrade Perdomo - 20172020097
