package cardGame;

import javax.swing.*;

public class CardSet extends JButton {
    /*
    ### 컨셉 ###
    화투패는 1~12월로 분류되고 각 월당 4장, 4장 x 12월 48장
    48장 중 짝과 상관없이 랜덤하게 24장을 추출하여 짝맞추기 게임
    남아있는 패 중 맞출 수 있는 짝이 없다면 게임 종료

    1. 고스톱의 규칙을 적용해서 점수를 계산하는 규칙도 만들어보기
    2. 지난시간에 했던 스탑워치를 적용해서 클리어한 시간을 점수계산에 반영하여 정밀한 점수 산출
    //////////////////////////

    ### 해결포인트 ###
    1. 48장의 패를 어떤 규칙으로 구분할것인가???
    2. 짝 일치 여부를 어떻게 판단할 것인가??
    3. 고스톱의 점수계산 규칙을 어떻게 구현할 것인가??
    4. CSS와 같은 정밀한 애니메이션 구현이 가능한가??? Y축회전 가능?
    /////////////////////////


    ### 생각1 ###
    각 4장단위로 그룹이 생기니까
    0~47의 인식코드를 부여하고, 4로 나눈 몫이 같은 것은 같은 쌍에 속하겠지?
    ==> 1부터 시작하면 1,2,3과 4의 몫이 달라지니까 0부터 시작하는게 맞을듯 ==> 굳

    각 그룹의 1~2번은 광,단,동물패에 해당하는 특수패고, 3~4번은 일반패로 분류(일부 월 제외)
    위의 규칙과 유사하게 4로 나눈 나머지에 따라 패의 종류를 구분할수 있을듯? ==> 천재
    /////////////////////////


    ### 아이디어 ###
    XXXXXX 변수 이름에 함수를 넣는 방법이 있는지?? 없을듯?
    XXXXXXXX String으로 각 패의 정보를 규칙을 정해서 넣고 검사해서 불러오기??
    OOOOOOOO 고도리, 광, 피, 어쩌구 하는 규칙들 구현하면 재밌을듯 찾아보기
s

    /////////////////////////////////////////////////////////////////////////



   */

    int cNum; //카드 넘버
//    boolean attG; // 광 성질을 갖는가?
//    boolean attL; // 띠 성질을 갖는가?
//    boolean attA; // 동물패 성질을 갖는가?
//    boolean attB; // 고도리(새) 성질을 갖는가?
    String path = String.format("./src/cardGame/images/%d.png",cNum);
    ImageIcon img = new ImageIcon(path);
}
