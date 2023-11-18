# Lista inicial
numeros = [10, 20, 30, 40, 50]

# Mostrar la lista antes de la eliminación
print("Lista original:", numeros)

# Eliminar un elemento en una posición específica utilizando pop()
posicion_a_eliminar = 2
if posicion_a_eliminar < len(numeros):
    numero_eliminado = numeros.pop(posicion_a_eliminar)
    print(f"Se eliminó el número {numero_eliminado} en la posición {posicion_a_eliminar}")
else:
    print("La posición a eliminar está fuera del rango de la lista")

# Mostrar la lista resultante después de la eliminación o mensaje si la posición estaba fuera de rango
print("Lista después de eliminar:", numeros)
