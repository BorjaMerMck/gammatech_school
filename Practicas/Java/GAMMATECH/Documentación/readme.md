

<details>
  <summary>📌 ejercicio 1</summary>
     /* Estilos base del div */
     .mi-div {
        width: 100px;
        height: 100px;
        background-color: #3498db; /* Color azul */
        margin: 50px auto;
        transition: background-color 1s, transform 0.5s 1s; /* Transiciones */
    }

    /* Efectos al pasar el ratón por encima */
    .mi-div:hover {
        background-color: #e74c3c; /* Cambio de color a rojo */
        transform: scale(1) rotate(45deg); /* Escala y rotación */
    }
</details>
<details>
  <summary>📌 ejercicio 2</summary>
     /* Estilos base del div */
.mi-div {
    width: 100px;
    height: 100px;
    background-color: #3498db; /* Color azul */
    margin: 50px auto;
    transition: background-color 1s, transform 0.5s 1s; /* Transiciones */
    position: relative; /* Necesario para posicionar el h1 */
    display: flex;
    align-items: center;
    justify-content: center;
}

/* Estilos base del h1 */
.mi-div h1 {
    color: white; /* Color inicial del texto */
    font-size: 16px;
    margin: 0;
    transition: transform 1s, color 1s 1s; /* Transiciones */
}

/* Efectos al pasar el ratón por encima del div */
.mi-div:hover {
    background-color: #e74c3c; /* Cambio de color a rojo */
    transform: scale(1.2) rotate(45deg); /* Escala y rotación */
}

/* Efectos al pasar el ratón por encima del div (afecta al h1) */
.mi-div:hover h1 {
    transform: translateX(20px); /* Desplazamiento hacia la derecha */
    color: yellow; /* Cambio de color del texto */
}
</details>
<details>
  <summary>📌 ejercicio 3</summary>
     /* Estilos base del botón */


body{
    display: flex;
    justify-content: center;
    
}
.boton-magico {
    
    padding: 15px 30px; /* Espaciado interno */
    font-size: 18px; /* Tamaño de la fuente */
    color: white; /* Color del texto */
    background-color: #3498db; /* Color de fondo inicial (azul) */
    border: none; /* Sin borde */
    border-radius: 25px; /* Bordes redondeados */
    cursor: pointer; /* Cambia el cursor al pasar el ratón */
    transition: all 0.5s ease; /* Transición suave para todos los efectos */
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3); /* Sombra inicial */
}

/* Efectos al pasar el ratón por encima del botón */
.boton-magico:hover {
    background-color: #e74c3c; /* Cambio de color de fondo a rojo */
    transform: scale(1.1) rotate(5deg); /* Escala y ligera rotación */
    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.5); /* Sombra más pronunciada */
}

/* Efectos al hacer clic en el botón */
.boton-magico:active {
    transform: scale(0.9) rotate(-5deg); /* Escala hacia abajo y rotación inversa */
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.3); /* Sombra más suave */
}
</details>

<details>
  <summary>📌 ejercicio 4</summary>
     /* Estilos base del botón */


body{
    display: flex;
    justify-content: center;
    
}
.boton-magico {
    
    padding: 15px 30px; /* Espaciado interno */
    font-size: 18px; /* Tamaño de la fuente */
    color: white; /* Color del texto */
    background-color: #3498db; /* Color de fondo inicial (azul) */
    border: none; /* Sin borde */
    border-radius: 25px; /* Bordes redondeados */
    cursor: pointer; /* Cambia el cursor al pasar el ratón */
    transition: all 0.5s ease; /* Transición suave para todos los efectos */
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3); /* Sombra inicial */
}

/* Efectos al pasar el ratón por encima del botón */
.boton-magico:hover {
    background-color: #e74c3c; /* Cambio de color de fondo a rojo */
    transform: scale(1.1) rotate(5deg); /* Escala y ligera rotación */
    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.5); /* Sombra más pronunciada */
}

/* Efectos al hacer clic en el botón */
.boton-magico:active {
    transform: scale(0.9) rotate(-5deg); /* Escala hacia abajo y rotación inversa */
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.3); /* Sombra más suave */
}
</details>

<details>
  <summary>Ejercicio 5 </summary>
   
    /* Estilos base del body */

    /* Estilos base de la card */
     body {
        display: flex; /* Activa Flexbox */
        justify-content: center; /* Centra horizontalmente */
        align-items: center; /* Centra verticalmente */
        height: 100vh; /* Ocupa toda la altura de la pantalla */
        margin: 0; /* Elimina el margen predeterminado */
        background-color: #181313; /* Color de fondo opcional */
    }
    .card {
        width: 300px; /* Ancho de la card */
        height: 400px; /* Alto de la card */
        background-image: url('https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&auto=format&fit=crop&w=300&q=80'); /* Imagen de zapatillas */
        background-size: cover; /* Ajusta la imagen al tamaño de la card */
        background-position: center; /* Centra la imagen */
        border-radius: 15px; /* Bordes redondeados */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Sombra suave */
        overflow: hidden; /* Oculta el contenido que sobresale */
        position: relative; /* Para posicionar el contenido interno */
        transition: all 0.3s ease; /* Transición suave para todos los efectos */
    }

    /* Estilos del contenido dentro de la card */
    .contenido {
        position: absolute; /* Posiciona el contenido sobre la imagen */
        bottom: 0; /* Alinea el contenido en la parte inferior */
        left: 0; /* Alinea el contenido a la izquierda */
        right: 0; /* Alinea el contenido a la derecha */
        background: rgba(255, 255, 255, 0.9); /* Fondo semitransparente */
        padding: 20px; /* Espaciado interno */
        text-align: center; /* Centra el texto */
    }

    /* Estilos del título */
    .titulo {
        font-size: 24px; /* Tamaño de la fuente */
        margin: 0 0 10px; /* Margen inferior */
        color: #333; /* Color del texto */
    }

    /* Estilos del subtítulo */
    .subtitulo {
        font-size: 18px; /* Tamaño de la fuente */
        margin: 0 0 20px; /* Margen inferior */
        color: #777; /* Color del texto */
    }

    /* Estilos del botón de compra */
    .boton-comprar {
        padding: 10px 20px; /* Espaciado interno */
        font-size: 16px; /* Tamaño de la fuente */
        color: white; /* Color del texto */
        background-color: #3498db; /* Color de fondo inicial (azul) */
        border: none; /* Sin borde */
        border-radius: 25px; /* Bordes redondeados */
        cursor: pointer; /* Cambia el cursor al pasar el ratón */
        transition: all 0.3s ease; /* Transición suave para todos los efectos */
    }

    /* Efectos al pasar el ratón sobre la card */
    .card:hover {
        transform: scale(1.05); /* Aumenta ligeramente el tamaño */
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2); /* Sombra más pronunciada */
    }

    /* Efectos al pasar el ratón sobre el botón */
    .boton-comprar:hover {
        background-color: #e74c3c; /* Cambio de color de fondo a rojo */
        transform: scale(1.1); /* Aumenta ligeramente el tamaño */
    }
</details>
