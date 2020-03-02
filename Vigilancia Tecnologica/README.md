Vigilancia tecnologica

Repositorio Correspondiente a la materia Gestion Tecnologica

Jeisson Steven Rincón Mellizo 20152020087

Carlos Santiago Rojas Moreno 20152020095

David Leonardo Acero Camargo 20151020090

primera forma de instalacion:
-----------------------------------------

descargar el archivo hontza.tar del siguiente link(1.8Gb):
https://drive.google.com/drive/folders/1WL7XxC0RgqNqyA_KFeWeR9emYm4E-oY4?usp=sharing

una vez descargado nos ubicamos en la carpena en la que lo descargamos e ingresamos el siguiente comendoen la terminal. 
hay que tener docker instalado previamente

$ docker import - hontza < hontza.tar

esto nos creara una imagen en el docker ahora para lanzar la imagen escribimos lo siguiente:

$ docker run -it hontza:latest /bin/bash

esto nos ingresa a un ubuntu dockerizado con terminal, por ultimo en esta terminalescribimos lo siguiente:

$ service apache2 start

para que el servicio de apache este arriba.

ahora solo ingresamos desde el navegador en la siguiente url:

172.17.0.2/hontza

y listo 

usuario:admin

contraseña:hontza

SEGUNTA FORMA DE INSTALACION
--------------------------------------------
ingrese al sigueinte link y descarga el archivo (2.1Gb):
https://mega.nz/#!0xIAUaZB!HcPo4yjGYIIzLffooymwjRP7f3JRnl13Rvvg8iqZG3g

instala una maquina virtual como virtualbox.

en la pestaña de archivo seleciona importar servicio virtualizado.
y selecciona el archivo que descargamos 

y listo
para ingresar hay que escribir en el navegador el localhost de la maquina virtualizada / hontza

usuario:admin

contraseña:hontza

