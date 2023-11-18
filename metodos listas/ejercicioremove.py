# Lista inicial con elementos
frutas = ['manzana', 'banana', 'naranja', 'pera']

# Mostrar la lista antes de la eliminación
print("Lista original:", frutas)

# Eliminar una fruta específica si está presente
fruta_a_eliminar = 'manzana'
if fruta_a_eliminar in frutas:
    frutas.remove(fruta_a_eliminar)
    print(f"Se eliminó '{fruta_a_eliminar}' de la lista")
else:
    print(f"'{fruta_a_eliminar}' no está en la lista")

# Mostrar la lista resultante después de la eliminación o mensaje si la fruta no estaba presente
print("Lista después de eliminar:", frutas)
