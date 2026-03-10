let id = setInterval(() => {
    console.log("hello anjeet");
}, 2000);

setTimeout(() => {
    clearInterval(id);
}, 1000);