// javascript 작성
let resultSpan;
let footer;
let scoreInput;
let averageValue;
let notPassValue;
let expectedScore;


window.onload = function() {
    resultSpan = document.getElementById('resultSpan');
    footer = document.getElementById('footer');
    scoreInput = document.getElementsByClassName('scoreInput');
    averageValue = document.getElementById('average-value');
    notPassValue = document.getElementById('notPass-value');
    expectedScore = document.getElementsByClassName('expected-score');

    for (let i = 0; i < scoreInput.length; i++ ){
        scoreInput[i].addEventListener('input', function() {
            if(isNaN(scoreInput[i].value)||scoreInput[i].value == ''||scoreInput[i].value == null) {
                // 숫자가 아닌 숫자, 빈 공백, null 일때, -> 공백
                expectedScore[i].innerHTML = '';
            } else {
                let _score = parseInt(scoreInput[i].value);
                if(_score >= 0 && _score <= 20) {
                    expectedScore[i].innerHTML = '[예상점수] ' + parseInt(scoreInput[i].value) * 5 + '점';
                }
            }
        });
    }
}

function checkResult() {
    let notPass = 0;        // 과락 과목의 갯수
    let sum = 0;            // 평균을 위한 점수의 합계 값
    let isNotValid = false; // input값이 유효하지 않는 범위의 수를 갖는지 체크

    for(let i = 0; i < scoreInput.length; i++) {
        // 숫자가 아닌 값을 입력한 경우
        if (isNaN(scoreInput[i].value) || scoreInput[i].value == '' || scoreInput[i].value == null){
            alert('숫자를 입력하세요');
            footer.style.display = 'none';
            return;
        }
        let _scoreInput = parseInt(scoreInput[i].value);
        // 숫자가 유효범위 넘어간 경우
        if (_scoreInput < 0 || _scoreInput > 20) {
            isNotValid = true;
            expectedScore[i].innerHTML = null;
            continue;
        }

        sum += (_scoreInput * 5); // 합계 더하기
        if (_scoreInput < 8)
            notPass++;
    }
    if (isNotValid) { // input값이 범위 밖의 값을 가질 경우
        alert('각 과목당 맞춘 문제수(0~20)를 입력하세요');
        footer.style.display = 'none';
        return;
    };

    averageValue.innerHTML = '평균: ' + sum / 5;
    notPassValue.innerHTML = '과락된 과목 수: ' + notPass + '과목';

    // 합격, 불합격 여부 출력
    if (sum / 5 >= 60 && notPass == 0) {
        resultSpan.innerHTML = '합격';
        resultSpan.style.color = 'blue';
    } else {
        resultSpan.innerHTML = '불합격';
        resultSpan.style.color = 'red';
    }
    resultSpan.style.backgroundColor = 'gainsboro';

    // 결과창 보여주기
    footer.style.display = 'block';
}
