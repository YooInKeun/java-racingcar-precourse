# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

* 경주할 자동차 이름을 입력받는다.
    * 이름은 쉼표(,) 기준으로 구분
    * 이름은 5자 이하만 가능
* 경주를 시도할 횟수(n)를 입력받는다.
    * 자연수만 가능
* n회 동안 경주 자동차는 전진 또는 멈춘다.
    * 0~9 사이의 랜덤 값을 구한다.
        * 4 이상이면 전진, 3 이하면 정지
    * 경주 상태를 출력한다.
        * 이름과 대시('-')를 통해 상태 표시
* 게임 종료 후, 우승자를 알려준다.