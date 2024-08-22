fetch('https://labs.goo.ne.jp/api/hiragana', {
  method: 'POST', // HTTP 메서드 지정
  headers: {
    'Content-Type': 'application/json', // 헤더 설정
  },
  body: JSON.stringify({ // 요청 바디 설정
    app_id:"[app_id]",
    "request_id":"record003",
    "sentence":"漢字が混ざっている文章",
    "output_type":"hiragana"
  })
})
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok ' + response.statusText);
    }
    return response.json(); // JSON 형식으로 변환
    // /
    /*
    {
      "request_id":"record003",
      "output_type":"hiragana",
      "converted":"かんじが まざっている ぶんしょう"
    }
    
    */
  })
  .then(data => {
    console.log(data); // 데이터를 처리
  })
  .catch(error => {
    console.error('There has been a problem with your fetch operation:', error);
  });

