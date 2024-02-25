import axios from "axios";

export default axios.create({
    // baseURL:'https://fc69-129-49-252-183.ngrok-free.app',
    // headers: {"ngrok-skip-browser-warning":"true"}
    baseURL: 'http://localhost:8080',
    timeout: 20000,
    headers: {"Content-type":"application/json" }
});