//모듈 추가
var http = require('http');
var express = require('express');

//웹 서버 생성
var app = express();
app.use(function(request, response, next){
    request.test = 'request.test';
    response.test = 'response.test';
    next();
});
app.use(function(request, response, next){
    response.send('<h1>' + request.test + '::' + response.test + '</h1>');
});

//웹 서버 실행
http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});