import User,{printName,printAge} from "./user.js";

const user = new User("Aniket",21);
console.log(user);
console.log(printAge(user));
console.log(printName(user));