const WebSocket = require('ws');
const Client = require('./model/client');
require('dotenv').config();

let ws;

function connectWebSocket() {
    ws = new WebSocket(process.env.WEBSOCKET_URL);

    ws.on('open', () => {
        console.log('Connected to WebSocket server');
        ws.send(JSON.stringify({ event: 'subscribe', topic: 'check_registration' }));
    });

    ws.on('message', async (message) => {
        console.log('Message received:', message);

        try {
            const parsedMessage = JSON.parse(message);
            if (parsedMessage.topic === 'check_registration') {
                const email = parsedMessage.email;

                const clients = await Client.findAll({ where: { email } });
                const isClient = clients.length > 0;

                ws.send(JSON.stringify({
                    topic: 'verification_registration',
                    event: 'check',
                    email,
                    isClient
                }));
            }
        } catch (error) {
            console.error('Error processing message:', error);
        }
    });

    ws.on('close', () => {
        console.log('Disconnected from WebSocket server. Reconnecting in 1 minute...');
        setTimeout(connectWebSocket, 6000); 
    });

    ws.on('error', (error) => {
        console.error('WebSocket error:', error);
        console.log('Reconnecting in 1 minute...');
        setTimeout(connectWebSocket, 60000); 
    });
}

connectWebSocket();
