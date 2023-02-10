EJERCICIO EN CLASE: FECHA 08/02/2023
Puntaje: 10 Puntos
Haz una clase llamada Cerveza que cumpla las siguientes especificaciones:
● Sus atributos son: id, marca, fecha de fabricación, fecha de vencimiento, materia prima
(C cebada, T trigo, M malta), cantidad contenido establecida (cc o ml), cantidad
contenido real. No queremos que se accedan directamente a ellos. Piensa qué modificador
de acceso es el más adecuado, también su tipo de datos. Si quieres añadir algún atributo
puedes hacerlo.
● Por defecto, todos los atributos menos el id serán inicializados con sus valores por defecto
según su tipo (0 números, null para String, la fecha del sistema para LocalDate: deberán
investigarlo, etc.). materia prima será cebada por defecto, usa una constante para ello.
● Se implementarán varios constructores:
○ Un constructor por defecto.
○ Un constructor con la marca, materia prima y la cantidad contenido real, el resto
por defecto.
○ Un constructor con todos los atributos como parámetro, excepto id.

● Los métodos que se implementarán son:

○ calcularCantidad(): calculará si la cerveza tiene la cantidad especificada,
○ devuelve un -1 si la cantidad de contenido real está por debajo de la cantidad de
contenido establecida,
○ un 0 si ambas cantidades son iguales y un
○ 1 si tiene más cantidad real que la establecida. Te recomiendo que uses
constantes para devolver estos valores.|
○ estaVencida(): indica si el producto está vencido, devuelve un booleano.
○ comprobarMateriaPrima(char materiaPrima): comprueba que la materia prima
introducida es correcta. Si no es correcta, será C. No será visible al exterior.
○ toString(): devuelve toda la información del objeto. SÓLO SI NO SE USA ENUM
○ generarID(): genera un número aleatorio de 8 cifras como máximo (analizar el
tipo de datos a ser utilizado). Este método será invocado cuando se construya el
objeto. Puedes dividir el método para que te sea más fácil. No será visible al
exterior.
○ Métodos get/set de cada parámetro, excepto de ID.

Ahora, crea una clase ejecutable que haga lo siguiente:
● Crea 3 objetos de la clase anterior, invocando a cada constructor, para el objeto creado con el
constructor por defecto utiliza los métodos set para darle a los atributos un valor.
● Para cada objeto, deberá comprobar si tiene la cantidad real igual a la establecida, tiene más
cantidad real o menos cantidad real que la establecida, con un mensaje.
● Indicar para cada objeto si está vencido.
● Por último, mostrar la información de cada objeto.