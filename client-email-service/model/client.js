const { DataTypes } = require('sequelize');
const sequelize = require('../sequelize');

const Client = sequelize.define('Client', {
    id_client: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true,
    },
    sub: {
        type: DataTypes.STRING,
        primaryKey: true,
    },
    email: {
        type: DataTypes.STRING,
        allowNull: false,
        unique: true,
    },
    given_name: {
        type: DataTypes.STRING,
        allowNull: false,
    },
    family_name: {
        type: DataTypes.STRING,
        allowNull: false,
    },
    picture: {
        type: DataTypes.STRING,
    },
    rol: {
        type: DataTypes.STRING,
    },
}, {
    tableName: 'client',
    timestamps: false,
});
sequelize.sync();
module.exports = Client;
