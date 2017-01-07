/*
    요청 매개변수 처리하는 법.
    
    일반 요청 매개변수 확인.
    
    http://localhost:52273/parameter?name=kjs&region=bucheon
*/
var http = require('http');
var express = require('express');

//변수를 선언한다.
var items = [
    {
        name:'우유',
        price:'2000'
    },
    {
        name:'홍차',
        price:'5000'
    },
    {
        name:'커피',
        price:'5000'
    }
];

//웹 서버를 생성
var app = express();
app.use(express.static('public'));
app.use(app.router);

//라우트
/*app.all('/parameter', function (request, response){
    //변수 선언
    var name = request.param('name');
    var region = request.param('region');
    response.send('<h1>' + name + ":" + region + '</h1>');
});*/
app.all('/parameter/:id', function (request, response){
    //변수 선언
    var id = request.param('id');
    response.send('<h1>' + id + '</h1>');
});

//웹 서버를 실행
http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});








