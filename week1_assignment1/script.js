


document.addEventListener('DOMContentLoaded', () => {
    if (document.getElementById('crypto-data')) {
        document.getElementById('crypto-select').addEventListener('change', fetchCryptoData);
        fetchCryptoData(); 
    }
    if (document.getElementById('weather-data')) {
        document.getElementById('city-select').addEventListener('change', fetchWeatherData);
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
        document.getElementById('crypto-data').innerText = `Error: ${error.message}`;
    }
}

async function fetchWeatherData() {
    const apiKey = 'a2f02ec8835afaf19e04e8015d97a590';
    const city = document.getElementById('city-select').value;
    try {
        const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`);
        if (!response.ok) {
            throw new Error('Failed to fetch weather data');
        }
        const data = await response.json();
        displayWeatherData(data);
    } catch (error) {
        document.getElementById('weather-data').innerText = `Error: ${error.message}`;
    }
}

async function fetchNewsData() {
    const apiKey = '9888c8541ae04437ad10cc67a3a766f7'
    const country = document.getElementById('country-select').value;
    try {
        const response = await fetch(`https://newsapi.org/v2/top-headlines?country=${country}&apiKey=${apiKey}`);
        if (!response.ok) {
            throw new Error('Failed to fetch news data');
        }
        const data = await response.json();
        displayNewsData(data);
    } catch (error) {
        document.getElementById('news-data').innerText = `Error: ${error.message}`;
    }
}

function displayCryptoData(data, crypto) {
    document.getElementById('crypto-data').innerHTML = `
        <p>${crypto} (USD): $ ${data[crypto].usd}</p>
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
    const topArticles = data.articles.slice(0, 5);
    
    
    let html = '';
    for (let i = 0; i < topArticles.length; i++) {
        const article = topArticles[i];
        html += `
            <div class="news-container">
                <h3>${article.title}</h3>
                <p>${article.author}</p>
            </div>
        `;
    }
    
    
    document.getElementById('news-data').innerHTML = html;
}

