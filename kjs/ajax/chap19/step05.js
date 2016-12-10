//모듈을 추출 한다.
var http = require('http');
var express = require('express');

//웹 서버를 생성한다.
var app = express();
app.use(function(request, response){
    response.send('<h1>안녕하세요!</h1>');
});

//웹 서브를 실행한다.
http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});