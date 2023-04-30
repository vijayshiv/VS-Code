let a = fetch("https://goweather.herokuapp.com/weather/Ny")
a.then((value)=>{
    return value.json()
})
.then((value) =>{
    console.log(value)
})