### 옵저버 패턴 학습
CPU의 사용량의 따른 알림을 받아 파워컨트롤러와 모니터링 시스템이 각각 처리하는 예제

1. CPU 사용량 체크하는 객체 생성
2. 파워컨트롤러 객체 생성하여 CPU 사용량 구독
3. 모니터링 시스템 객체 생성하여 CPU 사용량 구독

### 예제 사용법
#### build
``` ./gradlew clean build ```

#### run
``` java -jar build/libs/observer-1.0-SNAPSHOT.jar ```

PowerSupplyController :: 누진세 붙기전에 전기 공급 줄이자.

SystemMonitorDisplay :: 정상

PowerSupplyController :: cpu가 갑자기 폭주했다!! 전력을 더 공급하자!

SystemMonitorDisplay :: 비상 비상

PowerSupplyController :: 누진세 붙기전에 전기 공급 줄이자.

SystemMonitorDisplay :: 정상
