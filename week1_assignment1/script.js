document.addEventListener('DOMContentLoaded', () => {
    if (document.getElementById('crypto-data')) {
        document.getElementById('crypto-select').addEventListener('change', fetchCryptoData);
        fetchCryptoData(); 
    }
    if (document.getElementById('weather-data')) {
        document.getElementById('SelectCity').addEventListener('onClick', fetchWeatherData);
        fetchWeatherData(); 
    }
    if (document.getElementById('news-data')) {
        document.getElementById('country-select').addEventListener('change', fetchNewsData);
        fetchNewsData();
    }
});

async function fetchCryptoData() {
    const crypto = document.getElementById('crypto-select').value;
    try {
        const response = await fetch(`https://api.coingecko.com/api/v3/simple/price?ids=${crypto}&vs_currencies=usd`);
        if (!response.ok) {
            throw new Error('Failed to fetch cryptocurrency data');
        }
        const data = await response.json();
        displayCryptoData(data, crypto);
    } catch (error) {
        handleError('crypto-data', error);
    }
}

async function fetchWeatherData() {
    const apiKey = '';
    const city = document.getElementById('city-select').value;
    try {
        const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`);
        if (!response.ok) {
            throw new Error('Failed to fetch weather data');
        }
        const data = await response.json();
        displayWeatherData(data);
    } catch (error) {
        handleError('weather-data', error);
    }
}

async function fetchNewsData() {
    const apiKey = 'your_newsapi_api_key';
    const country = document.getElementById('country-select').value;
    try {
        const response = await fetch(`https://newsapi.org/v2/top-headlines?country=${country}&apiKey=${apiKey}`);
        if (!response.ok) {
            throw new Error('Failed to fetch news data');
        }
        const data = await response.json();
        displayNewsData(data);
    } catch (error) {
        handleError('news-data', error);
    }
}

function displayCryptoData(data, crypto) {
    document.getElementById('crypto-data').innerHTML = `
        <p>${crypto.charAt(0).toUpperCase() + crypto.slice(1)} (USD): $${data[crypto].usd}</p>
    `;
}

function displayWeatherData(data) {
    document.getElementById('weather-data').innerHTML = `
        <p>City: ${data.name}</p>
        <p>Temperature: ${data.main.temp} °C</p>
        <p>Weather: ${data.weather[0].description}</p>
    `;
}

function displayNewsData(data) {
    const newsData = data.articles.slice(0, 5).map(article => `
        <p><strong>${article.title}</strong><br>${article.description}</p>
    `).join('');
    document.getElementById('news-data').innerHTML = newsData;
}

function handleError(elementId, error) {
    document.getElementById(elementId).innerText = `Error: ${error.message}`;
}
