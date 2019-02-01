function write(key, value) {
    window.sessionStorage[key] = value;
}

function read(key) {
    return window.sessionStorage[key];
}

function clear(){
    window.sessionStorage.clear();
}