var express = require('express');
var ControllerCreateUserRoute = require('../controllers/create_user_controller')
var router = express.Router();



router.post('/create-user',ControllerCreateUserRoute.CreateUser);


module.exports = router;