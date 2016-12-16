/*var output = "";
for(var i=0; i<10; i++){
    console.log(output+= '*');
}*/

//모듈을 추출합니다.
var os = require('os');

//속성을 출력합니다.
console.log("운영체제의 호스트 이름을 리턴.");
console.log(os.hostname());
console.log("운영체제의 이름을 리턴.");
console.log(os.type());
console.log("운영체제의 플랫폼을 리턴.");
console.log(os.platform());
console.log("운영체제의 아키텍처를 리턴.");
console.log(os.arch());
console.log("운영체제의 버전을 리턴.");
console.log(os.release());
console.log("운영체제가 실행된 시간을 리턴.");
console.log(os.uptime());
console.log("로드 에버라지 정보를 담은 배열을 리턴.");
console.log(os.loadavg());
console.log("시스템의 총 메모리를 리턴.");
console.log(os.totalmem());
console.log("시스템의 사용 가능한 메모리를 리턴.");
console.log(os.freemem());
console.log("CPU의 정보를 담은 객체를 리턴.");
console.log(os.cpus());
console.log("네트워크 인터페이스의 정보를 담은 배열을 리턴.");
console.log(os.getNetworkInterfaces());