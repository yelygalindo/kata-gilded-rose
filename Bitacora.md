En la Clase **GildedRose** existe mucho código repetido,
según un analisis vemos que la mejor alternativa es usa el 
patrón Factory combinado con Strategy.

Hemos creado una interfaz del cual deberian implementar todos nuestros 
comportamientos diferentes, hemos creado todos los comportamientos anteriores 
implementando la interfaz y hemos realizado una clase que crea la interfaz de acuerdo 
al tipo de producto que vamos a necesitar.


**Smell Codes**

Hemos encontrado los siguientes:

LongMethod: El metodo principal antes demasiado largo dificil de leer.

LargeClass: La clase principal antes era demasiada larga, dificil de entender el proposito.

CodeDuplication: Habia bastante código mal usado que practicamente estaba repetido, como tambien demasiados ifs.


**Principios no respetados**

No se respetaba el principio de responsabilidad unica(SRP) ya que en la clase se tenia toda la funcionalidad.

No se repetaba el prinicipio de abierto/cerrado(OCP) ya que en la clase anterior el metodo updateQuality() debía ser 
modificado para cada modificación, pudiendo afectar a los demás comportamientos.
