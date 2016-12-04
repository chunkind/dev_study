var http = require('http');
var express = require('express');

//자주 사용하는 미들웨어
var app = express();
app.use(express.logger());
app.use(express.bodyParser());
app.use(express.cookieParser());
app.use(express.session());
app.use(express.static('public'));
app.use(app.router);

http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});