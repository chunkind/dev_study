var http = require('http');
var express = require('express');

//자주 사용하는 미들웨어
var app = express();
app.use(express.static('public'));
app.use(function (request, response){
    response.send('<h1>404Error. check your url</h1>')
});

http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});