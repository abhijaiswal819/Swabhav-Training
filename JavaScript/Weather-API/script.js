const apiKey = 'a4b888d4e7f5b7b614fed23377e20849';

function getWeather(city) {
    fetch(`http://api.weatherstack.com/current?access_key=${apiKey}&query=${city}`)
        //fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}`)
        .then(response => response.json())
        .then(data => {
            console.log(data);
            const weatherData = `
        <p><b>City:</b> ${data.location.name}, ${data.location.region}, ${data.location.country}</p>
        <p><b>Latitude:</b> ${data.location.lat}, Longitude: ${data.location.lon}</p>
        <p><b>Local time:</b> ${data.location.localtime}</p>
        <p><b>Temperature:</b> ${data.current.temperature} °C</p>
        <p><b>Feels like:</b> ${data.current.feelslike} °C</p>
        <p><b>Humidity:</b> ${data.current.humidity} %</p>
        <p><b>Wind speed:</b> ${data.current.wind_speed} km/h</p>
        <p><b>Wind direction:</b> ${data.current.wind_dir}</p>
        <p><b>Pressure:</b> ${data.current.pressure} mb</p>
        <p><b>UV index:</b> ${data.current.uv_index}</p>
        <p><b>Visibility:</b> ${data.current.visibility} km</p>
        <p><b>Cloud cover:</b> ${data.current.cloudcover} %</p>
        <p><b>Precipitation:</b> ${data.current.precip} mm</p>
        <p><b>Weather description:</b> ${data.current.weather_descriptions[0]}</p>
        <img src="${data.current.weather_icons[0]}" alt="${data.current.weather_descriptions[0]}">
        <p><b>Visibility:</b> ${data.current.visibility} km</p>
        <p><b>UV index:</b> ${data.current.uv_index}</p>
      `;
            document.querySelector('#weather-data').innerHTML = weatherData;
        })
        .catch(error => console.error(error));
}
// {/* <p>Air quality index: ${data.current.air_quality["us-epa-index"]}</p> */ }
// {/* <p>Hourly forecast: ${JSON.stringify(data.forecast.hourly)}</p> */ }
// {/* <p>Daily forecast: ${JSON.stringify(data.forecast.daily)}</p> */ }
// {/* <p><b>Sunrise:</b> ${data.current.sunrise}</p>
//         <p><b>Sunset:</b> ${data.current.sunset}</p>
//         <p><b>Pollen count (grass):</b> ${data.current.pollen_grass}</p>
//         <p><b>Pollen count (tree):</b> ${data.current.pollen_tree}</p>
//         <p><b>Pollen count (weed):</b> ${data.current.pollen_weed}</p> */}

const searchForm = document.querySelector('#search-form');
searchForm.addEventListener('submit', event => {
    event.preventDefault();
    const searchInput = document.querySelector('#search-input');
    const city = searchInput.value;
    getWeather(city);
});
