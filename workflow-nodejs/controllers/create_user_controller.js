var Create_user = require('../models/persona_model');

var Request = require("request");

Request.post({
    "headers": { "content-type": "application/json" },
    "url": "http://localhost:3000/create-user",
    "body": JSON.stringify({
        "name": "Nic",
        "lastname": "Raboy",
        "age":"12",
        "phone":"123",
        "dni":"1",
    })
}, (error, response, body) => {
    if(error) {
        return console.dir(error);
    }
    console.dir(JSON.parse(body));
});


var controller_user = {
    CreateUser: function(req, res){

        return res.status(200).send({msj:"oge"});

    }    
}

module.exports = controller_user;