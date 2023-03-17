var src = document.getElementById("one"),
display = document.getElementById("two");

src.addEventListener('input', function () {
    display.value = src.value.replace(/[^A-Za-z0-9 ]+/g, '');
});