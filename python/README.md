1. Abrir la terminal de Git Bash o terminal en Linux, debe ser como administrador en Window

2. Creamos una carpeta o directorio: 

mkdir python-final

3. Entramos en ella: 

cd python-final

4. Iniciamos el repositorio:

git init

5. Creamos un archivo:

touch finales.py

6. Abrimos VSC:

code .

7. En terminal ingresamos el comando para saber la versión de Python que tenemos instalada:

python -V

python3 -V

8. Creamos el entorno virtual en Python:

python3 -m venv venv #Creamos el entorno virtual

9. Activamos el entorno virtual:

source venv/bin/activate #Activamos el entorno virtual en Linux

venv/scripts/activate #En windows

10. Hacemos actualización del pip de Python

python3 -m pip install --upgrade pip #Actualizamos el pip

11. Investigar ¿Qué es el pip y porque lo actualizamos?
    pip es el gestor de paquetes estándar de Python.
    ¿Para qué sirve? Te ahorra muchísimo tiempo y esfuerzo al permitirte usar soluciones ya creadas y probadas por la comunidad para tareas comunes como:

    Análisis de datos (pandas, numpy).

    Desarrollo web (Django, Flask).

    Machine Learning (TensorFlow, scikit-learn).

    Manipulación de imágenes (Pillow).

13. Hacer al primer commit de este trabajo y unirlo al repositorio remoto.
