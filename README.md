# sergurosAr
Java REST post, update, delete y get


## End points.

### Get: http://localhost:8081/clientes/
### Respuesta:
[
    {
        "id": 1,
        "nombre": "Juan Perez",
        "email": "juan.perez@example.com"
    },
    {
        "id": 2,
        "nombre": "Maria Garcia",
        "email": "maria.garcia@example.com"
    },
    {
        "id": 3,
        "nombre": "Nombre asegurado",
        "email": "cliente.asegurado@example.com"
    }
]

### Get: http://localhost:8081/clientes/3 (o cualquier registro id)
### Respuesta:
{
    "id": 3,
    "nombre": "Nombre asegurado",
    "email": "cliente.asegurado@example.com"
}

### Post: http://localhost:8081/clientes/
### Send: {
  "nombre": "ffff cccc",
  "email": "fffff@example.com"
}

### Respuesta: 

### Delete: http://localhost:8080/clientes/3
### Respuesta: 
