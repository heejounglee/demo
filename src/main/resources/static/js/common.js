// productApi.js 파일 내용

// 폼 제출을 처리하는 함수
function handleProductSubmit(event) {
    event.preventDefault(); // 기본 폼 제출 동작(새로고침) 막기

    const form = event.target;
    const formData = new FormData(form);
    const jsonData = Object.fromEntries(formData.entries());

    // Fetch API를 사용하여 서버의 REST API 엔드포인트에 POST 요청 보냄
    fetch('/api/member/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(jsonData), // JSON 형태로 변환하여 전송
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('네트워크 응답이 올바르지 않습니다.');
        }
        return response.json();
    })
    .then(data => {
        alert('성공적으로 처리되었습니다: ' + data.name);
        // 등록 후 상품 목록 페이지로 이동
        window.location.href = '/loginForm.html';
    })
    .catch(error => {
        console.error('Error:', error);
        alert('처리 중 오류가 발생했습니다.');
    });
}

// 이 함수를 외부(HTML)에서 사용할 수 있도록 window 객체에 등록하거나 export 할 수 있습니다.
// 여기서는 window에 등록하는 간단한 방식을 사용합니다.
window.handleProductSubmit = handleProductSubmit;
