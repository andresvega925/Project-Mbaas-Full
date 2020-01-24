var bodyparser = require('body-parser')
var express = require('express');
var app = express();

//cargar archivos routes
var createUserRoute = require('../routes/create_user_route');//importar clase de routes

//middlewares
app.use(bodyparser.urlencoded({extended:false}));
app.use(bodyparser.json());

//rutas
app.use('/',createUserRoute);//definir el path inicial y las rutas a usar 


// Configurar cabeceras y cors
app.use((req, res, next) => {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Headers', 'Authorization, X-API-KEY, Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Request-Method');
    res.header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, DELETE');
    res.header('Allow', 'GET, POST, OPTIONS, PUT, DELETE');
    next();
});

//exportar
module.exports=app;




