require('dotenv').config();
const { Client } = require('pg');

async function connectToPostgreSQL() {
    try {
        const client = new Client({
            host: process.env.DATASOURCE_URL,
            port: process.env.DATASOURCE_PORT,
            user: process.env.DATASOURCE_USERNAME,
            password: process.env.DATASOURCE_PASSWORD,
            database: process.env.DATABASE
        });

        await client.connect();
        console.log('Successfully connected to PostgreSQL');
        return client;
    } catch (error) {
        console.error('Connection error:', error);
        throw new Error('Could not connect to the database');
    }
}

module.exports = { connectToPostgreSQL };