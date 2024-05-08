document.addEventListener('DOMContentLoaded', function() {
    // Kiểm tra xem cookie có tồn tại không
    if (document.cookie) {
        var name = document.cookie.split('; ').find(row => row.startsWith('name=')).split('=')[1];
        if (name) {
            document.getElementById('greeting').innerText = 'Xin chào ' + name + '!';
        }
    }

    // Xử lý sự kiện submit form
    document.getElementById('nameForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Ngăn chặn hành vi mặc định của form
        var name = document.getElementById('name').value;
        // Lưu tên vào cookie
        document.cookie = 'name=' + encodeURIComponent(name) + '; path=/';
        alert('Tên đã được lưu vào cookie!');
    });

    // Xóa cookie khi nhấn nút
    document.getElementById('clearCookie').addEventListener('click', function() {
        document.cookie = 'name=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;';
        alert('Cookie đã được xóa!');
    });
});