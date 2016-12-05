'use strict'
/*
    응답과 응답 형식.
*/
var http = require('http');
var express = require('express');

//변수를 선언한다.
var items = [
    {
        name:'우유',
        price:2000
    },
    {
        name:'홍차',
        price:5000
    },
    {
        name:'커피',
        price:5000
    }
];

//웹 서버를 생성
var app = express();
app.use(express.static('public'));
app.use(app.router);

//라우트
/*
    send() 는 매개변수의 형식에 따라 아래와 같이 응답한다.
    자료형                     응답형식
    문자열                     HTML
    배열                       JSON
    객체                       JSON
    
    자주 사용하는 MIME 형식
    ContentType                                 설명
    text/plain                                  기본적인 텍스트
    text/html                                   HTML 문서
    text/css                                    CSS 문서
    text/xml                                    XML 문서
    image/jpeg                                  JPG/JPEG 그림 파일
    image/png                                   PNG 그림 파일
    video/mpeg                                  MPEG 비디오 파일
    audio/mp3                                   MP3 음악 파일
*/
app.all('/data.html',function(request, response){
    var output = '';
    output += '<!DOCTYPE html>';
    output += '<html>';
    output += '<head>';
    output += '     <title>Data HTML</title>';
    output += '</head>';
    output += '<body>';
    
    items.forEach(function(item){
        output += '<div>';
        output += '     <h1>' + item.name + '</h1>';
        output += '     <h1>' + item.price + '</h1>';
        output += '</div>';
    });
    
    output += '</body>';
    output += '</html>';
    
    response.send(output);
});

app.all('/data.json',function(request, response){
    /*
        JSON 형식으로 응답할 때는 다음과 같은 방식으로 구성 된다.
        response.type('application/json');
        response.send(JSON.stringify(output));
    */
    response.send(items);
});

app.all('/data.xml',function(request, response){
    var output = '';
    output += '<?xml version="1.0" encoding="UTF-8" ?>';
    output += '<products>';
//    items.forEach(function(item){
//        output += '<product>';
//        output += '     <name>' + item.name + '</name>';
//        output += '     <price>' + item.price + '</price>';
//        output += '</product>';
//    });
    items.map((item) => {
        output += '<product>';
        output += '     <name>' + item.name + '</name>';
        output += '     <price>' + item.price + '</price>';
        output += '</product>';
    })
    output += '</products>';
    response.type('text/xml');
    response.send(output);
});

//웹 서버를 실행
/*http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});*/

http.createServer(app).listen(52273, () => console.log('Server Running at http://127.0.0.1:52273'));








