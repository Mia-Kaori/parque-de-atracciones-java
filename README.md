# Parque de Atracciones — Java (POO + Interfaces + Colecciones)

Práctica del módulo **Programación** (DAW).  
Gestión de una pequeña feria con tres atracciones, feriantes, cuadrante semanal y cálculo de ganancias. Aplica interfaces, ArrayList y matrices.

## Enunciado

Una feria con tres atracciones (Tío Vivo, Noria y Coches de Choque) que tienen precio por ticket y precio de bono con descuento. El programa ofrece un menú para gestionar feriantes, asignar quién lleva cada atracción cada día, y calcular ganancias aleatorias de la semana.

Precios:
- Tío Vivo: 2,5€/ticket · Bono 6 tickets al 80% = 12€
- Noria: 4€/ticket · Bono 5 tickets al 90% = 18€
- Coches de Choque: 2,5€/ticket · Bono 10 tickets al 60% = 15€

##  Clases

### `Abono` (interfaz)
- **Método:** `precioAbono()` — contrato para calcular el precio del bono

### `Atraccion` (implements Abono)
- **Atributos:** `nombre`, `precioticket`, `numeroTickets`, `descuento`
- **Métodos:** `precioAbono()` — precio × tickets × descuento, getters/setters, `toString()`

### `Feriante`
- **Atributos:** `nombre`, `apellido`, `edad`
- **Métodos:** getters/setters, `toString()`

### `Cuadrante`
- **Atributos:** `dia`, `feriante`, `atraccion`
- **Métodos:** getters/setters, `toString()`

### `Main`
- Menú con 6 opciones: muestra de precios, añadir/eliminar feriantes, asignar cuadrante, mostrar cuadrante y ganancias
- Gestiona tres `ArrayList` (atracciones, feriantes, cuadrantes)
- Matriz 7×3 para ganancias aleatorias (100-500€) con cálculo del máximo por día

## Ejemplo de ejecución

```
MENU
1.-Muestra de precios
2.-Introducción de feriante
3.-Eliminar feriante
4.-Asociar día con atracción y feriante (cuadrante)
5.-Muestra del cuadrante anterior
6.-Muestra de ganancias de la semana
Introduzca una opción: 1

--MUESTRA DE PRECIOS--
Ticket Tio Vivo: 2.5 euros
Abono ticket Tio Vivo: 12.0 euros

Ticket Noria: 4.0 euros
Abono ticket Noria: 18.0 euros

Ticket Coches de choque: 2.5 euros
Abono ticket Coches de choque: 15.0 euros

Introduzca una opción: 6

--Máximos POR DÍA--
Día 1: máximo del día: noria = 478
Día 2: máximo del día: coches de choque = 456
...
Día 7: máximo del día: tiovivo = 389
```

## Autor

**Kaori** — DAW 2025/2026  
[GitHub](https://github.com/Mia-Kaori)
