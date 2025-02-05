const { Sequelize } = require('sequelize');
require('dotenv').config();

const sequelize = new Sequelize(
    process.env.DATABASE, 
    process.env.DATASOURCE_USERNAME,
    process.env.DATASOURCE_PASSWORD, 
    {
        host: process.env.DATASOURCE_URL, 
        port: process.env.DATASOURCE_PORT, 
        dialect: 'postgres', 
        logging: false, 
    }
);

module.exports = sequelize;