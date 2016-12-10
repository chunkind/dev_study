/*
    요청 방식
    메서드                             의미
    GET                                자원 조회
    POST                               자원 추가
    PUT                                자원 수정
    DELETE                             자원 삭제
    HEAD                               자원의 메타 데이터 조회
    OPTIONS                            사용 가능한 요청 방식 조회
    TRACE                              테스트 목적의 데이터 조회
    CONNECT                            연결 요청
*/
var http = require('http');
var express = require('express');

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

var app = express();
app.use(express.static('public'));
app.use(express.bodyParser());
app.use(app.router);

//데이터 조회
app.get('/products', function (request, response){
    response.send(items);
});

//데이터 조회
app.get('/products/:id', function (request, response){
    var id = Number(request.param('id'));
    
    if(isNaN(id)){
        //오류 : 잘못된 경로
        response.send({
            error: '숫자를 입력 하세요.'
        });
    }else if(items[id]){
        //정상
        response.send(items[id]);
    }else{
        //오류 : 요소가 없을 경우
        response.send({
            error:'존재하지 않는 데이터 입니다.'
        });
    }
    
    response.send(items[id]);
});

//데이터 등록
app.post('/products', function (request, response){
    var name = request.param('name');
    var price = request.param('price');
    var item = {
        name : name,
        price : price
    };
    items.push(item);
    response.send({
        message: '데이터를 추가했습니다.',
        data: item
    });
});

//데이터 수정
app.put('/products/:id', function (request, response){
    var id = Number(request.param('id'));
    var name = request.param('name');
    var price = request.param('price');
    
    if(items[id]){
        //데이터 수정
        if(name){
            items[id].name = name;
        }
        if(price){
            items[id].price = price;
        }
        
        //응답
        response.send({
            message : '데이터를 수정했습니다.',
            data : items[id]
        });
    }else{
        //요소가 없을 경우
        response.send({
            error: '존재하지 않는 데이터 입니다.'
        });
    }
});

//데이터 삭제
app.del('/products/:id', function (request, response){
    var id = Number(request.param('id'));
    
    if(isNaN(id)){
        //오류 : 잘못된 경로
        response.send({
            error : '숫자를 입력하세요.'
        });
    }else if(items[id]){
        //정상 : 데이터 삭제
        items.splice(id, 1);
        response.send({
            message: '데이터를 삭제 했습니다.'
        });
    }else{
        //오류 : 요소가 없을 경우
        response.send({
            error : '존재하지 않는 데이터 입니다.'
        });
    }
});

//웹 서버를 실행
http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});








