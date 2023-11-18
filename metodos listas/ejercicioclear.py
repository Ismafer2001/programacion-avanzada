# Lista inicial con elementos
jugadores = ['Messi', 'Ronaldo', 'Neymar', 'Mbappé', 'Salah']

# Mostrar la lista antes de la eliminación
print("Lista original:", jugadores)

# Vaciar la lista utilizando clear()
jugadores.clear()
print("Lista después de clear():", jugadores)

# Verificar si la lista está vacía
if not jugadores:
    print("La lista de jugadores está vacía")
else:
    print("La lista de jugadores no está vacía")
