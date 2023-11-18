# Crear una lista vacía para almacenar números pares
numeros_pares = []

# Agregar números pares usando append()
for i in range(1, 11):
    if i % 2 == 0:
        numeros_pares.append(i)

# Mostrar la lista resultante de números pares
print("Números pares:", numeros_pares)
