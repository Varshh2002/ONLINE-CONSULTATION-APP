const BASE_API_URL="http://localhost:8082/api/v1";
export const LOGIN_URL=BASE_API_URL+ "/login";
export const REGISTER_URL=BASE_API_URL+ "/register";

export const getJSONRequestData=(data)=>{
  return{
    method:'no-cors',
    //mode:'same-origin',
    headers:{
      'Access-Control-Allow-Origin': '*',
        "Content-Type":"application/json",
    },
    body:JSON.stringify(data),
  };
};